package com.staples.asgard.core.util;

import static com.staples.asgard.core.constants.GlobalConstants.DATE_FORMAT;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * Asgard's DATE Util class
 * 
 * @author srani
 * 
 */
public class DateUtil {
	/**
	 * Get time in milliseconds out of a time-stamp
	 * 
	 * @param input
	 * @return
	 * @throws ParseException
	 */
	public static long getTime(String input) {
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
		long time = 0;
		try {
			Date date = sdf.parse(input);
			time = date.getTime();
		} catch (ParseException e) {
			// DO NOTHING
		}
		return time;
	}

}
