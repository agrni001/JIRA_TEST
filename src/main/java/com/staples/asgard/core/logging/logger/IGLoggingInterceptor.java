package com.staples.asgard.core.logging.logger;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * IGLoggingInterceptor class
 * 
 * @author Sapient
 * 
 */
// @Aspect
// @Component
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
	// @Around("execution(* com.staples.asgard.*.*.*.*(..))")
	public Object serviceMethodLogging(ProceedingJoinPoint pjp)
			throws Throwable {
		return methodLogging(pjp);
	}

}
