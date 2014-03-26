package com.staples.asgard.core.util;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cedarsoftware.util.io.JsonWriter;

/**
 * This is a wrapper util class to convert the Object to JSON 
 * Uses the com.cedarsoftware.util.io.Jsonwriter to convert
 * @author Sapient
 * Date: Jan 9, 2014
 *
 */
public class JSONUtil {

	/** Logger */
	private static final Logger log = LoggerFactory.getLogger(JSONUtil.class);
	
	/**
	 * This method converts the input object to JSON String format
	 * @param inputTO Input object
	 * @return Object in JSON Format of type String
	 */
	public static String convertToJSON(Object inputTO) {
		String json=null;
		try{
			json = JsonWriter.objectToJson(inputTO);
			
			/** This logic is to remove the @type parameter in the generated JSON **/
			StringBuffer typeParam = new StringBuffer("");
			typeParam.append("{\"@type\":\"").append(inputTO.getClass().getCanonicalName()).append("\",");
			json = json.replace(typeParam.toString(), "{");
		} catch (IOException exception) {
			log.error("Exception in Converting Object to JSON : {}", exception.getMessage() );
		}
		log.debug("Converted JSON : {}", json);
		return json;
	}
}
