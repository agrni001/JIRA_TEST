package com.staples.asgard.core.exceptions;

/**
 * BusinessException is the base class for all business exceptions thrown within Asgard
 * applications.
 * 
 * @author 
 */
public class BusinessException extends BaseException {

    
    /**
	 * 
	 */
	private static final long serialVersionUID = -5223214671095089497L;

	/**
     * {@inheritDoc}
     */
    public BusinessException(String errorCode, String errorMessage)
    {
        super(errorCode, errorMessage);
    }
}
