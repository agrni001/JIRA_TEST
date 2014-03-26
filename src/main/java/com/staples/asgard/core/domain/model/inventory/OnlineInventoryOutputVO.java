/**
 * 
 */
package com.staples.asgard.core.domain.model.inventory;

import java.util.ArrayList;
import java.util.List;


/**
 * @author ubud
 *
 */
public class OnlineInventoryOutputVO {
	
 	private String zipCode;
 	private String lookupType;
	private String storeId;
	List<SKUOnlineInventoryVO> skuInventoryStatus = new ArrayList<SKUOnlineInventoryVO>();


	/**
	 * 
	 */
	public OnlineInventoryOutputVO() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param zipCode
	 * @param lookupType
	 * @param storeId
	 */
	public OnlineInventoryOutputVO(String zipCode, String lookupType,
			String storeId) {
		super();
		this.zipCode = zipCode;
		this.lookupType = lookupType;
		this.storeId = storeId;
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


	public void setLookupType(String lookupType) {
		this.lookupType = lookupType;
	}


	public String getStoreId() {
		return storeId;
	}


	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}


	public List<SKUOnlineInventoryVO> getSkuInventoryStatus() {
		return skuInventoryStatus;
	}


	public void setSkuInventoryStatus(List<SKUOnlineInventoryVO> skuInventoryStatus) {
		this.skuInventoryStatus = skuInventoryStatus;
	}

}
