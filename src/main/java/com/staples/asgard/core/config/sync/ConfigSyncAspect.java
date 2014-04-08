package com.staples.asgard.core.config.sync;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.MethodUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.staples.asgard.core.config.service.ConfigService;
import com.staples.asgard.core.config.util.ConfigUtil;

/**
 * Aspect that will update mongo when the annotated class @ConfigEnabled has an
 * update performed on one of its setter methods
 * 
 * @author Staples
 * 
 */
@Aspect
@Component
public class ConfigSyncAspect {

	private static final Logger log = LoggerFactory.getLogger(ConfigSyncAspect.class);

	@Autowired
	private ConfigService configService;

	/**
	 * <p>
	 * Execute for any @ConfigEnabled setter in the com.staples.asgard package.
	 * </p>
	 * 
	 * <p>
	 * Using @target to limit matching to join points where the class of the
	 * executing object has an annotation of the given type @ConfigEnabled.
	 * </p>
	 * 
	 * <p>
	 * Using @annotation to limit to join point where the executing method has
	 * an @ManagedAttribute annotation
	 * </p>
	 * 
	 * <p>
	 * This method expects the field name being updated to match the setter
	 * being called. 
	 * </p>
	 * 
	 * <p>
	 * Ex. setActiveStatus has to have a appConfig.configKey=ActiveStatus
	 * </p>
	 * 
	 * <p>
	 * This method will remove the "set" portion of the setter name and use the
	 * rest as the field name.
	 * </p>
	 * 
	 * @param jp
	 */
	@AfterReturning("execution(* com.staples.asgard..set*(..)) and @target(com.staples.asgard.core.config.annotation.ConfigEnabled) and @annotation(org.springframework.jmx.export.annotation.ManagedAttribute)")
	public void sync(JoinPoint jp) {

		boolean bSuccess = false;

		// get all arguments
		Object[] args = jp.getArgs();

		// we know that we are dealing with a setting with a single param, so
		// only get first argument
		Object fieldValue = args[0];

		// get the proxied object
		Object proxyObject = jp.getThis();

		Signature signature = jp.getSignature();

		// Get the field name that is being updated. This matches the configKey
		// in Mongo
		String signatureName = signature.getName();

		// remove the "set" portion of this for an exact match
		String fieldName = signatureName.substring(3);

		// Get the server identifier
		String currentServerId = ConfigUtil.getServerId();

		try {
			// get the bean identifier from the proxy object using the
			// getBeanId() method
			Object beanId = MethodUtils.invokeExactMethod(proxyObject, "getBeanId", new Object[] {});

			if (log.isDebugEnabled()) {
				log.debug("sync(fieldName, fieldValue, serverId, beanId) " + fieldName + "; " + fieldValue + "; "
				        + currentServerId + "; " + beanId);
			}

			// TODO this method needs to be updated to pass in the user
			// performing
			// the update
			bSuccess = configService.updateBeanConfiguration(currentServerId, String.valueOf(beanId), fieldName,
			        String.valueOf(fieldValue));

			if (!bSuccess) {
				log.error("Sync failed, bean not found! sync(fieldName, fieldValue, serverId, beanId) " + fieldName
				        + "; " + fieldValue + "; " + currentServerId + "; " + beanId);
			}

		} catch (NoSuchMethodException e) {
			log.error(e.getMessage());
		} catch (IllegalAccessException e) {
			log.error(e.getMessage());
		} catch (InvocationTargetException e) {
			log.error(e.getMessage());
		}

		if (log.isDebugEnabled()) {
			log.debug("Update successful? " + bSuccess);
		}

	}
}
