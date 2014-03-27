package com.staples.asgard.browse.price.vo;

import static com.staples.asgard.core.constants.PriceConstants.DEFAULT_RM;
import static com.staples.asgard.core.constants.PriceConstants.DEFAULT_SCALE;

import java.math.BigDecimal;

/**
 * @author srani
 *
 */
public class CouponVO {

	boolean isAuto = false;

	String code = null;

	BigDecimal amount = null;

	public boolean isAuto() {
		return isAuto;
	}

	public void setAuto(boolean isAuto) {
		this.isAuto = isAuto;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount.setScale(DEFAULT_SCALE, DEFAULT_RM);
	}
}
