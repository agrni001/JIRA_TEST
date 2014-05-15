package com.staples.asgard.core.domain.model.inventory;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * @author srani
 * 
 */
public class SKUOnlineInventoryVO {

	private String sku;

	private Integer availableQuantity;
	private Integer minLeadTime;
	private Integer maxLeadTime;

	@JsonSerialize(using = CustomDateSerializer.class)
	private Date minDeliveryDate;
	@JsonSerialize(using = CustomDateSerializer.class)
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

/**
 * Custom Date serializer to display DATE - in a Date format but not
 * milliSeconds.
 * 
 * @author srani
 * 
 */
class CustomDateSerializer extends JsonSerializer<Date> {

	private String ONLINE_INVENTORY_DATE_FORMAT = "EEE MMM dd hh:mm:ss ZZZ yyyy";

	private String DATE_FORMAT_STR_RFC1123 = "EEE, dd MMM yyyy HH:mm:ss zzz";

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.fasterxml.jackson.databind.JsonSerializer#serialize(java.lang.Object,
	 * com.fasterxml.jackson.core.JsonGenerator,
	 * com.fasterxml.jackson.databind.SerializerProvider)
	 */
	@Override
	public void serialize(Date value, JsonGenerator jsonGenerator,
			SerializerProvider serializerProvider) throws IOException,
			JsonProcessingException {
		try {
			SimpleDateFormat originalFormat = new SimpleDateFormat(
					ONLINE_INVENTORY_DATE_FORMAT);
			SimpleDateFormat targetFormat = new SimpleDateFormat(
					DATE_FORMAT_STR_RFC1123);
			Date date = originalFormat.parse(value.toString());
			String formattedDate = targetFormat.format(date);
			jsonGenerator.writeString(formattedDate.toString());
		} catch (ParseException e) {
			// DO NOTHING
		}
	}
}
