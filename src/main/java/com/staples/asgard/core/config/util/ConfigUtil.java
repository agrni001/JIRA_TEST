package com.staples.asgard.core.config.util;

import static com.staples.asgard.core.constants.GlobalConstants.CURRENT_SERVER_ID;
import static com.staples.asgard.core.constants.GlobalConstants.SINGLE_SPACE;

/**
 * This class holds configuration utility methods
 * 
 * @author
 */
public class ConfigUtil {
	public static final String serverId = System.getProperty(CURRENT_SERVER_ID);

	/**
	 * @return the serverid
	 */
	public static String getServerId() {
		return null != serverId ? serverId : SINGLE_SPACE;
	}
}
