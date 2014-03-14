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

	public static final AsgardError ERROR_FW0001 = new AsgardError("FW0001", "Exception while performing handle First Time Load Scenario");
	public static final AsgardError ERROR_FW0002 = new AsgardError("FW0002", "There are no  configurations found for the Bean for DEFAULT SERVER. Therefore, config bean cannot be populated. Insert data in Mongo DB for this bean to proceed further");
	public static final AsgardError ERROR_FW0003 = new AsgardError("FW0003", "Database Exception occured while performing First Time Load for Additational Scenario");
	public static final AsgardError ERROR_FW0004 = new AsgardError("FW0004", "Exception while performing First Time Load Additional Scenario");
	public static final AsgardError ERROR_FW0005 = new AsgardError("FW0005", "Illegal Argument Exception while performing initializing operations configuration loader");
	public static final AsgardError ERROR_FW0006 = new AsgardError("FW0006", "Illegal Access Exception while performing initializing operations configuration loader");
	public static final AsgardError ERROR_FW0007 = new AsgardError("FW0007", "NoSuchMethodException while performing initializing operations in configuration loader");
	public static final AsgardError ERROR_FW0008 = new AsgardError("FW0008", "InvocationTargetException while performing initializing operations configuration loader");
	public static final AsgardError ERROR_FW0009 = new AsgardError("FW0009", "InstantiationException while performing initializing operations configuration loader");
	
	public static final AsgardError ERROR_BS0200 = new AsgardError("BS0200", "Browse Generic Error");
	public static final AsgardError ERROR_BS0201 = new AsgardError("BS0201", "Object to JSON Conversion Error");
	public static final AsgardError ERROR_BS0202 = new AsgardError("BS0202", "Service disabled by Filter");
	public static final AsgardError ERROR_BS0203 = new AsgardError("BS0203", "Issue in introducing delay in service");
	public static final AsgardError ERROR_BS0204 = new AsgardError("BS0204", "Json Mapping Exception");
	public static final AsgardError ERROR_BS0205 = new AsgardError("BS0205", "Json Generation Exception");
	public static final AsgardError ERROR_BS0206 = new AsgardError("BS0206", "IO Exception");
	
}
