package com.staples.asgard.core.config.repository;

import java.util.List;

import com.staples.asgard.core.config.model.AppConfig;
import com.staples.asgard.core.exceptions.DatabaseException;

/**
 * This interface is having set of methods for Configuration Dao
 * 
 * @author Sapient
 * 
 */
public interface ConfigRepository {

	/**
	 * This method retrieves all the records from the DataBase
	 * 
	 * @return List<AppConfig>
	 * @throws DatabaseException
	 */
	public List<AppConfig> getAllAppConfig();
	
	/**
	 * This method retrieves all the records from the DataBase for the server id
	 * 
	 * @param serverId
	 * @return List<AppConfig>
	 * @throws DatabaseException
	 */
	public List<AppConfig> getAllConfigForServerId(final String serverId);

	/**
	 * This method clones all the config beans of the DEFAULT_SERVERID to the current ServerId 
	 * 
	 * @param serverId
	 * @return boolean
	 * @throws DatabaseException
	 */
	public boolean handleFirstTimeLoad(final String serverId);
	
	/**
	 * This method inserts new records for first time load in case additional scenarios
	 * where new Config key or new Bean details are added to DEFAULT SERVER 
	 * 
	 * @param listOfConfigDetailsForDefaultServer
	 * @param mapOfConfigDetailsToInsert
	 * @param beanName
	 * @return boolean
	 * @throws DatabaseException
	 */
	public boolean handleFirstTimeLoadEachBeanAndKeys(final List<AppConfig> listOfConfigDetailsForDefaultServer);	
	
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
	 * This method retrieves all the records from the DataBase for the mentioned serverId and beanId
	 * 
	 * @param serverId
	 * @return List<AppConfig>
	 * @throws DatabaseException
	 */
	public List<AppConfig> getAllConfigDetailsForBeanId(final String serverId, final String beanId);	
	
	/**
	 * This method deletes all the records from the DataBase for the Test serverId. This is for Junit purpose
	 * 
	 * @param serverId
	 * @return List<AppConfig>
	 * @throws DatabaseException
	 */
	public boolean deleteConfigDetails(final String serverId);	
	/**
	 * This method deletes all the records from the DataBase for the Test serverId. This is for Junit purpose
	 * 
	 * @param serverId
	 * @return List<AppConfig>
	 * @throws DatabaseException
	 */
	public boolean insertConfigDetails(final String serverId, final List<AppConfig> listOfConfigDetailsToInsert);		
	
}
