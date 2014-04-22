package com.staples.asgard.core.domain.model.inventory;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * <p>
 * Java class for nearByRes complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="nearByRes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nearByResHdr" type="{http://staples.com/dotcom/consumer/getinventory}nearByResHdrType"/>
 *         &lt;element name="nearByStoreOnHandDtl" type="{http://staples.com/dotcom/consumer/getinventory}storeOnHandDetailType" maxOccurs="10" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getNearByRes", propOrder = { "nearByResHdr",
		"nearByStoreOnHandDtl" })
@XmlRootElement(name = "getNearByRes")
@JsonAutoDetect(getterVisibility = Visibility.PUBLIC_ONLY, setterVisibility = Visibility.PUBLIC_ONLY, fieldVisibility = Visibility.PUBLIC_ONLY)
@JsonInclude(Include.NON_NULL)
public class NearByRes implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5109341418580339107L;

	@XmlElement(required = true)
	protected NearByResHdrType nearByResHdr;
	protected List<StoreOnHandDetailType> nearByStoreOnHandDtl;

	/**
	 * Gets the value of the nearByResHdr property.
	 * 
	 * @return possible object is {@link NearByResHdrType }
	 * 
	 */
	public NearByResHdrType getNearByResHdr() {
		return nearByResHdr;
	}

	/**
	 * Sets the value of the nearByResHdr property.
	 * 
	 * @param value
	 *            allowed object is {@link NearByResHdrType }
	 * 
	 */
	public void setNearByResHdr(NearByResHdrType value) {
		this.nearByResHdr = value;
	}

	/**
	 * Gets the value of the nearByStoreOnHandDtl property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the nearByStoreOnHandDtl property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getNearByStoreOnHandDtl().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link StoreOnHandDetailType }
	 * 
	 * 
	 */
	public List<StoreOnHandDetailType> getNearByStoreOnHandDtl() {
		if (nearByStoreOnHandDtl == null) {
			nearByStoreOnHandDtl = new ArrayList<StoreOnHandDetailType>();
		}
		return this.nearByStoreOnHandDtl;
	}

	public void setNearByStoreOnHandDtl(
			List<StoreOnHandDetailType> nearByStoreOnHandDtl) {
		this.nearByStoreOnHandDtl = nearByStoreOnHandDtl;
	}

}
