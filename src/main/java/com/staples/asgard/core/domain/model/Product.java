package com.staples.asgard.core.domain.model;

import com.staples.asgard.core.domain.model.price.PriceOutput;


public class Product {
	PriceOutput price = null;

	public PriceOutput getPrice() {
		return price;
	}

	public void setPrice(PriceOutput price) {
		this.price = price;
	}

}
