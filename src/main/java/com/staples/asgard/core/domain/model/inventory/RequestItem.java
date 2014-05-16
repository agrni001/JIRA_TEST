package com.staples.asgard.core.domain.model.inventory;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for requestItem complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="storeNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType (XmlAccessType.FIELD)
@XmlType (name = "requestItem", propOrder = { "itemId", "storeNum" })
public class RequestItem implements Serializable {

	private static final long serialVersionUID = -4252825432130806156L;

	@XmlElement (required = true)
	protected String itemId;
	@XmlElement (required = true)
	protected String storeNum;

	public RequestItem(java.lang.String itemId, java.lang.String storeNum) {
		this.itemId = itemId;
		this.storeNum = storeNum;
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
	public void setItemId(String value) {
		this.itemId = value;
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
	public void setStoreNum(String value) {
		this.storeNum = value;
	}
}