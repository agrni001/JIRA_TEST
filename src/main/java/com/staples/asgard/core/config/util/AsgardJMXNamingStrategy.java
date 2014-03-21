/**
 * 
 */
package com.staples.asgard.core.config.util;

import java.util.Hashtable;

import javax.management.MalformedObjectNameException;
import javax.management.ObjectName;

import org.springframework.aop.support.AopUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.jmx.export.naming.ObjectNamingStrategy;
import org.springframework.jmx.support.ObjectNameManager;
import org.springframework.util.ClassUtils;

import com.google.common.base.Preconditions;

/**
 * @author ubud
 *
 */
public class AsgardJMXNamingStrategy implements ObjectNamingStrategy,
		 ApplicationContextAware {

	private String functionalModuleName;
	
	private ApplicationContext applicationContext;
	/**
	 * 
	 */
	public AsgardJMXNamingStrategy( ) {
		 super();
	}
 
	/* (non-Javadoc)
	 * @see org.springframework.jmx.export.naming.ObjectNamingStrategy#getObjectName(java.lang.Object, java.lang.String)
	 */
	@Override
	public ObjectName getObjectName(Object managedBean, String beanKey)
			throws MalformedObjectNameException {
		Class managedClass = AopUtils.getTargetClass(managedBean);
        String domain = ClassUtils.getPackageName(managedClass);

        Hashtable<String, String> properties = new Hashtable<>();
        properties.put("type", ClassUtils.getShortName(managedClass));
        properties.put("name", beanKey);
        // ensure the application name is included as a property in the object name
        properties.put("app", applicationContext.getApplicationName());
        return ObjectNameManager.getInstance(domain, properties);
	}

	public String getFunctionalModuleName() {
		return functionalModuleName;
	}

	public void setFunctionalModuleName(String functionalModuleName) {
		this.functionalModuleName = functionalModuleName;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.applicationContext=applicationContext;
		
	}

	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}

}
