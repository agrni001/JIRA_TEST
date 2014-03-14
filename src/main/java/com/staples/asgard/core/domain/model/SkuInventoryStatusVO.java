package com.staples.asgard.core.domain.model;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author srani
 * 
 */
public class SkuInventoryStatusVO {

	@NotEmpty(message = "The sku field is mandatory.")
	@Size(min = 1, max = 20, message = "Length of sku has to be minimum 1 and maximum 20 characters.")
	private String sku;

	@NotNull(message = "The available quantity field is mandatory.")
	@Size(min = 1, max = 7, message = "Length of available quantity has to be minimum 1 and maximum 7 characters.")
	private Integer availableQuantity;
	private Integer minLeadTime;
	private Integer maxLeadTime;

	private Date minDeliveryDate;
	private Date maxDeliveryDate;
	private Integer minDeliveryTime;
	private Integer maxDeliveryTime;
	private Integer requestedQuantity;

	public SkuInventoryStatusVO() {

	}

	/**
	 * @param sku
	 */
	public SkuInventoryStatusVO(String sku) {
		super();
		this.sku = sku;
	}

	/**
	 * @param sku
	 * @param requestedQuantity
	 */
	public SkuInventoryStatusVO(String sku, Integer requestedQuantity) {
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
	public SkuInventoryStatusVO(String sku, Integer availableQuantity, Integer minLeadTime, Integer maxLeadTime,
			Date minDeliveryDate, Date maxDeliveryDate, Integer minDeliveryTime, Integer maxDeliveryTime,
			Integer requestedQuantity) {
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
