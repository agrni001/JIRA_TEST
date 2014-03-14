package com.staples.asgard.core.logging.logger;

import static com.staples.asgard.core.constants.GlobalConstants.ZIPCODE;

import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.util.StopWatch;
import org.springframework.util.StringUtils;

import com.staples.asgard.core.constants.GlobalConstants;

/**
 * BaseLoggingInterceptor class is a base class for all interceptors used within
 * Asgard applications.
 * 
 * Responsiblities are as follows:
 * 
 * Start of method Time taken by the method to execute End of method
 * 
 * 
 * @author Sapient
 * 
 */
public class BaseLoggingInterceptor {

	@Autowired
	MessageSource messageSource;

	private static final Logger LOG = LoggerFactory.getLogger(BaseLoggingInterceptor.class);

	/**
	 * Logs method start, method end and exceptions being raised in DAO classes.
	 * 
	 * @param pjp
	 *            ProceedingJoinPoint class which contains all the necessary
	 *            details of the method being intercepted.
	 * @return Object being returned by Service methods being intercepted
	 * @throws Throwable
	 *             Any exceptions being thrown by intercepted methods are
	 *             re-thrown by the interceptor
	 */
	public Object methodLogging(ProceedingJoinPoint pjp) throws Throwable {
		boolean isMethodEntryExitEnabled = Boolean.valueOf(messageSource.getMessage(GlobalConstants.METHOD_LEVEL_TRACE, null,
				GlobalConstants.FALSE_STRING, null));
		boolean isMethodPerfEnabled = Boolean.valueOf(messageSource.getMessage(GlobalConstants.PERF_TRACE, null, GlobalConstants.FALSE_STRING, null));

		
		messageSource.getMessage(ZIPCODE, null, null, null);
		
		Class<? extends Object> targetClass = pjp.getTarget().getClass();
		String methodName = null;
		String methodArgsAsString = convertObjectArrayToString(pjp.getArgs());
		if (isMethodEntryExitEnabled) {
			// 1. Log start of method
			methodName = pjp.getSignature().getName() + "()";
			logMethodStart(targetClass, methodName, methodArgsAsString);

		}
		StopWatch timer = null;
		if (isMethodPerfEnabled) {
			timer = new StopWatch();
			timer.start();
		}

		Object retVal = null;
		// 2. Execute the method
		retVal = pjp.proceed();

		if (isMethodPerfEnabled) {
			// 4. Log total execution time
			timer.stop();
			logTotalExecutionTime(targetClass, methodName, timer);
		}
		if (isMethodEntryExitEnabled) {
			// 5. Log method end
			logMethodEnd(targetClass, methodName, methodArgsAsString);
		}
		return retVal;
	}

	/**
	 * Logs the total execution time of an input method in milliseconds.
	 * 
	 * @param targetClass
	 *            Class of the method to be logged
	 * @param methodName
	 *            Name of the method to be logged
	 * @param timer
	 *            Spring StopWatch class having the total execution time
	 * 
	 */
	private void logTotalExecutionTime(Class<? extends Object> targetClass, String methodName, StopWatch timer) {
		StringBuilder builder = new StringBuilder();
		builder.append(GlobalConstants.LOG_METHOD_EXECUTION_START);
		builder.append(targetClass.getName());
		builder.append(GlobalConstants.DOT);
		builder.append(methodName);
		builder.append(GlobalConstants.LOG_METHOD_EXECUTION_IS);
		builder.append(timer.getTotalTimeMillis());
		builder.append(GlobalConstants.LOG_METHOD_EXECUTION_TIME_LIMIT);
		LOG.info(builder.toString());
	}

	/**
	 * Logs the start of a method of input Class.
	 * 
	 * @param targetClass
	 *            Class of the method to be logged
	 * @param methodName
	 *            Name of the method to be logged
	 * @param methodArgsAsString
	 *            Method arguments as String
	 * 
	 */
	private void logMethodStart(Class<? extends Object> targetClass, String methodName, String methodArgsAsString) {
		StringBuilder builder = new StringBuilder();
		builder.append(GlobalConstants.LOG_METHOD_ENTER + targetClass);
		builder = constructMethodInfo(methodName, methodArgsAsString, builder);
		LOG.info(builder.toString());
	}

	/**
	 * Logs the end of a method of input Class.
	 * 
	 * @param targetClass
	 *            Class of the method to be logged
	 * @param methodName
	 *            Name of the method to be logged
	 * @param methodArgsAsString
	 *            Method arguments as String
	 * 
	 */
	private void logMethodEnd(Class<? extends Object> targetClass, String methodName, String methodArgsAsString) {
		StringBuilder builder = new StringBuilder();
		builder.append(GlobalConstants.LOG_METHOD_EXIT + targetClass);
		builder = constructMethodInfo(methodName, methodArgsAsString, builder);
		LOG.info(builder.toString());
	}

	/**
	 * Constructs the method information.
	 * 
	 * @param methodName
	 *            Name of the method to be logged
	 * @param methodArgsAsString
	 *            Method arguments as String
	 * @param builder
	 * @return
	 */
	private StringBuilder constructMethodInfo(String methodName, String methodArgsAsString, StringBuilder builder) {
		builder.append(GlobalConstants.DOT + methodName);
		if (!StringUtils.isEmpty(methodArgsAsString)) {
			builder.append(GlobalConstants.LOG_METHOD_ARGS_START);
			builder.append(methodArgsAsString);
			builder.append(GlobalConstants.LOG_METHOD_ARGS_END);
		}
		return builder;
	}

	/**
	 * @param args
	 * @return
	 */
	private String convertObjectArrayToString(Object[] args) {
		StringBuilder sb = new StringBuilder();
		for (Object object : args) {
			sb.append(object);
		}
		return null != sb ? sb.toString() : null;
	}

	/**
	 * <p>
	 * Logs the details of exception being raised by input method.
	 * </p>
	 * 
	 * @param targetClass
	 *            Class of the method to be logged
	 * @param methodName
	 *            Name of the method to be logged
	 * @param methodArgsAsString
	 *            Method arguments as String
	 * @param e
	 *            Exception raised in the invoked method
	 * 
	 */
	/*
	 * private void logMethodExceptions(Class<? extends Object> targetClass,
	 * String methodName, String methodArgsAsString, Exception e) {
	 * 
	 * StringBuilder exceptionStack = new StringBuilder(); for
	 * (StackTraceElement i : e.getStackTrace()) {
	 * exceptionStack.append(i.toString() + "\n"); }
	 * 
	 * StringBuilder builder = new StringBuilder();
	 * builder.append("Exception in Method: "); builder.append(methodName);
	 * builder.append("  "); builder.append("Args - [ ");
	 * builder.append(methodArgsAsString); builder.append(" ]"); if (e
	 * instanceof BaseException) { BaseException be = (BaseException) e;
	 * builder.append("Error Code - "); builder.append(be.getErrorCode());
	 * builder.append("Error Message - "); builder.append(be.getErrorMessage());
	 * } builder.append("STACKTRACE - "); builder.append(exceptionStack);
	 * AsgardLogger.error(builder.toString(), e, targetClass); }
	 */

}
