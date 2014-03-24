package com.staples.asgard.core.domain.model.price;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * SKU RequestVO - for PRICING
 * 
 * @author srani
 * 
 */
@JsonAutoDetect(getterVisibility = Visibility.PUBLIC_ONLY, setterVisibility = Visibility.PUBLIC_ONLY, fieldVisibility = Visibility.PUBLIC_ONLY)
@JsonInclude(Include.NON_NULL)
public class SKURequestVO {

	private String docKey = null;

	private int user_price_flag = 0;

	private String suffix = "";

	/**
	 * @return
	 */
	public String getDocKey() {
		return docKey;
	}

	/**
	 * @param docKey
	 */
	public void setDocKey(String docKey) {
		this.docKey = docKey;
	}

	/**
	 * @return
	 */
	public int getUser_price_flag() {
		return user_price_flag;
	}

	/**
	 * @param user_price_flag
	 */
	public void setUser_price_flag(int user_price_flag) {
		this.user_price_flag = user_price_flag;
	}

	/**
	 * @return
	 */
	public String getSuffix() {
		return suffix;
	}

	/**
	 * @param suffix
	 */
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

}
