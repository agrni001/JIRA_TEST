package com.staples.asgard.core.domain.model.inventory;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author srani
 * 
 */
public class SKUOnlineInventoryVO {

	private String sku;

	private Integer availableQuantity;
	private Integer minLeadTime;
	private Integer maxLeadTime;

	private Date minDeliveryDate;
	private Date maxDeliveryDate;
	private Integer minDeliveryTime;
	private Integer maxDeliveryTime;
	private Integer requestedQuantity;

	public SKUOnlineInventoryVO() {

	}

	/**
	 * @param sku
	 */
	public SKUOnlineInventoryVO(String sku) {
		super();
		this.sku = sku;
	}

	/**
	 * @param sku
	 * @param requestedQuantity
	 */
	public SKUOnlineInventoryVO(String sku, Integer requestedQuantity) {
		super();
		this.sku = sku;
		this.requestedQuantity = requestedQuantity;
	}

	/**
	 * @param sku
	 * @param availableQuantity
	 * @param minLeadTime
	 * @param maxLeadTime
	 * @param minDeliveryDate
	 * @param maxDeliveryDate
	 * @param minDeliveryTime
	 * @param maxDeliveryTime
	 * @param requestedQuantity
	 */
	public SKUOnlineInventoryVO(String sku, Integer availableQuantity,
			Integer minLeadTime, Integer maxLeadTime, Date minDeliveryDate,
			Date maxDeliveryDate, Integer minDeliveryTime,
			Integer maxDeliveryTime, Integer requestedQuantity) {
		super();
		this.sku = sku;
		this.availableQuantity = availableQuantity;
		this.minLeadTime = minLeadTime;
		this.maxLeadTime = maxLeadTime;
		this.minDeliveryDate = minDeliveryDate;
		this.maxDeliveryDate = maxDeliveryDate;
		this.minDeliveryTime = minDeliveryTime;
		this.maxDeliveryTime = maxDeliveryTime;
		this.requestedQuantity = requestedQuantity;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public Integer getAvailableQuantity() {
		return availableQuantity;
	}

	public void setAvailableQuantity(Integer availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	public Integer getMinLeadTime() {
		return minLeadTime;
	}

	public void setMinLeadTime(Integer minLeadTime) {
		this.minLeadTime = minLeadTime;
	}

	public Integer getMaxLeadTime() {
		return maxLeadTime;
	}

	public void setMaxLeadTime(Integer maxLeadTime) {
		this.maxLeadTime = maxLeadTime;
	}

	public Date getMinDeliveryDate() {
		return minDeliveryDate;
	}

	public void setMinDeliveryDate(Date minDeliveryDate) {
		this.minDeliveryDate = minDeliveryDate;
	}

	public Date getMaxDeliveryDate() {
		return maxDeliveryDate;
	}

	public void setMaxDeliveryDate(Date maxDeliveryDate) {
		this.maxDeliveryDate = maxDeliveryDate;
	}

	public Integer getMinDeliveryTime() {
		return minDeliveryTime;
	}

	public void setMinDeliveryTime(Integer minDeliveryTime) {
		this.minDeliveryTime = minDeliveryTime;
	}

	public Integer getMaxDeliveryTime() {
		return maxDeliveryTime;
	}

	public void setMaxDeliveryTime(Integer maxDeliveryTime) {
		this.maxDeliveryTime = maxDeliveryTime;
	}

	public Integer getRequestedQuantity() {
		return requestedQuantity;
	}

	public void setRequestedQuantity(Integer requestedQuantity) {
		this.requestedQuantity = requestedQuantity;
	}
}