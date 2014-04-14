/**
 * 
 */
package com.staples.asgard.core.exceptions;

import org.springframework.integration.MessageHandlingException;
import org.springframework.integration.support.MessageBuilder;

/**
 * 
 * 
 * @author srani
 * 
 */
public class PriceException extends MessageHandlingException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public PriceException() {
		super(MessageBuilder.withPayload("error").build());
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public PriceException(String message, Throwable cause) {
		super(MessageBuilder.withPayload(message).build(), cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public PriceException(String message) {
		super(MessageBuilder.withPayload(message).build());
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public PriceException(Throwable cause) {
		super(MessageBuilder.withPayload(cause.getMessage()).build());
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PriceException [getMessage()="
				+ getFailedMessage().getPayload() + "]";
	}

}
