package com.staples.asgard.core.domain.model.bloomreach;

import java.io.Serializable;
import java.util.List;

/**
 * This BloomReach Wrapper Value Object (VO), is designed to maintain a single return 
 * type from the BloomReach API calls, regardless of whether that was for a:
 * 	1) BloomReach Related Product API call
 * 	2) BloomReach Related Search API call
 * 	3) BloomReach Thematic Page API call
 * * 
 * Each returned BloomReach Value Object will contain all the required data available for this 
 * widget, in order to paint the required content on the product, category, thematic, or search page.
 * 
 * Each BR Widget VO's API documents should be consulted with respect to the available data, which is
 * highly tailored to each call and data that is available via the BloomReach algorithms and returned content.
 * 
 * Each BR Widget VO will dissect as much data as possible putting them into discrete attributes, made available
 * via getter and setter methods using the JavaBean standard
 *  
 * @author Sapient
 * @date
 * @version 
 *
 * History Of Change
 * Date		Author		Description Of Change
 * ===============================================
 *
 */
public interface IStaplesBloomReachWrapperVO extends Serializable{

	//Keys for localDataStoreMap Map, to locate, store, and retrieve data
	public final static String THEMATIC_VO= "BR_THEMATIC_VO";
	public final static String RELATED_PRODUCT_VO_ARRAY = "BR_RELATED_PRODUCT_VO_ARRAY"; 
	public final static String RELATED_SEARCH_VO_ARRAY = "BR_RELATED_SEARCH_VO_ARRAY";	
	//private Map<String, Object> localDataStoreMap = new HashMap();
	
	/**
	 * BloomReach may from time to time require that the front-end components, 
	 * create a JavaScript variable, object or function (or all of the above) and 
	 * present this on the page for analytics, BR widget functionality, or other reasons.
	 * 
	 * When this data (String) is available it is strongly suggested, that we place the contents of this 
	 * String into a <script language="JavaScript"> element and present the contents as-is on the page.
	 * 
	 * Please note that in order to minimize the size of this object, and allow Staples to maintain the 
	 * ability to easily introspect this JavaScript content, the body of the JavaScript is maintained here-in, 
	 * not the entire JavaScript tag and body, this is also so that a front-end developer could (if they choose to),
	 * integrate this content into an existing JavaScript section of code.
	 * 
	 * @return JavaScript content (body only, no beginning and ending <script> tags)
	 */
	public String retrieveJavaScriptContent();
	
	/**
	 * Retrieve a BloomReach Thematic VO, which will contain all the available
	 * widget(s) that are available for this call.
	 * 
	 * It is very possible that this VO will be null, or contain null VO(s)/Widget(s),
	 * and this case should be properly coded for and handled, as not every BR API 
	 * call will result in a widget to display.
	 * 
	 * @return Thematic Page VO
	 */
	//public IStaplesBloomReachThematicPageVO retrieveThematicPageVO();
	/**
	 * Retrieve a BloomReach Related Product VO List, which will contain all the available
	 * widget(s) that are available for this call.
	 * 
	 * It is very possible that this VO will be null or empty, or contain null data,
	 * and this case should be properly coded for and handled, as not every BR API 
	 * call will result in a widget to display.
	 * 
	 * @return List of Related Products (or null or an empty list)
	 */
	public List<StaplesBloomReachRelatedProductVO> retrieveRelatedProductVOArray();
	/**
	 * Retrieve a BloomReach Related Search VO List, which will contain all the available
	 * widget(s) that are available for this call.
	 * 
	 * It is very possible that this VO will be null or empty, or contain null data,
	 * and this case should be properly coded for and handled, as not every BR API 
	 * call will result in a widget to display.
	 * 
	 * @return List of Related Search (or null or an empty list)
	 */
	public List<StaplesBloomReachRelatedSearchVO> retrieveRelatedSearchVOArray();
	
}

