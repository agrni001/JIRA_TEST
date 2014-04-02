package com.staples.asgard.core.domain.model.inventory;

import java.lang.reflect.InvocationTargetException;

import org.hibernate.validator.constraints.NotEmpty;


/**
 * This class encapsulates input data required to make Certona Recommendation call
 * 
 * @author Sapient
 * 
 */
public class CertonaInputVO {
	
	private String cartTotal;
	
	@NotEmpty(message = "The scheme field is mandatory.")
	private String scheme;
	
	private String pageType;
	private String number;
	
	@NotEmpty(message = "The pageId field is mandatory.")
	private String pageId;
	
	private String lang;
	private String url;
	
	@NotEmpty(message = "The context (partnumber) field is mandatory.")
	private String context;
	
	private String clientIp;
	
	private String trackingId;
	
	@NotEmpty(message = "The catalog field is mandatory.")
	private String catalog;
	
	@NotEmpty(message = "The appId field is mandatory.")
	private String appId;

	
	@SuppressWarnings("unchecked")
	public  CertonaInputVO(org.springframework.util.LinkedMultiValueMap requestParaMultiValueMap) {
		super();
		 
		try {
			org.apache.commons.beanutils.BeanUtils.populate(this, requestParaMultiValueMap);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} 		 
	}	
	
	public CertonaInputVO(String cartTotal, String scheme,
			String pageType, String number, String pageId, String lang,
			String url, String context, String clientIp, String trackingId,
			String catalog, String appId) {
		super();
		this.cartTotal = cartTotal;
		this.scheme = scheme;
		this.pageType = pageType;
		this.number = number;
		this.pageId = pageId;
		this.lang = lang;
		this.url = url;
		this.context = context;
		this.clientIp = clientIp;
		this.trackingId = trackingId;
		this.catalog = catalog;
		this.appId = appId;
	}



	public CertonaInputVO() {

	}


	public String getCartTotal() {
		return cartTotal;
	}


	public void setCartTotal(String cartTotal) {
		this.cartTotal = cartTotal;
	}


	public String getScheme() {
		return scheme;
	}


	public void setScheme(String scheme) {
		this.scheme = scheme;
	}


	public String getPageType() {
		return pageType;
	}


	public void setPageType(String pageType) {
		this.pageType = pageType;
	}


	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	public String getPageId() {
		return pageId;
	}


	public void setPageId(String pageId) {
		this.pageId = pageId;
	}


	public String getLang() {
		return lang;
	}


	public void setLang(String lang) {
		this.lang = lang;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public String getContext() {
		return context;
	}


	public void setContext(String context) {
		this.context = context;
	}


	public String getClientIp() {
		return clientIp;
	}


	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}


	public String getTrackingId() {
		return trackingId;
	}


	public void setTrackingId(String trackingId) {
		this.trackingId = trackingId;
	}


	public String getCatalog() {
		return catalog;
	}


	public void setCatalog(String catalog) {
		this.catalog = catalog;
	}


	public String getAppId() {
		return appId;
	}


	public void setAppId(String appId) {
		this.appId = appId;
	}



}
