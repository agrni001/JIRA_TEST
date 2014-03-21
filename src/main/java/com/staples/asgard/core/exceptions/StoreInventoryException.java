/**
 * 
 */
package com.staples.asgard.core.exceptions;

import org.springframework.integration.Message;
import org.springframework.integration.MessageHandlingException;
import org.springframework.integration.MessagingException;

/**
 * @author ubud
 *
 */
public class StoreInventoryException extends MessageHandlingException  {

	 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public StoreInventoryException() {
		super((Message<?>) new MessagingException("error"));
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public StoreInventoryException(String message, Throwable cause) {
		super((Message<?>) new MessagingException(message) , cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public StoreInventoryException(String message) {
		super((Message<?>) new MessagingException(message));
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public StoreInventoryException(Throwable cause) {
		super((Message<?>) new MessagingException(cause.getMessage()));
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "StoreInventoryException [getMessage()=" + getMessage() + "]";
	}

	
 
 
	 

}
