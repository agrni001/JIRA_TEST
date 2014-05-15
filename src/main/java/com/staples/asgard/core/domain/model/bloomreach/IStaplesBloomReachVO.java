package com.staples.asgard.core.domain.model.bloomreach;

import java.io.Serializable;


/**
 * BloomReach Value Object (VO) that contains individual components or widgets 
 * specific to a unique product, category, related search or 
 * thematic component.
 * 
 * These VOs will be the data objects that hold all known data for the BloomReach API calls, 
 * and should be used to store additional information in the future.
 * 
 * @author Sapient
 *
 * History Of Change
 * Date		Author		Description Of Change
 * ===============================================
 * 
 */
public interface IStaplesBloomReachVO extends Serializable {

	final static String WIDGET_THEMATIC_PAGE_LEFTNAV_LIST = "THEMATIC_PAGE_LEFTNAV_LIST";
	final static String WIDGET_THEMATIC_PAGEHEADER = "THEMATIC_PAGE_HEADER";
	final static String WIDGETTHEMATIC_THEME_LIST = "WIDGETTHEMATIC_THEME_LIST";
	final static String WIDGET_THEMATIC_LEFT_NAV_RELATED_CATEGORIES = "Related Categories";
	final static String WIDGET_THEMATIC_LEFT_NAV_RELATED_PAGES = "Related Pages";
	final static String WIDGET_RELATED_PRODUCT_LIST = "Related Products";
	final static String WIDGET_RELATED_SEARCH_LIST = "Related Searches";
	
	public void setIsCategoryFlag(boolean isCategoryFlag);
	public boolean getIsCategoryFlag();
	public void setIsProductFlag(boolean isCategoryFlag);
	public boolean getIsProductFlag();
	
	public String getName();
	public void setName(String widgetName);
	/**
	 * Returns the identifier for this widget, if it belongs to either a Product
	 * or Category that is recognized by the system return String identifier
	 */
	public String getIdentifier();

	/**
	 * Sets this identifier for this widget, if it belongs to either a Product
	 * or Category that is recognized by the system
	 * 
	 * @param identifier
	 */
	public void setIdentifier(String identifier);

	/**
	 * Returns the uniqueId for this widget, if it belongs to either a Product
	 * or Category that is recognized by the system return String uniqueId
	 */
	public String getUniqueId();

	/**
	 * Sets this uniqueId for this widget, if it belongs to either a Product or
	 * Category that is recognized by the system
	 * 
	 * @param uniqueId
	 */
	public void setUniqueId(String uniqueId);
	
	/**
	 * Retrieves the URL for this widget
	 * 
	 * return URL
	 */
	public String getURL();

	/**
	 * Sets this URL for this widget
	 * 
	 * @param URL
	 */
	public void setURL(String url);
	
	/**
	 * Retrieves the entire HTML for this widget This is used when this widget
	 * has NO math story element and the HTML can be displayed as is.
	 * 
	 * @see getAddToCartFlag()
	 * 
	 * @param fullHTML
	 */
	public String getFullHTMLForWidget();

	/**
	 * Sets the entire HTML for this widget This is used when this widget has NO
	 * math story element and the HTML
	 * 
	 * @see getAddToCartFlag()
	 * 
	 *      can be displayed as is.
	 * 
	 * @param fullHTML
	 */
	public void setFullHTMLForWidget(String fullHTML);
	
	/**
	 * Get the type of widget the data in this Value Object (VO) belongs to
	 * @return boolean- true if this is a thematic widget 
	 */
	public boolean getIsThematicWidget();
	/**
	 * Set the type of widget the data in this Value Object (VO) belongs to
	 * @param isThematicWidget - true if this is a thematic widget 
	 */
	public void setIsThematicWidget(boolean isThematicWidget );
	/**
	 * Get the type of widget the data in this Value Object (VO) belongs to
	 * @return boolean- true if this is a Related Product widget 
	 */
    public boolean getIsRelatedProductWidget();
    /**
	 * Set the type of widget the data in this Value Object (VO) belongs to
	 * @param isRelatedProductWidget - true if this is a thematic widget 
	 */
    public void setIsRelatedProductWidget(boolean isRelatedProductWidget);
    
    /**
	 * Get the type of widget the data in this Value Object (VO) belongs to
	 * @return boolean- true if this is a Related Search widget 
	 */
    public boolean getIsRelatedSearchWidget();
    /**
	 * Set the type of widget the data in this Value Object (VO) belongs to
	 * @param isRelatedSearchWidget - true if this is a thematic widget 
	 */
    public void setIsRelatedSearchWidget(boolean isRelatedSearchWidget);
    
    /**
     * Allows generic storage of data that is meant only for internal data passing.
     * 
     * @param dataKey
     * @return
     */
    public Object getData(String dataKey);
    public void setData(String dataKey, Object dataValue);
    
    
//    /**
//     * Retrieves the title for this widget, used for displaying the title for this widget, or can be 
//     * used as alternate text for ADA compliance or a
//     * return title
//     */
//    public String getTitle();
//    /**
//     * Sets this title for this widget, used for displaying the title for this widget, or can be 
//     * used as alternate text for ADA compliance or a
//     * @param title
//     */
//    public void setTitle(String title);
//

    /**
     * Store and Retrieve Styling Facets needed and configured per API
     * @return CSS Style (apply optionally)
     */
    public String getCSSStyling();
    /**
     * Store and Retrieve Styling Facets needed and configured per API
     * @param cssStyling (optional)
     */
    public void setCSSStyling(String cssStyling);
}


