package com.staples.asgard.core.config.model;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * This  class contains the getter and setter methods required to map the bean to the table
 * 
 * @author
 */
@Document(collection = "appConfig")
public class AppConfig {

	private ObjectId id;

	private String storeId;

	private String serverId;


	private String beanId;


	private String configKey;


	private String configValue;
	
	
	private String changedBy;
	
	
	private String description;		

	
	private String lastUpdated;

	public ObjectId getId() {
		return id;
	}


	public void setId(ObjectId id) {
		this.id = id;
	}


	public String getStoreId() {
		return storeId;
	}


	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}


	public String getServerId() {
		return serverId;
	}


	public void setServerId(String serverId) {
		this.serverId = serverId;
	}


	public String getBeanId() {
		return beanId;
	}


	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}


	public String getConfigKey() {
		return configKey;
	}


	public void setConfigKey(String configKey) {
		this.configKey = configKey;
	}


	public String getConfigValue() {
		return configValue;
	}


	public void setConfigValue(String configValue) {
		this.configValue = configValue;
	}


	public String getChangedBy() {
		return changedBy;
	}


	public void setChangedBy(String changedBy) {
		this.changedBy = changedBy;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getLastUpdated() {
		return lastUpdated;
	}


	public void setLastUpdated(String lastUpdated) {
		this.lastUpdated = lastUpdated;
	}


	 

}