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

	private Integer qtylimit;

	public void setQtylimit(Integer qtylimit) {
		this.qtylimit = qtylimit;
	}

	public Integer getQtylimit() {
		return qtylimit;
	}

	private BigDecimal compareprice;

	public void setCompareprice(BigDecimal compareprice) {
		this.compareprice = compareprice;
	}

	public BigDecimal getCompareprice() {
		return compareprice;
	}

	private Integer maxqty;

	public void setMaxqty(Integer maxqty) {
		this.maxqty = maxqty;
	}

	public Integer getMaxqty() {
		return maxqty;
	}

	private Integer minimumqty;

	public void setMinimumqty(Integer minimumqty) {
		this.minimumqty = minimumqty;
	}

	public Integer getMinimumqty() {
		return minimumqty;
	}

	private java.lang.String offer_id;

	public void setOffer_id(java.lang.String offer_id) {
		this.offer_id = offer_id;
	}

	public java.lang.String getOffer_id() {
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