package com.staples.asgard.core.config.loader;

import static com.staples.asgard.core.constants.ErrorConstants.ERROR_FW0002;
import static com.staples.asgard.core.constants.ErrorConstants.ERROR_FW0005;
import static com.staples.asgard.core.constants.ErrorConstants.ERROR_FW0006;
import static com.staples.asgard.core.constants.ErrorConstants.ERROR_FW0007;
import static com.staples.asgard.core.constants.ErrorConstants.ERROR_FW0008;
import static com.staples.asgard.core.constants.ErrorConstants.ERROR_FW0009;
import static com.staples.asgard.core.constants.GlobalConstants.DEFAULT_SERVER_ID;
import static com.staples.asgard.core.constants.GlobalConstants.IS_INITIALIZED;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.staples.asgard.core.config.annotation.ConfigAttribute;
import com.staples.asgard.core.config.annotation.ConfigEnabled;
import com.staples.asgard.core.config.annotation.InitializedAttribute;
import com.staples.asgard.core.config.model.AppConfig;
import com.staples.asgard.core.config.service.ConfigService;
import com.staples.asgard.core.config.util.ConfigUtil;
import com.staples.asgard.core.exceptions.DatabaseException;

/**
 * 
 * Configuration Loader Class loads FSA and application configurations from
 * database and populates Configuration beans with fetched values. These
 * configuration beans are created and fetched by implementing
 * BeanPostProcessor. It also manages the intelligence of very first time server
 * start load and and first time load additional scenarios and populating
 * necessary configurations for the current server by copying it from default
 * configuration values.
 * 
 * @author Sapient
 */
public class ConfigLoader implements BeanPostProcessor {

	private static final Logger log = LoggerFactory.getLogger(ConfigLoader.class);

	private boolean isFirstTimeLoadHandled = false;

