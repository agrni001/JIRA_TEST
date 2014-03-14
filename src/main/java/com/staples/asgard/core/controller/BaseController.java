package com.staples.asgard.core.controller;

import static com.staples.asgard.core.constants.ErrorConstants.ERROR_BS0200;
import static com.staples.asgard.core.constants.GlobalConstants.APPLICATION_JSON;
import static com.staples.asgard.core.constants.GlobalConstants.CONTENT_TYPE;
import static com.staples.asgard.core.constants.GlobalConstants.PIPE_SYMBOL;
import static com.staples.asgard.core.constants.GlobalConstants.SINGLE_SPACE;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.staples.asgard.core.exceptions.BaseException;
import com.staples.asgard.core.exceptions.model.RestError;

/**
 * Controller Base Class.
 * 
 * @author Sapient Date: Jan 9, 2014
 */
public abstract class BaseController {

	private static final Logger log = LoggerFactory.getLogger(BaseController.class);

	/**
	 * Catches the exception and send out an error code and message in JSON
	 * format
	 * 
	 * @param ex
	 *            {@link Exception}
	 * @param response
	 *            {@link HttpServletResponse}
	 * @return JSON in String format
	 */
	@ExceptionHandler(BaseException.class)
	public @ResponseBody
	String handleBaseException(BaseException ex, HttpServletResponse response) {
		response.setHeader(CONTENT_TYPE, APPLICATION_JSON);
		response.setStatus(HttpServletResponse.SC_BAD_REQUEST);

		log.error("BaseException {}#{} :: {} :: {}", ex.getAsgardError().getCode(), ex.getAsgardError().getCustomMessage(), ex.getAsgardError().getCustomMessage(),
				ex.getStackTrace());

		return createErrorJson(ex.getAsgardError().getCode(), ex.getAsgardError().getCustomMessage());
	}

	/**
	 * Catches the exception and send out an error code and message in JSON
	 * format
	 * 
	 * @param ex
	 *            {@link Exception}
	 * @param response
	 *            {@link HttpServletResponse}
	 * @return JSON in String format
	 */
	@ExceptionHandler(Exception.class)
	public @ResponseBody
	String handleException(Exception ex, HttpServletResponse response) {
		response.setHeader(CONTENT_TYPE, APPLICATION_JSON);
		response.setStatus(HttpServletResponse.SC_BAD_REQUEST);

		log.error("Generic Exception {}#{} :: {} :: {}", ERROR_BS0200.getCode(), ERROR_BS0200.getCustomMessage(),
				ex.getMessage(), ex.getStackTrace());

		return createErrorJson(ERROR_BS0200.getCode(), ERROR_BS0200.getCustomMessage());
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseBody
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	public String handleException(MethodArgumentNotValidException exception, HttpServletResponse response) {
		response.setHeader(CONTENT_TYPE, APPLICATION_JSON);
		response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		exception.getBindingResult().getFieldErrors();

		StringBuffer errorBuffer = new StringBuffer();

		for (FieldError error : exception.getBindingResult().getFieldErrors()) {
			if (null != errorBuffer && errorBuffer.length() > 0) {
				errorBuffer.append(SINGLE_SPACE+PIPE_SYMBOL+SINGLE_SPACE);
			}
			errorBuffer.append(error.getCode() + " : " + error.getDefaultMessage());
		}
		System.out.println("errorBuffer : " + errorBuffer.toString());
		return createErrorJson(ERROR_BS0200.getCode(), errorBuffer.toString());

	}

	/**
	 * Creates and Converts the RestError object to JSON Format string.
	 * 
	 * @param restError
	 * @return output JSON in String format
	 */
	private String createErrorJson(String errorCode, String errorMessage) {

		String outputErrorJSON = null;

		/** Creating the RestError object **/
		RestError restError = new RestError();
		restError.addErrors(errorCode, errorMessage);
		restError.setStatus("ERROR");

		/** Converting the RestError object to JSON Format string **/
		ObjectMapper mapper = new ObjectMapper();
		try {
			outputErrorJSON = mapper.writeValueAsString(restError);
			log.debug("Error JSON : {}", outputErrorJSON);
		} catch (Exception JSONException) {
			log.error("Error in Converting JSON : {}", JSONException);
			;
		}
		return outputErrorJSON;
	}

}
