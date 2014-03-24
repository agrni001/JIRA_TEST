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
public class Promotion {
	private java.lang.String freeshipping;

	public void setFreeshipping(java.lang.String freeshipping) {
		this.freeshipping = freeshipping;
	}

	public java.lang.String getFreeshipping() {
		return freeshipping;
	}

	private Promomessage[] promomessage;

	public void setPromomessage(Promomessage[] promomessage) {
		this.promomessage = promomessage;
	}

	public Promomessage[] getPromomessage() {
		return promomessage;
	}

	private Autoaddpromotion autoaddpromotion;

	public Autoaddpromotion getAutoaddpromotion() {
		return autoaddpromotion;
	}

	public void setAutoaddpromotion(Autoaddpromotion autoaddpromotion) {
		this.autoaddpromotion = autoaddpromotion;
	}

}