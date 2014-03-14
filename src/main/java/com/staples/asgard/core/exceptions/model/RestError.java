package com.staples.asgard.core.exceptions.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Rest Error Object.
 * @author Sapient
 * Date: Jan 9, 2014
 */
public class RestError {
	
	private List<ErrorMap> errors;
	private String status;
	
	public RestError(){
		errors = new ArrayList<ErrorMap>();
	}
	
	public List<ErrorMap> getErrors() {
		return errors;
	}
	
	public void setErrors(List<ErrorMap> errors){
		this.errors = errors;
	}
	
	/**
	 * This will create an ErrorMap object and add that to the errors list.
	 * @param errorCode
	 * @param errorMessage
	 */
	public void addErrors(String errorCode, String errorMessage) {
		errors.add(new ErrorMap(errorCode, errorMessage));
	}
	
	/**
	 * This will add the ErrorMap object directly to the list.
	 * Use this when you have an already populated ErrorMap
	 * @param errorMap
	 */
	public void addErrors(ErrorMap errorMap) {
		errors.add(errorMap);
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
}
