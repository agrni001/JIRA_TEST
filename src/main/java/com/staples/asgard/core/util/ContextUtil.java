package com.staples.asgard.core.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ContextUtil implements ApplicationContextAware {

	/** Application Context **/
	private static ApplicationContext applicationContext = null;
	
	/**
	 *  Returns Application Context 
	 * @return {@link ApplicationContext} 
	 */
    public static ApplicationContext getApplicationContext() {         
        return applicationContext;    
    }
    
    /**
     * Sets the application context
     * @param {@link ApplicationContext} 
     */
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
    
    
    /**
     * Returns the object of beanName
     * @param {@link ApplicationContext} 
     */
    public static Object getBean(String beanName) throws BeansException {
    	return applicationContext.getBean(beanName);
    }
}
