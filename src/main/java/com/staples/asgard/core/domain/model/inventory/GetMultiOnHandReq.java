//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.07 at 01:43:26 PM EDT 
//

package com.staples.asgard.core.domain.model.inventory;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.LinkedMultiValueMap;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * <p>
 * Java class for getMultiOnHandReq complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMultiOnHandReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requesterId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="locale" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemDetails" type="{http://is.mvs.staples.com/}getAllitemsDetailReqType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType (XmlAccessType.FIELD)
@XmlType (name = "getMultiOnHandReq", propOrder = { "requesterId", "locale", "itemDetails" })
@XmlRootElement (name = "getMultiOnHandReq", namespace = "http://is.mvs.staples.com/")
@JsonAutoDetect (getterVisibility = Visibility.PROTECTED_AND_PUBLIC,
				setterVisibility = Visibility.PROTECTED_AND_PUBLIC, fieldVisibility = Visibility.PROTECTED_AND_PUBLIC)
@JsonInclude (Include.NON_NULL)
public class GetMultiOnHandReq implements Serializable {

	private static final Logger LOGGER = LoggerFactory.getLogger(GetMultiOnHandReq.class);

	private static final long serialVersionUID = -4252825456450806156L;

	/**
	 * Default Constructor
	 */
	public GetMultiOnHandReq() {
		super();
	}

	/**
	 * This Method Extracts the REquest Values and then Creates the Object that needs to validated
	 * and then transformed for the Browse to IG invocation. BeanUtils.populate is NOT being used as
	 * there are Multiple Object iterations that need to be considered.
	 * 
	 * @param requestParaMultiValueMap Type Of LinkedMultiValueMap<String, String>
	 */
	public GetMultiOnHandReq(LinkedMultiValueMap<String, String> requestParaMultiValueMap) {
		super();
		try {
			/* Extract Item Id and Store Number and create the Object. */
			if (requestParaMultiValueMap.get("itemId") != null) {
				this.setItemId(requestParaMultiValueMap.get("itemId").get(0));
			}
			if (requestParaMultiValueMap.get("storeNum") != null) {
				this.setStoreNum(requestParaMultiValueMap.get("storeNum").get(0));
			}
			RequestItem requestItemDetails = new RequestItem();
			requestItemDetails.setItemId(this.getItemId());
			requestItemDetails.setStoreNum(this.getStoreNum());

			/* Instantiate Object to pass the Item ID and Store Number */
			GetAllitemsDetailReqType objItemDetails = new GetAllitemsDetailReqType();
			objItemDetails.getItem().add(requestItemDetails);
			this.setItemDetails(objItemDetails);

			/* Requester ID and Locale */
			if (requestParaMultiValueMap.get("requesterId") != null) {
				this.setRequesterId(requestParaMultiValueMap.get("requesterId").get(0));
			}
			if (requestParaMultiValueMap.get("locale") != null) {
				this.setLocale(requestParaMultiValueMap.get("locale").get(0));
			}
		} catch (Exception exception) {
			exception.printStackTrace();
			LOGGER.error("Error ocurred in GetMultiOnHandReq(Exception): " + exception.getMessage());
		}
	}

	/*
	 * Needed for the Transformation only Not a part of the Object to be made the Service call.
	 */
	@XmlTransient
	protected String itemId;
	@XmlTransient
	protected String storeNum;

	@XmlElement (required = true, namespace = "http://is.mvs.staples.com/")
	protected String requesterId;
	@XmlElement (required = true, namespace = "http://is.mvs.staples.com/")
	protected String locale;
	@XmlElement (namespace = "http://is.mvs.staples.com/")
	protected GetAllitemsDetailReqType itemDetails;

	@XmlTransient
	protected String errors;

	/**
	 * Gets the value of the requesterId property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getRequesterId() {
		return requesterId;
	}

	/**
	 * Sets the value of the requesterId property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setRequesterId(String value) {
		this.requesterId = value;
	}

	/**
	 * Gets the value of the locale property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getLocale() {
		return locale;
	}

	/**
	 * Sets the value of the locale property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setLocale(String value) {
		this.locale = value;
	}

	/**
	 * Gets the value of the itemId property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getItemId() {
		return itemId;
	}

	/**
	 * Sets the value of the itemId property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	/**
	 * Gets the value of the storeNum property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getStoreNum() {
		return storeNum;
	}

	/**
	 * Sets the value of the storeNum property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setStoreNum(String storeNum) {
		this.storeNum = storeNum;
	}

	/**
	 * Gets the value of the itemDetails property.
	 * 
	 * @return possible object is {@link GetAllitemsDetailReqType }
	 */
	public GetAllitemsDetailReqType getItemDetails() {
		return itemDetails;
	}

	/**
	 * Sets the value of the itemDetails property.
	 * 
	 * @param value allowed object is {@link GetAllitemsDetailReqType }
	 */
	public void setItemDetails(GetAllitemsDetailReqType itemDetails) {
		this.itemDetails = itemDetails;
	}

	/**
	 * Gets the value of the errors property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getErrors() {
		return errors;
	}

	/**
	 * Sets the value of the errors property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setErrors(String errors) {
		this.errors = errors;
	}
}