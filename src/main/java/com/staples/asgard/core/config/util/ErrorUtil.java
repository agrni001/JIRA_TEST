package com.staples.asgard.core.config.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.staples.asgard.core.exceptions.AsgardError;
import com.staples.asgard.core.exceptions.model.RestError;

public class ErrorUtil {
	
	private static final Logger LOG = LoggerFactory.getLogger(ErrorUtil.class);

	/**
	 * Creates and Converts the AsgardError object to JSON string. 
	 * It is also a common point where errors are logged
	 * 
	 * @param restError
	 * @return output JSON in String format
	 */
	public static String createErrorJson(AsgardError asgardError, String errorMessage) {
		
		//Log the error 
		LOG.error("Error Code = {} : Error Message = {}", asgardError.getCode(), errorMessage);
		
		String outputErrorJSON = null;		
				
		/** Creating the RestError object **/
		RestError restError = new RestError();
		restError.addErrors(asgardError.getCode(), asgardError.getCustomMessage());

		/** Converting the RestError object to JSON Format string **/
		ObjectMapper mapper = new ObjectMapper();
		try {
			outputErrorJSON = mapper.writeValueAsString(restError);
		} catch (Exception JSONException) {
			LOG.error("Error in converting restError into json");
		}
		return outputErrorJSON;
	}
	

}
