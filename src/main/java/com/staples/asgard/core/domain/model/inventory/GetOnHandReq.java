//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.07 at 01:43:26 PM EDT 
//

package com.staples.asgard.core.domain.model.inventory;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

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
 * Java class for getOnHandReq complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getOnHandReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requesterId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="storeNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType (XmlAccessType.FIELD)
@XmlType (name = "getOnHandReq", propOrder = { "requesterId", "itemId", "storeNum", "locale" })
@XmlRootElement (name = "getOnHandReq")
@JsonAutoDetect (getterVisibility = Visibility.PROTECTED_AND_PUBLIC,
				setterVisibility = Visibility.PROTECTED_AND_PUBLIC, fieldVisibility = Visibility.PROTECTED_AND_PUBLIC)
@JsonInclude (Include.NON_NULL)
public class GetOnHandReq implements Serializable {

	private static final Logger LOGGER = LoggerFactory.getLogger(GetOnHandReq.class);

	private static final long serialVersionUID = -4252825456450806156L;

	public GetOnHandReq(LinkedMultiValueMap<String, String> requestParaMultiValueMap) {
		super();
		try {
			org.apache.commons.beanutils.BeanUtils.populate(this, requestParaMultiValueMap);
		} catch (IllegalAccessException exception) {
			exception.printStackTrace();
			LOGGER.error("Error ocurred in GetOnHandReq(IllegalAccessException): " + exception.getMessage());
		} catch (InvocationTargetException exception) {
			exception.printStackTrace();
			LOGGER.error("Error ocurred in GetOnHandReq(InvocationTargetException): " + exception.getMessage());
		}
	}

	@XmlElement (required = true, defaultValue = "Test")
	protected String requesterId;
	@XmlElement (required = true)
	protected String itemId;
	@XmlElement (required = true)
	protected String storeNum;
	@XmlElement (required = true, defaultValue = "en_US")
	protected String locale;

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
	public void setLocale(String locale) {
		this.locale = locale;
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