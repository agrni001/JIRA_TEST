package com.staples.asgard.core.domain.model.inventory;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for responseItem complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="responseItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="storeNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="availQty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="damageQty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displayQty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="softAllocQty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="onHandQty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="statusDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType (XmlAccessType.FIELD)
@XmlType (name = "responseItem", propOrder = { "itemId", "storeNum", "availQty", "damageQty", "displayQty",
	"softAllocQty", "onHandQty", "status", "statusDesc" })
@XmlRootElement (name = "item", namespace = "http://is.mvs.staples.com/")
public class ResponseItem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 823648234631L;

	@XmlElement (required = true, namespace = "http://is.mvs.staples.com/")
	protected String itemId;
	@XmlElement (required = true, namespace = "http://is.mvs.staples.com/")
	protected String storeNum;
	@XmlElement (namespace = "http://is.mvs.staples.com/")
	protected String availQty;
	@XmlElement (namespace = "http://is.mvs.staples.com/")
	protected String damageQty;
	@XmlElement (namespace = "http://is.mvs.staples.com/")
	protected String displayQty;
	@XmlElement (namespace = "http://is.mvs.staples.com/")
	protected String softAllocQty;
	@XmlElement (namespace = "http://is.mvs.staples.com/")
	protected String onHandQty;
	@XmlElement (required = true, namespace = "http://is.mvs.staples.com/")
	protected String status;
	@XmlElement (required = true, namespace = "http://is.mvs.staples.com/")
	protected String statusDesc;

	public ResponseItem() {
		super();
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

	/**
	 * Gets the value of the availQty property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getAvailQty() {
		return availQty;
	}

	/**
	 * Sets the value of the availQty property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setAvailQty(String value) {
		this.availQty = value;
	}

	/**
	 * Gets the value of the damageQty property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getDamageQty() {
		return damageQty;
	}

	/**
	 * Sets the value of the damageQty property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setDamageQty(String value) {
		this.damageQty = value;
	}

	/**
	 * Gets the value of the displayQty property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getDisplayQty() {
		return displayQty;
	}

	/**
	 * Sets the value of the displayQty property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setDisplayQty(String value) {
		this.displayQty = value;
	}

	/**
	 * Gets the value of the softAllocQty property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getSoftAllocQty() {
		return softAllocQty;
	}

	/**
	 * Sets the value of the softAllocQty property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setSoftAllocQty(String value) {
		this.softAllocQty = value;
	}

	/**
	 * Gets the value of the onHandQty property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getOnHandQty() {
		return onHandQty;
	}

	/**
	 * Sets the value of the onHandQty property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setOnHandQty(String value) {
		this.onHandQty = value;
	}

	/**
	 * Gets the value of the status property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Sets the value of the status property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setStatus(String value) {
		this.status = value;
	}

	/**
	 * Gets the value of the statusDesc property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getStatusDesc() {
		return statusDesc;
	}

	/**
	 * Sets the value of the statusDesc property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setStatusDesc(String value) {
		this.statusDesc = value;
	}

}
