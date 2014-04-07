package com.staples.asgard.core.domain.model.price;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author srani
 * 
 */
@JsonAutoDetect(getterVisibility = Visibility.PUBLIC_ONLY, setterVisibility = Visibility.PUBLIC_ONLY, fieldVisibility = Visibility.PUBLIC_ONLY)
@JsonInclude(Include.NON_NULL)
public class PriceOutput {

	private int user_price_flag;

	public void setUser_price_flag(int user_price_flag) {
		this.user_price_flag = user_price_flag;
	}

	public int getUser_price_flag() {
		return user_price_flag;
	}

	private Offers[] offers;

	public void setOffers(Offers[] offers) {
		this.offers = offers;
	}

	public Offers[] getOffers() {
		return offers;
	}

	private String currency;

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCurrency() {
		return currency;
	}

	private Rebate[] rebates;

	public void setRebates(Rebate[] rebates) {
		this.rebates = rebates;
	}

	public Rebate[] getRebates() {
		return rebates;
	}

	private Promotion promotions;

	public void setPromotions(Promotion promotions) {
		this.promotions = promotions;
	}

	public Promotion getPromotions() {
		return promotions;
	}

	private String uom;

	public void setUom(String uom) {
		this.uom = uom;
	}

	public String getUom() {
		return uom;
	}

	private ID _id = null;

	public ID get_id() {
		return _id;
	}

	public void set_id(ID _id) {
		this._id = _id;
	}

}