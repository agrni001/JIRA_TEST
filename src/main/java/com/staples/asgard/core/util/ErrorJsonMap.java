/**
 * 
 */
package com.staples.asgard.core.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.staples.asgard.core.exceptions.AsgardError;

/**
 * This class on startup loads the error codes and messages from JSON and stores
 * it statically. It provides the code and messages to other consumers whenever
 * requested
 * 
 * @author Sapient
 * 
 */
public class ErrorJsonMap {

	private static final Logger LOG = LoggerFactory
			.getLogger(ErrorJsonMap.class);
	private static Map<String, AsgardError> errorsMap = new HashMap<String, AsgardError>();

	public ErrorJsonMap() {
		init();
	}

	public void init() {
		JSONParser parser = new JSONParser();
		try {
			LOG.info("Tiest errors.json");
			BufferedReader bufferedReader = new BufferedReader(
					new InputStreamReader(
							ErrorJsonMap.class
									.getResourceAsStream("/errors.json")));
			Object obj = null;
			if (null != bufferedReader) {
				obj = parser.parse(bufferedReader);
			}
			/*
			 * Object obj = parser.parse(new BufferedReader(new
			 * InputStreamReader( Thread.currentThread().getContextClassLoader()
			 * .getResourceAsStream("errors.json"))));
			 */
			if (null != obj) {
				LOG.info("obj : " + obj);
				JSONObject jsonObject = (JSONObject) obj;
				JSONObject errors = (JSONObject) jsonObject.get("errors");
				Iterator iter = errors.entrySet().iterator();

				while (iter.hasNext()) {
					Map.Entry entry = (Map.Entry) iter.next();
					JSONObject errorJson = (JSONObject) entry.getValue();
					String code = (String) errorJson.get("code");
					String msg = (String) errorJson.get("msg");
					errorsMap.put(code, new AsgardError(code, msg));
				}
			}

		} catch (FileNotFoundException ex) {
			LOG.error("File Not Found when attempting to load errors json", ex);
		} catch (IOException ex) {
			LOG.error("IOException when attempting to load errors json", ex);
		} catch (ParseException ex) {
			LOG.error("ParseException when attempting to parse errors json", ex);
		}
	}

	public static AsgardError getError(String key) {
		return (AsgardError) errorsMap.get(key);
	}

}
