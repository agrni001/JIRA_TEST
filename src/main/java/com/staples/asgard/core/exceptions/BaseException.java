package com.staples.asgard.core.exceptions;


/**
 * BaseException is the base class for all exceptions thrown within Asgard applications.
 * 
 * @author
 */
public class BaseException extends Exception {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private  AsgardError asgardError ;
    

    
	/**
	 * 
	 */
	public BaseException() {
		super();
		asgardError = new AsgardError("", "");
	}

	/**
	 * Creates the BrowseException, sets errorcode, erromessage.
	 * @param asgardError
	 * @param ex
	 */
	public BaseException(AsgardError asgardError)
    {
		super(asgardError.getCustomMessage());
		this.asgardError = asgardError;         
    }
	
	/**
	 * Creates the BrowseException, sets errorcode, erromessage and gets the Exception .
	 * @param asgardError
	 * @param ex
	 */
	public BaseException(AsgardError asgardError, Exception ex)
    {
		super(ex);
		this.asgardError = asgardError;
		 
    }

     
	public BaseException(String errorCode, String errorMessage) {
		super(errorMessage);
		this.asgardError = new AsgardError(errorCode, errorMessage);
	}

	public AsgardError getAsgardError() {
		return asgardError;
	}

	public void setAsgardError(AsgardError asgardError) {
		this.asgardError = asgardError;
	}

	 
     
}