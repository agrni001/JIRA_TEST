package com.staples.asgard.core.config.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This is the custom interface (Annotation) file to identify the fields which are configuration fields
 * 
 * @author
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ConfigAttribute {	
	String activeFlag() default "false";	
}