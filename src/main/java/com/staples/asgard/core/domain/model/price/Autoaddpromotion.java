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
public class Autoaddpromotion {
	private java.lang.String code;

	public void setCode(java.lang.String code) {
		this.code = code;
	}

	public java.lang.String getCode() {
		return code;
	}

	private BigDecimal couponvalue;

	public void setCouponValue(BigDecimal couponvalue) {
		this.couponvalue = couponvalue;
	}

	public BigDecimal getCouponValue() {
		return couponvalue;
	}
}
