package com.staples.asgard.core.domain.model.bloomreach;

public class StaplesBloomReachRelatedProductVO {

	private String fullHTMLForWidget;
	private String cssStylingForElement;
	private boolean isProductFlag;
	private boolean isCategoryFlag;
	private boolean isRelatedProductFlag;
	private boolean isRelatedSearchFlag;
	private boolean isThematicPageFlag;
	private String widgetName;
	private String identifier;
	private String uniqueId;
	private String url;
	private String altTextForImage;
	private String imageURL;
	private String longDescription;
	private String shortDescription;
	private String title;
	
	public StaplesBloomReachRelatedProductVO() {
		
	}
	
	/* (non-Javadoc)
	 * @see com.staples.nad.integration.sbd.bloomreach.data.IStaplesBloomReachVO#setTitle(java.lang.String)
	 */
	public void setTitle(String title) {
		this.title = title;

	}
	/* (non-Javadoc)
	 * @see com.staples.nad.integration.sbd.bloomreach.data.IStaplesBloomReachVO#getTitle()
	 */
	public String getTitle() {
		return title;
	}
	/* (non-Javadoc)
	 * @see com.staples.nad.integration.sbd.bloomreach.data.IStaplesBloomReachVO#getShortDescription()
	 */
	public String getShortDescription() {
		return shortDescription;
	}

	/* (non-Javadoc)
	 * @see com.staples.nad.integration.sbd.bloomreach.data.IStaplesBloomReachVO#setShortDescription(java.lang.String)
	 */
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;

	}
	
	/* (non-Javadoc)
	 * @see com.staples.nad.integration.sbd.bloomreach.data.IStaplesBloomReachVO#getLongDescription()
	 */
	public String getLongDescription() {
		return longDescription;
	}


	/* (non-Javadoc)
	 * @see com.staples.nad.integration.sbd.bloomreach.data.IStaplesBloomReachVO#setLongDescription(java.lang.String)
	 */
	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;

	}
	
	
	/**
	 * Sets the Alternate Text for the Image
	 * 
	 * @param anchorTextForImage
	 */
	public void setAltTextForImage(String altTextForImage){
		this.altTextForImage = altTextForImage;
	}
	
	/**
	 * Retrieves the Alternate Text for the Image
	 * 
	 * return altTextForImage
	 */
	public String getAltTextForImage(){
		return altTextForImage;
	}
	
	/* (non-Javadoc)
	 * @see com.staples.nad.integration.sbd.bloomreach.data.IStaplesBloomReachVO#getImageURL()
	 */
	
	public String getImageURL() {
		return imageURL;
	}
	
	/* (non-Javadoc)
	 * @see com.staples.nad.integration.sbd.bloomreach.data.IStaplesBloomReachVO#setImageURL(java.lang.String)
	 */
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;

	}

	public String getFullHTMLForWidget() {
		return fullHTMLForWidget;
	}

	public void setFullHTMLForWidget(String fullHTMLForWidget) {
		this.fullHTMLForWidget = fullHTMLForWidget;
	}

	public String getCssStylingForElement() {
		return cssStylingForElement;
	}

	public void setCssStylingForElement(String cssStylingForElement) {
		this.cssStylingForElement = cssStylingForElement;
	}

	public boolean isProductFlag() {
		return isProductFlag;
	}

	public void setProductFlag(boolean isProductFlag) {
		this.isProductFlag = isProductFlag;
	}

	public boolean isCategoryFlag() {
		return isCategoryFlag;
	}

	public void setCategoryFlag(boolean isCategoryFlag) {
		this.isCategoryFlag = isCategoryFlag;
	}

	public boolean isRelatedProductFlag() {
		return isRelatedProductFlag;
	}

	public void setRelatedProductFlag(boolean isRelatedProductFlag) {
		this.isRelatedProductFlag = isRelatedProductFlag;
	}

	public boolean isRelatedSearchFlag() {
		return isRelatedSearchFlag;
	}

	public void setRelatedSearchFlag(boolean isRelatedSearchFlag) {
		this.isRelatedSearchFlag = isRelatedSearchFlag;
	}

	public boolean isThematicPageFlag() {
		return isThematicPageFlag;
	}

	public void setThematicPageFlag(boolean isThematicPageFlag) {
		this.isThematicPageFlag = isThematicPageFlag;
	}

	public String getWidgetName() {
		return widgetName;
	}

	public void setWidgetName(String widgetName) {
		this.widgetName = widgetName;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}	

}
