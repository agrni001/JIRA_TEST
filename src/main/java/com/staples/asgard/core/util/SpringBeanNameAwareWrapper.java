package com.staples.asgard.core.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;

/**
* This class is the wrapper class to get the bean name
* 
* @author 
* 
*/
public class SpringBeanNameAwareWrapper implements BeanNameAware {

	private static final Logger log = LoggerFactory.getLogger(SpringBeanNameAwareWrapper.class);

	private String beanId;
	
	/**
	 * Method of BeanNameAware which sets beanId
	 * 
	 * @param beanId the beanId to set
	 */
	@Override
	public void setBeanName(String beanId) {
		setBeanId(beanId);
	}

	/**
	 * Getter method for beanId
	 * 
	 * @return the beanId
	 */
	public String getBeanId() {
		return beanId;
	}

	/**
	 * Setter method for beanId
	 * 
	 * @param beanId the beanId to set
	 */
	public void setBeanId(String beanId) {		
		this.beanId = beanId;
	}

}
