package com.staples.asgard.core.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;

/**
 * 
 * Asgard's String Util class
 * 
 * @author srani
 * 
 */
public class StringUtil {
	/**
	 * @param padType
	 * @param data
	 * @param size
	 * @param padData
	 * @return
	 */
	public static String padValue(String padType, String data, int size, String padData) {
		if (null != data && null != padData && size > 0) {
			if (padType.compareToIgnoreCase("R") == 0) {
				data = StringUtils.rightPad(data, size, padData);
			} else {
				data = StringUtils.leftPad(data, size, padData);
			}
		}
		return data;
	}

	/**
	 * Splits the String to array of String
	 * 
	 * @param data
	 * @return
	 */
	public static String[] splitStringToArray(String data, int limit) {
		return null != data ? data.split(String.format("(?s)(?<=\\G.{%d})", limit)) : null;
	}

	/**
	 * Converts String to Date - based on the input format
	 * 
	 * @param data
	 * @return
	 * @throws ParseException
	 */
	public static Date convertStringToDate(String data, String format) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.parse(data);
	}

}
