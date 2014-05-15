package com.staples.asgard.core.domain.model.bloomreach;

import java.util.List;


/**
 * Concrete class which wraps all bloomreach related parsed data
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
public class StaplesBloomReachWrapperVO {

	private List<StaplesBloomReachRelatedProductVO> relatedProductVOList;
	private List<StaplesBloomReachRelatedSearchVO> relatedSearchVOList;
//	private IStaplesBloomReachThematicPageVO thematicPageVO;
	private String javaScriptContent;
	private String fullHTMLContents;
	private String fullyQualifiedURL;
	
		
	public void setFullyQualifiedURL(String fullyQualifiedURL){
		this.fullyQualifiedURL = fullyQualifiedURL;
	}
	public String getFullyQualifiedURL(){
		return this.fullyQualifiedURL;
	}
	public void setFullHTMLContents(String fullHTMLContents){
		this.fullHTMLContents = fullHTMLContents;
	}
	public String getFullHTMLContents(){
		return this.fullHTMLContents;
	}
	public String getJavaScriptContent() {
		return this.javaScriptContent;
	}
	public void setJavaScriptContent(String javaScriptContent) {
		this.javaScriptContent = javaScriptContent;
	}

	public List<StaplesBloomReachRelatedProductVO> getRelatedProducts() {
		return this.relatedProductVOList;
	}
	public void setRelatedProducts(List<StaplesBloomReachRelatedProductVO> relatedProductVOList) {
		this.relatedProductVOList = relatedProductVOList;
	}

	public List<StaplesBloomReachRelatedSearchVO> getRelatedSearches() {
		return this.relatedSearchVOList;
	}
	public void setRelatedSearches(List<StaplesBloomReachRelatedSearchVO> relatedSearchVOList) {
		this.relatedSearchVOList = relatedSearchVOList;
	}

//	public IStaplesBloomReachThematicPageVO retrieveThematicPageVO() {
//		return this.thematicPageVO;
//	}
//	public void setThematicPageVO(IStaplesBloomReachThematicPageVO thematicPageVO) {
//		this.thematicPageVO = thematicPageVO;
//	}
}
