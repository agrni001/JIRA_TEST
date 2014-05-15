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
public class ID {

	/**
	 * 
	 */
	public ID() {
		super();
	}

	/**
	 * @param prod_doc_key
	 */
	public ID(String prod_doc_key) {
		super();
		this.prod_doc_key = prod_doc_key;
	}

	private java.lang.String prod_doc_key;

	public java.lang.String getProd_doc_key() {
		return prod_doc_key;
	}

	public void setProd_doc_key(java.lang.String prod_doc_key) {
		this.prod_doc_key = prod_doc_key;
	}

}
