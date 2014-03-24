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
public class Promomessage {

	public Promomessage(Integer typeid) {
		super();
		this.typeid = typeid;
	}

	public Promomessage() {
	}

	private java.lang.String enddate;

	public void setEnddate(java.lang.String enddate) {
		this.enddate = enddate;
	}

	public java.lang.String getEnddate() {
		return enddate;
	}

	private java.lang.String startdate;

	public void setStartdate(java.lang.String startdate) {
		this.startdate = startdate;
	}

	public java.lang.String getStartdate() {
		return startdate;
	}

	private java.lang.String text;

	public void setText(java.lang.String text) {
		this.text = text;
	}

	public java.lang.String getText() {
		return text;
	}

	private java.lang.Integer typeid;

	public void setTypeid(java.lang.Integer typeid) {
		this.typeid = typeid;
	}

	public java.lang.Integer getTypeid() {
		return typeid;
	}

	private java.lang.String name;

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getName() {
		return name;
	}

	private java.lang.String promoValue;

	public void setPromoValue(java.lang.String promoValue) {
		this.promoValue = promoValue;
	}

	public java.lang.String getPromoValue() {
		return promoValue;
	}

	private java.lang.String promoType;

	public void setPromoType(java.lang.String promoType) {
		this.promoType = promoType;
	}

	public java.lang.String getPromoType() {
		return promoType;
	}

	public boolean equals(Promomessage promotion) {
		boolean result;
		if ((promotion == null) || (getClass() != promotion.getClass())) {
			result = false;
		} // end if
		else {
			result = typeid.equals(promotion.typeid);
		} // end else

		return result;
	}

}