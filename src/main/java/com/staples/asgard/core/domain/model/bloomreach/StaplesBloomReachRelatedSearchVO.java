package com.staples.asgard.core.domain.model.bloomreach;

public class StaplesBloomReachRelatedSearchVO {

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
	private String anchorTextForURL;
	private String headlinerDescription;
	
	public StaplesBloomReachRelatedSearchVO() {
		
	}	

	
	/* (non-Javadoc)
	 * @see com.staples.nad.integration.sbd.bloomreach.data.IStaplesBloomReachRelatedSearchVO#getAnchorTextForURL()
	 */
	public String getAnchorTextForURL() {
		return anchorTextForURL;
	}
	/* (non-Javadoc)
	 * @see com.staples.nad.integration.sbd.bloomreach.data.IStaplesBloomReachRelatedSearchVO#setAnchorTextForURL(java.lang.String)
	 */
	public void setAnchorTextForURL(String anchorTextForURL) {
		this.anchorTextForURL = anchorTextForURL;
	}
	/* (non-Javadoc)
	 * @see com.staples.nad.integration.sbd.bloomreach.data.IStaplesBloomReachRelatedSearchVO#getHeadlinerDescription()
	 */
	public String getHeadlinerDescription() {
		return headlinerDescription;
	}
	/* (non-Javadoc)
	 * @see com.staples.nad.integration.sbd.bloomreach.data.IStaplesBloomReachRelatedSearchVO#setHeadlinerDescription(java.lang.String)
	 */
	public void setHeadlinerDescription(String headliner) {
		this.headlinerDescription = headliner;

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
