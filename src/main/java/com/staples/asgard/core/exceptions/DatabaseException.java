package com.staples.asgard.core.exceptions;


/**
 * BusinessException is the base class for all database exceptions thrown within Asgard
 * applications.
 * 
 * @author 
 */
public class DatabaseException extends BaseException {
 
    
    /**
	 * 
	 */
	private static final long serialVersionUID = -8743203187126796299L;

	/**
     * {@inheritDoc}
     */
    public DatabaseException(String errorCode, String errorMessage)
    {
        super(errorCode, errorMessage);
    }
}