	private ConfigService configService;

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}
	
	/**
	 * 	 1. When first time this method is invoked, it is checked if the bean is ConfigEnabled
	 *	 2. If "No" then just returns the bean
	 *   3. If "Yes" then
	 *   4.		Check if there are any records in APP_CONFIG table in database,
	 *   5.     If "No" means configuration Beans cannot be populated, therefore Runtime Exception will be thrown
	 *   6.	    If "Yes" then 
	 *				a. Handle First Time Load Scenario 
	 *					i. If "isFirstTimeLoadHandled" is false then handle First Time Load Scenario is called and "isFirstTimeLoadHandled" is set to true
	 *					ii. If "isFirstTimeLoadHandled" is set to true then handle First Time Load is already taken care.
	 *							 Now we need to check for additational scenario
	 *						+ If there are new configuration key added to DEFAULT_SERVER id for the bean then the same need to be updated
	 *						  to the Current Server id for that bean
	 *						+ Get the list of all configuration details for the DEFAULT_SERVER and current server id for the bean
	 *						+ If the DEFAULT_SERVER list size and current server id list size differs 
	 *							- If "Yes" then
	 *								> From the current server id list fetch only the configuration key and configuration value from the list and prepare a Map
	 *								> Iterate through the list of DEFAULT_SERVER
	 *								> If the DEFAULT_SERVER id list contains configuration key of the current server id then remove the whole object from the list
	 *								> Now the DEFAULT_SERVER id list contains only those configuration key which need to be newly inserted into DataBase 
	 *						+ If the current server id list size is ZERO and DEFAULT_SERVER list not empty
	 *							- If "Yes" then
	 *								> inserted all the DEFAULT_SERVER id list into DataBase 
	 *				b. 
	 *					i. Invoke the isInitialized() method for the bean
	 *						1. If "true" which means already the properties for the bean is updated in Database
	 *						2. If "false" then
     *						    - Fetch all the configuration key and configuration value for that bean from the Database and append it to the Map
	 *						    - Get all the declared fields for the bean
	 *							- Traverse through each declared field of the bean and check if the field is @ConfigAttribute
	 *								+ If "Yes" 
	 *									then read the corresponding map key for that field and reset that field
	 *								+ If "No"
	 *									then assign the field to initializedField
	 *							- Set initializedField to "true" which means field is updated in Database
	 *
     */ 
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		
		/**
		 * 1. When first time this method is invoked handle First Time Load Scenario and set flag isFirstTimeLoadHandled = true
		 * 
		 * 2. Check if flag "allConfigBeansInitialized" is false then check for beans which are annotated with custom annotation 
		 * @ConfigEnabled All beans without this annotations will be returned as it is
		 * 
		 * 3. When the first annotated bean is found, load all values for all beans from database and cache it in hashmap
		 * 
		 * 4. Set properties of all these beans with database found values
		 * 
		 * 5. Once all beans properties are populated, set flag allConfigBeansInitialized = true. 
		 * 
		 */
		/* If bean is @ConfigEnabled then process */
		if (bean.getClass().isAnnotationPresent(ConfigEnabled.class) && null!=ConfigUtil.getServerId()) {
			log.info("In postProcessAfterInitialization() processing Config Enabled Bean");
			
			List<AppConfig> listOfConfigsForDefaultServer = configService.getAllConfigDetailsForBeanId(DEFAULT_SERVER_ID, beanName);
				
			/* If there are records in AppConfig table then proceed further */
			if (null != listOfConfigsForDefaultServer && listOfConfigsForDefaultServer.size() > 0) {
				log.info("\nIn postProcessAfterInitialization() : There are records in table");
				
		
				/* handle first time load */
				if (!isFirstTimeLoadHandled) {
					// handle First Time Load Scenario
					String currentServerId = ConfigUtil.getServerId();
					log.info("In postProcessAfterInitialization() : Current JVM Server Id from System Env : {}", currentServerId);
						
					configService.handleFirstTimeLoad(currentServerId);
					isFirstTimeLoadHandled = true;
				}
									
				/* additional scenario to handle first time load 
				 * 1. If the DEFAULT_SERVER has new configuration key and value for the current bean id
				 * 2. If the DEFAULT_SERVER has new bean id which is not their with the server id
				 */
				List<AppConfig> listOfConfigsForCurrentServer = configService.getAllConfigDetailsForBeanId(ConfigUtil.getServerId(), beanName); 		
					
				log.info("Config Details size for {} server id is {}", ConfigUtil.getServerId(), listOfConfigsForCurrentServer.size());
				log.info("Config Details size for {} server id is {}", DEFAULT_SERVER_ID, listOfConfigsForDefaultServer.size());	
	
				/* 1. scenario */
				if (null != listOfConfigsForCurrentServer
						&& listOfConfigsForCurrentServer.size() > 0
						&& listOfConfigsForCurrentServer.size() != listOfConfigsForDefaultServer.size()) {
					insertConfigDetails(listOfConfigsForCurrentServer, listOfConfigsForDefaultServer);
				} 
					
				/* 2. scenario */
				if (null != listOfConfigsForCurrentServer
						&& listOfConfigsForCurrentServer.size() == 0 && null != listOfConfigsForDefaultServer) {
					insertConfigDetailsDefaultServer(listOfConfigsForDefaultServer);
				}

				try {
					Class noparams[] = {};
					Method method = bean.getClass().getDeclaredMethod(IS_INITIALIZED, noparams);
	
					/* make a call to initialized() method of bean class which indicates none of the fields are updated with the latest value */
					if (!(Boolean) method.invoke(bean.getClass().newInstance(), null)) {
	
						/* fetch all the data for the bean from the DataBase */
						log.info("In postProcessAfterInitialization() : BeanName :: {}", beanName);
						
						Map<String, String> mapOfConfigDetails;
	
						mapOfConfigDetails = fetchConfigDetailsFromList(listOfConfigsForCurrentServer);
						log.info("In postProcessAfterInitialization() : There is/are {} property for bean {} from DataBase", mapOfConfigDetails.size(), beanName);
	
						Field[] allFields = bean.getClass().getDeclaredFields();
						log.info("In postProcessAfterInitialization() : Totally there is/are {} fields in {}", allFields.length, bean.getClass());
	
						Field initializedField = null;
								
						/* if there is no data in database to set then don't enter the loop */
						if (null != mapOfConfigDetails && mapOfConfigDetails.size() > 0) {
	
							for (Field field : allFields) {
										
								/* If field is @ConfigAttribute enabled then allow to update the fields 
								 * If field is @InitializedAttribute enabled then set it to true which indicates fields are initialized with latest value
								 */
								if (field.isAnnotationPresent(ConfigAttribute.class)) {
									field.setAccessible(true);
	
									/* before setting the field test for which class it belongs to and convert it to the respective type */
									if (field.getType().isAssignableFrom(String.class) && null != mapOfConfigDetails.get(field.getName())) {
										field.set(bean, mapOfConfigDetails.get(field.getName()));										
									} else if (field.getType().isAssignableFrom(int.class) && null != mapOfConfigDetails.get(field.getName())) {
										field.set(bean, Integer.parseInt(mapOfConfigDetails.get(field.getName()).toString()));
									}
											
								} else if (field.isAnnotationPresent(InitializedAttribute.class)) {
									field.setAccessible(true);
									initializedField = field;
								}
							}// end of inner for loop
	
							if (null != initializedField) {
								initializedField.setAccessible(true);
								initializedField.set(bean, true);
							}
						} //end of if loop
					}
				} catch (IllegalArgumentException e) {					
					log.error("{} : {}", ERROR_FW0005, e);
					throw new RuntimeException(ERROR_FW0005.getCode(), e);
				} catch (IllegalAccessException e) {
					log.error("{} : {}", ERROR_FW0006, e);
					throw new RuntimeException(ERROR_FW0006.getCode(), e);
				} catch (NoSuchMethodException e) {
					log.error("{} : {}", ERROR_FW0007, e);
					throw new RuntimeException(ERROR_FW0007.getCode(), e);
				} catch (InvocationTargetException e) {
					log.error("{} : {}", ERROR_FW0008, e);
					throw new RuntimeException(ERROR_FW0008.getCode(), e);						
				} catch (InstantiationException e) {
					log.error("{} : {}", ERROR_FW0009, e);
					throw new RuntimeException(ERROR_FW0009.getCode(), e);						
				}					
			} else {
				log.error("\nIn postProcessAfterInitialization() : There are no  configurations found for the Bean {} for DEFAULT SERVER. "
						+ "Therefore, config bean cannot be populated. Insert data in Mongo DB for this bean to proceed further", beanName);
				throw new RuntimeException(ERROR_FW0002.getCode());
			}			
		}		
		return bean;		
	}
	

	/**
	 * Retrieves all the records from the DataBase
	 * 
	 * @return List
	 * @throws DatabaseException
	 */
	public List<AppConfig> getAllAppConfig() {

		List<AppConfig> listOfConfigDetails = configService.getAllAppConfig();
		return listOfConfigDetails;
	}

	/**
	 * Returns Map of Config Key and Config Value from the list of serverId
	 * 
	 * @param listOfConfigDetails
	 * @return Map
	 * @throws DatabaseException
	 */
	public Map<String, String> fetchConfigDetailsFromList(final List<AppConfig> listOfConfigDetails) {
		Map<String, String> mapOfConfigDetails = new HashMap<String, String>();

		for (AppConfig config : listOfConfigDetails) {
			mapOfConfigDetails.put(config.getConfigKey(),
					config.getConfigValue());
		}

		return mapOfConfigDetails;
	}
	
	/**
	 * Insert record into DataBase if the DEFAULT_SERVER id has new bean id which is not their with the server id
	 * 
	 * @param beanId
	 * @return Map
	 * @throws DatabaseException
	 */
	public boolean insertConfigDetailsDefaultServer(final List<AppConfig> listOfConfigsForDefaultServer) {
		
		log.info("We have {} new records to insert while performing First Time Load scenerio 2:", listOfConfigsForDefaultServer.size());
		if (null != listOfConfigsForDefaultServer && listOfConfigsForDefaultServer.size() > 0) {
			configService.insertBeanConfiguration(listOfConfigsForDefaultServer);
			return true;
		}				
		return false;
	}
	
	/**
	 * Insert record into DataBase if the DEFAULT_SERVER has new configuration key and value for the current bean id
	 * 
	 * @param beanId
	 * @return Map
	 * @throws DatabaseException
	 */
	public boolean insertConfigDetails(final List<AppConfig> listOfConfigsForCurrentServer, final List<AppConfig> listOfConfigsForDefaultServer) {
	
		Map<String, String> mapOfConfigDetailsForCurrentServer = fetchConfigDetailsFromList(listOfConfigsForCurrentServer);
								
		for (Iterator<AppConfig> iterator = listOfConfigsForDefaultServer.iterator(); iterator.hasNext(); ) {
			AppConfig config = iterator.next();
			if(null!=mapOfConfigDetailsForCurrentServer && null != mapOfConfigDetailsForCurrentServer.get(config.getConfigKey())) {
				iterator.remove();
			}
		}
		log.info("We have {} new records to insert while performing First Time Load scenerio 1 :", listOfConfigsForDefaultServer.size());
		
		if (null != listOfConfigsForDefaultServer && listOfConfigsForDefaultServer.size() > 0) {
			configService.insertBeanConfiguration(listOfConfigsForDefaultServer);
			return true;
		}	
		return false;
	}
	
	/**
	 * @return the configService
	 */	
	public ConfigService getConfigService() {
		return configService;
	}

	/**
	 * @param configService the configService to set
	 */	
	public void setConfigService(ConfigService configService) {
		this.configService = configService;
	}

}