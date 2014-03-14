package com.staples.asgard.core.config.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This is the custom annotation to identify the fields which are initialized flag fields
 * 
 * @author
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface InitializedAttribute {
	String initializedField() default "false";
	
}