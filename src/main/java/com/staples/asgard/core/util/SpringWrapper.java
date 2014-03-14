package com.staples.asgard.core.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

/**
* This class holds the reference to ApplicationContext variable. The springContext
* variable gets instantiated in AppContextInitializer listener class.
* 
 * @author 
 * 
 */
public class SpringWrapper {
    
    private static final Logger log = LoggerFactory.getLogger(SpringWrapper.class);

    private static ApplicationContext springContext = null;

    /**
     * @param springContext the springContext to set
     */
    static void setSpringContext(ApplicationContext springContext) {
        SpringWrapper.springContext = springContext;
    }

    /**
     * Get a handle to Spring ApplicationContext
     * 
     * @return the springContext
     */
    public static ApplicationContext getSpringContext() {
        return springContext;
    }

    /**
     * Get a bean from Spring.
     * 
     * @param name bean name
     * @return bean instance
     */
    public static <T> T getBean(String name) {
        if (log.isDebugEnabled())
            log.debug("Retrieving Spring bean: {}", name);

        return TypeCast.<T> cast(springContext.getBean(name));
    }
}
