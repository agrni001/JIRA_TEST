package com.staples.asgard.core.config.repository;

import static com.staples.asgard.core.constants.GlobalConstants.DEFAULT_SERVER_ID;

import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.staples.asgard.core.config.model.AppConfig;
import com.staples.asgard.core.config.util.ConfigUtil;

@Repository
public class ConfigRepositoryImpl implements ConfigRepository {

	@Autowired
    private MongoTemplate mongoTemplate;	
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<AppConfig> getAllAppConfig() {
	
		Query query = new Query();
		query.with(new Sort(Sort.Direction.ASC,"beanId"));		 
		return mongoTemplate.find(query,AppConfig.class);		
	}
	

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<AppConfig> getAllConfigForServerId(final String serverId) {

		return mongoTemplate.find(new Query(Criteria.where("serverId").is(serverId)), AppConfig.class);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean handleFirstTimeLoad(final String currentServerId) {
		List<AppConfig> listOfConfigForDefaultServer = getAllConfigForServerId(DEFAULT_SERVER_ID);
		
		if(insertConfigDetails(currentServerId, listOfConfigForDefaultServer)) {
			return true;
		}
		return false;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean handleFirstTimeLoadEachBeanAndKeys(List<AppConfig> listOfConfigDetailsToInsert)  {							
		if(insertConfigDetails(ConfigUtil.getServerId(), listOfConfigDetailsToInsert)) {
			return true;
		}		
		return false;
	}
	
	/**
	 * {@inheritDoc}
	 */	
	@Override
	public boolean insertConfigDetails(final String serverId, List<AppConfig> listOfConfigDetailsToInsert) {

		if (null != listOfConfigDetailsToInsert) {
			/*
			 * create that many new records as that off DEFAULT_SERVER Ids and
			 * update serverId as currentServerId
			 */
			for (AppConfig config : listOfConfigDetailsToInsert) {
				config.setServerId(serverId);
				config.setId(new ObjectId());
				config.setLastUpdated(new Date().toString());
			}
			mongoTemplate.insertAll(listOfConfigDetailsToInsert);
			return true;
		}
		
		return false;
	}

	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean updateBeanConfiguration(final String serverId, final String beanId,
			final String configKey, final String configValue) {
				
		Query query = new Query(Criteria.where("serverId").is(serverId).andOperator(
				Criteria.where("beanId").is(beanId), Criteria.where("configKey").is(configKey)));

		List<AppConfig> beanIdList = mongoTemplate.find(query,AppConfig.class);
		if(null != beanIdList) {
			AppConfig configToUpdate = (AppConfig) beanIdList.iterator().next();
			configToUpdate.setConfigValue(configValue);
			configToUpdate.setLastUpdated(new Date().toString());
			mongoTemplate.save(configToUpdate);
			return true;
		}		
		return false;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<AppConfig> getAllConfigDetailsForBeanId(String serverId,
			String beanId) {	

		Query query = new Query(Criteria.where("serverId").is(serverId).andOperator(Criteria.where("beanId").is(beanId)));		
		return mongoTemplate.find(query, AppConfig.class);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean deleteConfigDetails(final String serverId) {
		
		Query query = new Query(Criteria.where("serverId").is(serverId));
		mongoTemplate.remove(query, AppConfig.class);		
		return true;
	}	
}
	
