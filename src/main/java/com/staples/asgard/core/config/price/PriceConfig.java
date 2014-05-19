package com.staples.asgard.core.config.price;

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
 * This class holds configuration properties for Inventory Visibility FSA
 * Module.
 * 
 * Class is annotated with @ConfigEnabled custom annotation and configurable
 * attributes are annotated with @ConfigAttribute annotation
 * 
 * This bean is also exposed as MBean and allows setter methods to be invoked
 * via clients like jconsole etc. The setter methods will update the value in
 * database
 * 
 * @author
 */

@Component("PriceConfig")
@ConfigEnabled()
@ManagedResource(objectName = "com.staples.asgard.core.config.model:name=PriceConfig", description = "PRICE Configuration")
public class PriceConfig extends SpringBeanNameAwareWrapper {

    @Autowired
    private ConfigService configService;

    @InitializedAttribute
    private boolean initialized = false;

    @ConfigAttribute(activeFlag = "true")
    private String defaultZone;

    @ConfigAttribute(activeFlag = "true")
    private boolean standAlone = false;

    @ManagedAttribute(description = "defaultZone")
    public String getDefaultZone() {
        return defaultZone;
    }

    public void setDefaultZone(String defaultZone) {
        this.defaultZone = defaultZone;
    }

    /**
     * @return the initialized
     */
    @ManagedAttribute(description = "Initialized")
    public boolean isInitialized() {
        return initialized;
    }

    /**
     * @param initialized
     *            the initialized to set
     */
    @ManagedAttribute(description = "Initialized configuration")
    public void setInitialized(boolean initialized) {
        this.initialized = initialized;
    }

    @ManagedAttribute(description = "standAlone")
    public boolean getStandAlone() {
        return standAlone;
    }

    @ManagedAttribute(description = "standAlone configuration")
    public void setStandAlone(boolean standAlone) {
        this.standAlone = standAlone;
    }

}