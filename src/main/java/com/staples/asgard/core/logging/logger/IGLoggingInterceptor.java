package com.staples.asgard.core.logging.logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * BaseLoggingInterceptor class is a base class for all interceptors used within
 * Asgard applications.
 * 
 * Responsiblities are as follows: Start of method Time taken by the method to
 * execute End of method
 * 
 * 
 * This class will be used to intercept classes.
 * 
 * @author Sapient
 * 
 */
@Aspect
@Component
public class IGLoggingInterceptor extends BaseLoggingInterceptor {

	/**
	 * Logs method start, method end and exceptions being raised in Service
	 * classes.
	 * 
	 * @param pjp
	 *            ProceedingJoinPoint class which contains all the necessary
	 *            details of the method being intercepted.
	 * @return Object being returned by Service methods being intercepted
	 * @throws Throwable
	 *             Any exceptions being thrown by intercepted methods are
	 *             re-thrown by the interceptor
	 */
	@Around("execution(* com.staples.asgard.*.*.*.*(..))")
	public Object serviceMethodLogging(ProceedingJoinPoint pjp)
			throws Throwable {
		return methodLogging(pjp);
	}

}
