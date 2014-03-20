package com.staples.asgard.core.domain.model.inventory;

import java.lang.reflect.InvocationTargetException;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * 
 * 
 * @author srani
 * @author ubud
 * 
 */
public class OnlineInventoryInputVO {

	@NotEmpty(message = "The zip-code field is mandatory.")
	@Size(min = 5, max = 5, message = "Length of zip-code has to be minimum 5 and maximum 9 characters.")
	private String zipCode;

	@NotEmpty(message = "The lookupType field is mandatory.")
	@Size(min = 3, max = 3, message = "Length of lookupType has to be 3 characters.")
	private String lookupType;

	private String storeId;

	@NotNull(message = "The sku list is mandatory.")
	private String skuList;

	@NotNull(message = "The quantity list is mandatory.")	 
	private String qtyList;
	
	@SuppressWarnings("unchecked")
	public  OnlineInventoryInputVO(org.springframework.util.LinkedMultiValueMap requestParaMultiValueMap) {
		super();
		 
			try {
				org.apache.commons.beanutils.BeanUtils.populate(this, requestParaMultiValueMap);
			} catch (IllegalAccessException e) {
				
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				
				e.printStackTrace();
			}
 
		 
		 
	}
	
	public OnlineInventoryInputVO(String skuList,String qtyList, String zipCode, String lookupType,
			String storeNumber) {
		super();
		this.skuList = skuList;
		this.qtyList = qtyList;
		this.zipCode = zipCode;
		this.lookupType = lookupType;
		this.storeId = storeNumber;
	}

	public OnlineInventoryInputVO() {
			super();
	}

	public String getSkuList() {
		return skuList;
	}

	public void setSkuList(String skuVOList) {
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

	public String getQtyList() {
		return qtyList;
	}

	public void setQtyList(String qtyList) {
		this.qtyList = qtyList;
	}
	   
}
