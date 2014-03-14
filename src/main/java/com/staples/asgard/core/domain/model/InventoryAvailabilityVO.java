package com.staples.asgard.core.domain.model;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * 
 * 
 * @author srani
 * 
 */
public class InventoryAvailabilityVO {

	@NotEmpty(message = "The zip-code field is mandatory.")
	@Pattern(regexp = "[0-9]*", message = "Length of zip-code has to be minimum 5 and maximum 9 characters.")
	@Size(min = 5, max = 5, message = "Length of zip-code has to be minimum 5 and maximum 9 characters.")
	private String zipCode;

	@NotEmpty(message = "The lookupType field is mandatory.")
	@Size(min = 3, max = 3, message = "Length of lookupType has to be 3 characters.")
	private String lookupType;

	private String storeId;

	@NotNull(message = "The sku list is mandatory.")
	private List<SkuInventoryStatusVO> skuList;

	public InventoryAvailabilityVO(List<SkuInventoryStatusVO> skuVOList, String zipCode, String lookupType,
			String storeNumber) {
		super();
		this.skuList = skuVOList;
		this.zipCode = zipCode;
		this.lookupType = lookupType;
		this.storeId = storeNumber;
	}

	public InventoryAvailabilityVO() {

	}

	public List<SkuInventoryStatusVO> getSkuList() {
		return skuList;
	}

	public void setSkuList(List<SkuInventoryStatusVO> skuVOList) {
		this.skuList = skuVOList;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getLookupType() {
		return lookupType;
	}

	public void setLookupType(String shopperLocationFlag) {
		this.lookupType = shopperLocationFlag;
	}

	public String getStoreId() {
		return storeId;
	}

	public void setStoreId(String storeNumber) {
		this.storeId = storeNumber;
	}

}
