package com.staples.asgard.core.exceptions.model;

/**
 * Class to hold error.
 * @author Sapient
 * Date: Jan 13, 2014
 */
public class ErrorMap {
	
	private String errorCode;
	private String errorMsg;
	
	public ErrorMap(){
		errorCode = null;
		errorMsg = null;
	}

	public ErrorMap(String errorCode, String errorMsg){
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
