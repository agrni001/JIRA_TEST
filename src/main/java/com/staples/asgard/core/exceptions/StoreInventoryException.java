/**
 * 
 */
package com.staples.asgard.core.exceptions;

import org.springframework.integration.Message;
import org.springframework.integration.MessageHandlingException;
import org.springframework.integration.MessagingException;
import org.springframework.integration.support.MessageBuilder;

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
		super(MessageBuilder.withPayload("error").build());
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public StoreInventoryException(String message, Throwable cause) {
		super(MessageBuilder.withPayload(message).build() , cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public StoreInventoryException(String message) {
		super(MessageBuilder.withPayload(message).build());
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public StoreInventoryException(Throwable cause) {
		super(MessageBuilder.withPayload(cause.getMessage()).build());
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "StoreInventoryException [getMessage()=" + getFailedMessage().getPayload() + "]";
	}

	
 
 
	 

}
