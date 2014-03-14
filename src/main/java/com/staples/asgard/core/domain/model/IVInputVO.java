package com.staples.asgard.core.domain.model;

/**
 * 
 * 
 * Input parameter strings in the inner ArrayList:
 * Field				Size
 * ------				----
 * 0-zipcode			9	
 * 1-sku				240(12 fields x 20)
 * 2-req qty			84(12 fields x 7)
 * 3-avail qty			1
 * 4-min lead time		1	
 * 5-max lead time		1	
 * 6-fullfillment code	1	
 * 7-min deliv date		1
 * 8-max deliv date		1
 * 9-min deliv time		1
 * 10-max deliv time	1
 * 11-shopper location	3
 * 12-store number		5
 * 
 * @author srani
 * 
 */
/**
 * @author srani
 * 
 */
public class IVInputVO {

	private String zipCode;
	private String skuList;
	private String qtyList;
	private String availableQty;
	private String minLeadTime;
	private String maxLeadTime;
	private String fullfillmentCode;
	private String minDeliveryDate;
	private String maxDeliveryDate;
	private String minDeliveryTime;
	private String maxDeliveryTime;
	private String lookupType;
	private String storeId;

	public IVInputVO() {

	}

	/**
	 * @param zipCode
	 * @param skuList
	 * @param qtyList
	 * @param lookupType
	 * @param storeId
	 */
	public IVInputVO(String zipCode, String skuList, String qtyList,
			String lookupType, String storeId) {
		super();
		this.zipCode = zipCode;
		this.skuList = skuList;
		this.qtyList = qtyList;
		this.lookupType = lookupType;
		this.storeId = storeId;
	}

	/**
	 * @param zipCode
	 * @param skuList
	 * @param qtyList
	 * @param availableQty
	 * @param minLeadTime
	 * @param maxLeadTime
	 * @param fullfillmentCode
	 * @param minDeliveryDate
	 * @param maxDeliveryDate
	 * @param minDeliveryTime
	 * @param maxDeliveryTime
	 * @param lookupType
	 * @param storeId
	 */
	public IVInputVO(String zipCode, String skuList, String qtyList,
			String availableQty, String minLeadTime, String maxLeadTime,
			String fullfillmentCode, String minDeliveryDate,
			String maxDeliveryDate, String minDeliveryTime,
			String maxDeliveryTime, String lookupType, String storeId) {
		super();
		this.zipCode = zipCode;
		this.skuList = skuList;
		this.qtyList = qtyList;
		this.availableQty = availableQty;
		this.minLeadTime = minLeadTime;
		this.maxLeadTime = maxLeadTime;
		this.fullfillmentCode = fullfillmentCode;
		this.minDeliveryDate = minDeliveryDate;
		this.maxDeliveryDate = maxDeliveryDate;
		this.minDeliveryTime = minDeliveryTime;
		this.maxDeliveryTime = maxDeliveryTime;
		this.lookupType = lookupType;
		this.storeId = storeId;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getSkuList() {
		return skuList;
	}

	public void setSkuList(String skuList) {
		this.skuList = skuList;
	}

	public String getQtyList() {
		return qtyList;
	}

	public void setQtyList(String qtyList) {
		this.qtyList = qtyList;
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

	public String getAvailableQty() {
		return availableQty;
	}

	public void setAvailableQty(String availableQty) {
		this.availableQty = availableQty;
	}

	public String getMinLeadTime() {
		return minLeadTime;
	}

	public void setMinLeadTime(String minLeadTime) {
		this.minLeadTime = minLeadTime;
	}

	public String getMaxLeadTime() {
		return maxLeadTime;
	}

	public void setMaxLeadTime(String maxLeadTime) {
		this.maxLeadTime = maxLeadTime;
	}

	public String getFullfillmentCode() {
		return fullfillmentCode;
	}

	public void setFullfillmentCode(String fullfillmentCode) {
		this.fullfillmentCode = fullfillmentCode;
	}

	public String getMinDeliveryDate() {
		return minDeliveryDate;
	}

	public void setMinDeliveryDate(String minDeliveryDate) {
		this.minDeliveryDate = minDeliveryDate;
	}

	public String getMaxDeliveryDate() {
		return maxDeliveryDate;
	}

	public void setMaxDeliveryDate(String maxDeliveryDate) {
		this.maxDeliveryDate = maxDeliveryDate;
	}

	public String getMinDeliveryTime() {
		return minDeliveryTime;
	}

	public void setMinDeliveryTime(String minDeliveryTime) {
		this.minDeliveryTime = minDeliveryTime;
	}

	public String getMaxDeliveryTime() {
		return maxDeliveryTime;
	}

	public void setMaxDeliveryTime(String maxDeliveryTime) {
		this.maxDeliveryTime = maxDeliveryTime;
	}

}
