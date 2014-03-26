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
public class Value {
	private Offers[] offer;

	public void setOffer(Offers[] offer) {
		this.offer = offer;
	}

	public Offers[] getOffer() {
		return offer;
	}

	private java.lang.String zone_id;

	public java.lang.String getZone_id() {
		return zone_id;
	}

	public void setZone_id(java.lang.String zone_id) {
		this.zone_id = zone_id;
	}

	private java.lang.String zone_name;

	public void setZone_name(java.lang.String zone_name) {
		this.zone_name = zone_name;
	}

	public java.lang.String getZone_name() {
		return zone_name;
	}

	private java.lang.Integer precedence;

	public void setPrecedence(java.lang.Integer precedence) {
		this.precedence = precedence;
	}

	public java.lang.Integer getPrecedence() {
		return precedence;
	}

}