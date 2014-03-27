/**
 * 
 */
package com.staples.asgard.core.domain.model.inventory;

/**
 * @author sapient
 *
 */
public class BloomReachOutputVO {
	
 	private String htmlContent;
 	
	public BloomReachOutputVO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param htmlContent
	 */
	public BloomReachOutputVO(String htmlContent) {
		super();
		this.htmlContent = htmlContent;
	}

	public String getHtmlContent() {
		return htmlContent;
	}

	public void setHtmlContent(String htmlContent) {
		this.htmlContent = htmlContent;
	}
}
