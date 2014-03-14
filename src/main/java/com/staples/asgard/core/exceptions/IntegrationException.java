package com.staples.asgard.core.exceptions;

/**
 * SystemException is the base class for all system exceptions thrown within Asgard
 * applications.
 * 
 * @author
 */
public class IntegrationException extends BaseException {

   
    /**
	 * 
	 */
	private static final long serialVersionUID = 5948537699192514721L;

	/**
     * {@inheritDoc}
     */
    public IntegrationException(String errorCode, String errorMessage)
    {
        super(errorCode, errorMessage);
    }
}