package com.staples.asgard.browse.price.vo;

import static com.staples.asgard.core.constants.PriceConstants.DEFAULT_RM;
import static com.staples.asgard.core.constants.PriceConstants.DEFAULT_SCALE;

import java.math.BigDecimal;

/**
 * @author srani
 * 
 */
public class BuyMoreSaveMoreVO {

	private BigDecimal price = null;
	private Integer minQty = null;
	private Integer maxQty = null;

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price.setScale(DEFAULT_SCALE, DEFAULT_RM);
	}

	public Integer getMinQty() {
		return minQty;
	}

	public void setMinQty(Integer minQty) {
		this.minQty = minQty;
	}

	public Integer getMaxQty() {
		return maxQty;
	}

	public void setMaxQty(Integer maxQty) {
		this.maxQty = maxQty;
	}

}
