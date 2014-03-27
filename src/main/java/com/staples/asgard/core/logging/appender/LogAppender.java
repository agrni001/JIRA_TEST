package com.staples.asgard.core.logging.appender;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.spi.LoggingEvent;

/**
 * 
 * Extends the Abstract superclass AppenderSkeleton.
 * 
 * This class provides the code for common functionality, such as support for
 * threshold filtering and support for general filters.
 * 
 * LogAppender appends LoggingEvent events to a List.
 * 
 * @author Sapient
 * 
 */
public class LogAppender extends AppenderSkeleton {
	private final List<LoggingEvent> log = new ArrayList<LoggingEvent>();

	@Override
	public boolean requiresLayout() {
		return false;
	}

	@Override
	protected void append(final LoggingEvent loggingEvent) {
		log.add(loggingEvent);
	}

	@Override
	public void close() {
		// noop
	}

	/**
	 * Used to get the List of LoggingEvent.
	 * 
	 * @return
	 */
	public List<LoggingEvent> getLog() {
		return new ArrayList<LoggingEvent>(log);
	}
}