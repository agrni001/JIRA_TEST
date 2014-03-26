/**
 * 
 */
package com.staples.asgard.core.config.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

import com.staples.asgard.core.config.annotation.ConfigAttribute;
import com.staples.asgard.core.config.annotation.ConfigEnabled;
import com.staples.asgard.core.config.annotation.InitializedAttribute;
import com.staples.asgard.core.config.service.ConfigService;
import com.staples.asgard.core.util.SpringBeanNameAwareWrapper;

/**
 * @author ubud
 *
 */
@Component("CoreConfig")
@ConfigEnabled()
@ManagedResource(objectName = "com.staples.asgard.core.config:name=CoreConfig", description = "Asgard System Behavior Configuration")
public class CoreConfig  extends SpringBeanNameAwareWrapper{
	
	private static final Logger log = LoggerFactory.getLogger(CoreConfig.class);
	 
	@Autowired
	private ConfigService configService;

	@InitializedAttribute
	private boolean initialized = false;
	
	@ConfigAttribute(activeFlag = "true")
	private int integrationGatewayReadTimeout;
	
	@ConfigAttribute(activeFlag = "true")
	private int integrationGatewayConnectTimeout;
	
	public boolean isInitialized() {
		return initialized;
	}

	public void setInitialized(boolean initialized) {
		this.initialized = initialized;
	}

	@ManagedAttribute(description = "Integration gateway read Timeout")
	public int getIntegrationGatewayReadTimeout() {
		return integrationGatewayReadTimeout;
	}

	@ManagedAttribute(description = "Set Integration gateway read Timeout")
	public void setIntegrationGatewayReadTimeout(
			int integrationGatewayReadTimeout) {
		this.integrationGatewayReadTimeout = integrationGatewayReadTimeout;
	}

	@ManagedAttribute(description = "Integration gateway connection Timeout")
	public int getIntegrationGatewayConnectTimeout() {
		return integrationGatewayConnectTimeout;
	}

	@ManagedAttribute(description = "Set Integration gateway connection Timeout")
	public void setIntegrationGatewayConnectTimeout(
			int integrationGatewayConnectTimeout) {
		this.integrationGatewayConnectTimeout = integrationGatewayConnectTimeout;
	}

	 

}
