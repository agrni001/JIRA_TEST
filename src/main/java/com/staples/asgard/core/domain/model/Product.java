package com.staples.asgard.core.domain.model;

import com.staples.asgard.core.price.vo.PriceOutputVO;


public class Product {
	PriceOutputVO price = null;

	public PriceOutputVO getPrice() {
		return price;
	}

	public void setPrice(PriceOutputVO price) {
		this.price = price;
	}

}
