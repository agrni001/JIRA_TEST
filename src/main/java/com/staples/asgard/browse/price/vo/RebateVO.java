package com.staples.asgard.browse.price.vo;

import static com.staples.asgard.core.constants.PriceConstants.DEFAULT_RM;
import static com.staples.asgard.core.constants.PriceConstants.DEFAULT_SCALE;

import java.math.BigDecimal;

/**
 * @author srani
 *
 */
public class RebateVO {

	int typeId = 0;
	BigDecimal amount = null;
	String rebateId = null;
	int complex = 0;
	String url = null;

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount.setScale(DEFAULT_SCALE, DEFAULT_RM);
	}

	public String getRebateId() {
		return rebateId;
	}

	public void setRebateId(String rebateId) {
		this.rebateId = rebateId;
	}

	public int getComplex() {
		return complex;
	}

	public void setComplex(int complex) {
		this.complex = complex;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
