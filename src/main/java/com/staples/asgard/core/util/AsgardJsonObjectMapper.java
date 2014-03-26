/**
 * 
 */
package com.staples.asgard.core.util;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * @author ubud
 *
 */
public class AsgardJsonObjectMapper extends ObjectMapper {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4955570117095072103L;
	 

	public AsgardJsonObjectMapper() {
	    super();
	    this.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
	    this.configure(SerializationFeature.WRAP_ROOT_VALUE, true);
	    this.setSerializationInclusion(Include.NON_NULL);
	     
	    setVisibilityChecker(getSerializationConfig()
                .getDefaultVisibilityChecker()
                .withCreatorVisibility(JsonAutoDetect.Visibility.NONE)
                .withFieldVisibility(JsonAutoDetect.Visibility.NONE)
                .withGetterVisibility(JsonAutoDetect.Visibility.PUBLIC_ONLY)
                .withIsGetterVisibility(JsonAutoDetect.Visibility.NONE)
                .withSetterVisibility(JsonAutoDetect.Visibility.PUBLIC_ONLY));
	    
	   }
	 
	
}
