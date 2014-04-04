package com.staples.asgard.core.config.service;

import java.util.List;

import com.staples.asgard.core.config.model.AppConfig;
import com.staples.asgard.core.exceptions.DatabaseException;

/**
 * This interface is having set of methods for Configuration Service
 * 
 * @author Sapient
 * 
 */
public interface ConfigService {
	
	/**
	 * This method retrieves all the records from the DataBase
	 * 
	 * @return List<AppConfig>
	 * @throws DatabaseException
	 */
	public List<AppConfig> getAllAppConfig();

	/**
	 * This method update bean config value for the specific key
	 * 
	 * @param beanId	 
	 * @param configKey
	 * @param configValue  
	 * @return boolean
	 * @throws DatabaseException
	 */	
	public boolean updateBeanConfiguration(final String serverId, final String beanId, final String configKey, final String configValue);	
	
	/**
	 * This method inserts new records for first time load additional scenario
	 * 
	 * @param listOfConfigDetailsForDefaultServer	 
	 * @param mapOfConfigDetailsToInsert
	 * @param beanName  
	 * @throws DatabaseException
	 */	
	public boolean insertBeanConfiguration(final List<AppConfig> listOfConfigDetailsToInsert);	
	
	/**
	 * This method fetches all the current ServerID if not found then updates all DEFAULT_SERVERIDs with the current ServerID
	 * 
	 * @param currentServerId	 
	 * @throws DatabaseException
	 */		
	public void handleFirstTimeLoad(final String currentServerId);
	
	/**
	 * This method retrieves all the records from the DataBase for the specific server id
	 * 
	 * @param serverId
	 * @return List<AppConfig>
	 * @throws DatabaseException
	 */
	public List<AppConfig> getAllConfigDetailsForBeanId(final String serverId, final String beanId) ;
}
