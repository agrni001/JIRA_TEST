package com.staples.asgard.core.domain.model.inventory;

import java.lang.reflect.InvocationTargetException;

/**
 * 
 * 
 * @author sapient
 * 
 */
public class BloomReachInputVO {

	private String acctId; 
	private String url;
	private String acctAuth;
	private String userAgent;
	private String ref;
	private String pType;
	private String prodId;
	private String prodName;
	private String status;

	
	@SuppressWarnings("unchecked")
	public  BloomReachInputVO(org.springframework.util.LinkedMultiValueMap requestParaMultiValueMap) {
		super();
		 
		try {
			org.apache.commons.beanutils.BeanUtils.populate(this, requestParaMultiValueMap);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} 		 
	}
	

	public BloomReachInputVO(String acctId, String url, String acctAuth,
			String userAgent, String pType, String prodId, String prodName,
			String status) {
		super();
		this.acctId = acctId;
		this.url = url;
		this.acctAuth = acctAuth;
		this.userAgent = userAgent;
		this.pType = pType;
		this.prodId = prodId;
		this.prodName = prodName;
		this.status = status;
	}

	public BloomReachInputVO() {
			super();
	}

	public String getAcctId() {
		return acctId;
	}

	public void setAcctId(String acctId) {
		this.acctId = acctId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getAcctAuth() {
		return acctAuth;
	}

	public void setAcctAuth(String acctAuth) {
		this.acctAuth = acctAuth;
	}

	public String getUserAgent() {
		return userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	public String getpType() {
		return pType;
	}

	public void setpType(String pType) {
		this.pType = pType;
	}

	public String getProdId() {
		return prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}
	   
}
