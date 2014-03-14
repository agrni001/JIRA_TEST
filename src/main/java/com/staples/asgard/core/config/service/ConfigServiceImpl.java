package com.staples.asgard.core.config.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.staples.asgard.core.config.model.AppConfig;
import com.staples.asgard.core.config.repository.ConfigRepository;
import com.staples.asgard.core.config.util.ConfigUtil;

/**
 * This is the implementation class for Configuration Service which handles
 * communication to DAO layer and any business logic
 * 
 * @author Sapient
 */
@Service
public class ConfigServiceImpl implements ConfigService {
	
	private static final Logger log = LoggerFactory.getLogger(ConfigServiceImpl.class);
	
	@Autowired
	private ConfigRepository configDao;

	/**
	* {@inheritDoc}
	*/
	@Override
	public List<AppConfig> getAllAppConfig() {			
		List<AppConfig> listOfAllAppConfigs = configDao.getAllAppConfig();			
		
		return listOfAllAppConfigs;
	}	

	/**
	* {@inheritDoc}
	*/
	@Override
	public boolean updateBeanConfiguration(final String serverId, final String beanId, final String configKey, final String configValue) {		
		if(configDao.updateBeanConfiguration(serverId, beanId, configKey, configValue)) {					
			return true;
		}
			
		return false;
	}

	/**
	* {@inheritDoc}
	*/
	@Override
	public void handleFirstTimeLoad(final String currentServerId) {		
		boolean updateResult= false;
		
		/* Retrieve all the data from the DataBase for the current Server ID */
		List<AppConfig> listOfCurrentServerId = configDao.getAllConfigForServerId(currentServerId);
		
		/**
		 * JVM SERVER_ID if not found then load DEFAULT serverID configurations from the DataBase 
		 */
		 
		if(listOfCurrentServerId.isEmpty()) {
			log.debug("JVM ServerId {}  not found", currentServerId);
				
			updateResult = configDao.handleFirstTimeLoad(currentServerId);	
			
			if(updateResult) {
				log.debug("All records updated successfully with {} server id and PRIMARY_FLAG set to N", currentServerId);
			} else {
				log.debug("Failed to Update records for {} Server Id", currentServerId);
			}
			
		} else {			
			log.debug("{} is found in AppConfig table so no serverId updatation is required", currentServerId);
		}
			
	}	

	/**
	* {@inheritDoc}
	*/
	@Override
	public boolean insertBeanConfiguration(final List<AppConfig> listOfConfigDetailsToInsert) {
		
		boolean insertResult= false;		
		insertResult = configDao.handleFirstTimeLoadEachBeanAndKeys(listOfConfigDetailsToInsert);
		if(insertResult) {
			log.debug("All records inserted successfully for {} server id", ConfigUtil.getServerId());
			return true;
		} else {
			log.debug("Failed to insert records for {} Server Id", ConfigUtil.getServerId());
			return false;
		}
	}
	
	/**
	* {@inheritDoc}
	*/	
	@Override
	public List<AppConfig> getAllConfigDetailsForBeanId(final String serverId, final String beanId) {	
		List<AppConfig> listOfConfigDetails = configDao.getAllConfigDetailsForBeanId(serverId, beanId);
				
		if(null!=listOfConfigDetails) {	
			return listOfConfigDetails;
		}		
		return null;
	}

}