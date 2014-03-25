package com.staples.asgard.browse.price.vo;

import static com.staples.asgard.core.constants.PriceConstants.DEFAULT_RM;
import static com.staples.asgard.core.constants.PriceConstants.DEFAULT_SCALE;

import java.math.BigDecimal;

/**
 * @author srani
 *
 */
public class DiscountVO {

	BigDecimal amount = null;
	String currency = null;
	boolean deductFromListPrice = false;
	String name = null;

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount.setScale(DEFAULT_SCALE, DEFAULT_RM);
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public boolean isDeductFromListPrice() {
		return deductFromListPrice;
	}

	public void setDeductFromListPrice(boolean deductFromListPrice) {
		this.deductFromListPrice = deductFromListPrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
