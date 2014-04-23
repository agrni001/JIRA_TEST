/**
 * 
 */
package com.staples.asgard.core.constants;

import com.staples.asgard.core.exceptions.AsgardError;

/**
 * This is a common file where has all Error codes and messages used by Core module
 * @author Sapient
 *
 */
public class ErrorConstants {
	
	public static final AsgardError ERROR_FW0002 = new AsgardError("FW0002", "There are no  configurations found for the Bean for DEFAULT SERVER. Therefore, config bean cannot be populated. Insert data in Mongo DB for this bean to proceed further");
	public static final AsgardError ERROR_FW0005 = new AsgardError("FW0005", "Illegal Argument Exception while performing initializing operations configuration loader");
	public static final AsgardError ERROR_FW0006 = new AsgardError("FW0006", "Illegal Access Exception while performing initializing operations configuration loader");
	public static final AsgardError ERROR_FW0007 = new AsgardError("FW0007", "NoSuchMethodException while performing initializing operations in configuration loader");
	public static final AsgardError ERROR_FW0008 = new AsgardError("FW0008", "InvocationTargetException while performing initializing operations configuration loader");
	public static final AsgardError ERROR_FW0009 = new AsgardError("FW0009", "InstantiationException while performing initializing operations configuration loader");		
	
}
