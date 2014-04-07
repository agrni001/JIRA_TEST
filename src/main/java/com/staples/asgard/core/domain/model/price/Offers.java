package com.staples.asgard.core.domain.model.price;

import java.math.BigDecimal;

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
public class Offers {
	private java.lang.String tradeposcn_id;

	public void setTradeposcn_id(java.lang.String tradeposcn_id) {
		this.tradeposcn_id = tradeposcn_id;
	}

	public java.lang.String getTradeposcn_id() {
		return tradeposcn_id;
	}

	private java.lang.String qtylimit;

	public void setQtylimit(java.lang.String qtylimit) {
		this.qtylimit = qtylimit;
	}

	public java.lang.String getQtylimit() {
		return qtylimit;
	}

	private BigDecimal compareprice;

	public void setCompareprice(BigDecimal compareprice) {
		this.compareprice = compareprice;
	}

	public BigDecimal getCompareprice() {
		return compareprice;
	}

	private java.lang.String maxqty;

	public void setMaxqty(java.lang.String maxqty) {
		this.maxqty = maxqty;
	}

	public java.lang.String getMaxqty() {
		return maxqty;
	}

	private java.lang.String minimumqty;

	public void setMinimumqty(java.lang.String minimumqty) {
		this.minimumqty = minimumqty;
	}

	public java.lang.String getMinimumqty() {
		return minimumqty;
	}

	private java.lang.Integer offer_id;

	public void setOffer_id(java.lang.Integer offer_id) {
		this.offer_id = offer_id;
	}

	public java.lang.Integer getOffer_id() {
		return offer_id;
	}

	private BigDecimal price;

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getPrice() {
		return price;
	}

	private java.lang.Integer precedence;

	public void setPrecedence(java.lang.Integer precedence) {
		this.precedence = precedence;
	}

	public java.lang.Integer getPrecedence() {
		return precedence;
	}

}