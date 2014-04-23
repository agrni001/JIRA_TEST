package com.staples.asgard.core.exceptions.model;

/**
 * Class to hold rest error to be returned by the API
 * @author Sapient
 * Date: Jan 13, 2014
 */
public class RestError {
	
	private String errorCode;
	private String errorMsg;
	
	public RestError(){
		errorCode = null;
		errorMsg = null;
	}

	public RestError(String errorCode, String errorMsg){
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}
	
	public String getErrorCode() {
		return errorCode;
	}
	
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	
	public String getErrorMsg() {
		return errorMsg;
	}
	
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

}
