package com.staples.asgard.core.config.annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This is the custom annotation interface. It can be used by any class
 * which is meant to be a Configuration bean
 * 
 * The purpose of this annotation is to identify all POJOs which are meant to hold Application and FSA level 
 * configurations   
 * @author
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ConfigEnabled {
	   
}