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
public class Rebate {
	private java.lang.String value;

	public void setValue(java.lang.String value) {
		this.value = value;
	}

	public java.lang.String getValue() {
		return value;
	}

	private java.lang.Integer type;

	public void setType(java.lang.Integer type) {
		this.type = type;
	}

	public java.lang.Integer getType() {
		return type;
	}

	private java.lang.String document;

	public void setDocument(java.lang.String document) {
		this.document = document;
	}

	public java.lang.String getDocument() {
		return document;
	}

	private java.lang.Integer complex;

	public void setComplex(java.lang.Integer complex) {
		this.complex = complex;
	}

	public java.lang.Integer getComplex() {
		return complex;
	}

	private java.lang.String rebate_id;

	public void setRebate_id(java.lang.String rebate_id) {
		this.rebate_id = rebate_id;
	}

	public java.lang.String getRebate_id() {
		return rebate_id;
	}

}