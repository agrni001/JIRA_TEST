
package com.staples.asgard.core.domain.model.inventory;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * <p>Java class for storeOnHandDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="storeOnHandDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="storeNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="addressLine" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="zipCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="storeHours" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="plazaMall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distance" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="distanceUnits" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="availQty" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="damageQty" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="displayQty" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="onHandQty" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="softAllocQty" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ROPSFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stockLevel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "storeOnHandDetailType", propOrder = {
    "storeNum",
    "addressLine",
    "city",
    "state",
    "zipCode",
    "storeHours",
    "phoneNumber",
    "plazaMall",
    "distance",
    "distanceUnits",
    "availQty",
    "damageQty",
    "displayQty",
    "onHandQty",
    "softAllocQty",
    "ropsFlag",
    "price",
    "stockLevel"
})
@JsonAutoDetect(getterVisibility=Visibility.PUBLIC_ONLY,setterVisibility=Visibility.PUBLIC_ONLY,fieldVisibility=Visibility.PUBLIC_ONLY)
@JsonInclude(Include.NON_NULL)
public class StoreOnHandDetailType implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -4894569779328858472L;
	
	@XmlElement(required = true)
    protected String storeNum;
    @XmlElement(required = true)
    protected String addressLine;
    @XmlElement(required = true)
    protected String city;
    @XmlElement(required = true)
    protected String state;
    @XmlElement(required = true)
    protected String zipCode;
    protected String storeHours;
    protected String phoneNumber;
    protected String plazaMall;
    @XmlElement(required = true)
    protected String distance;
    @XmlElement(required = true)
    protected String distanceUnits;
    @XmlElement(required = true)
    protected String availQty;
    @XmlElement(required = true)
    protected String damageQty;
    @XmlElement(required = true)
    protected String displayQty;
    @XmlElement(required = true)
    protected String onHandQty;
    @XmlElement(required = true)
    protected String softAllocQty;
    @XmlElement(name = "ROPSFlag", required = true)
    protected String ropsFlag;
    protected String price;
    @XmlElement(required = true)
    protected String stockLevel;

    /**
     * Gets the value of the storeNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreNum() {
        return storeNum;
    }

    /**
     * Sets the value of the storeNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreNum(String value) {
        this.storeNum = value;
    }

    /**
     * Gets the value of the addressLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine() {
        return addressLine;
    }

    /**
     * Sets the value of the addressLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine(String value) {
        this.addressLine = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the zipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

    /**
     * Gets the value of the storeHours property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreHours() {
        return storeHours;
    }

    /**
     * Sets the value of the storeHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreHours(String value) {
        this.storeHours = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the plazaMall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlazaMall() {
        return plazaMall;
    }

    /**
     * Sets the value of the plazaMall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlazaMall(String value) {
        this.plazaMall = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistance(String value) {
        this.distance = value;
    }

    /**
     * Gets the value of the distanceUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistanceUnits() {
        return distanceUnits;
    }

    /**
     * Sets the value of the distanceUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistanceUnits(String value) {
        this.distanceUnits = value;
    }

    /**
     * Gets the value of the availQty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailQty() {
        return availQty;
    }

    /**
     * Sets the value of the availQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailQty(String value) {
        this.availQty = value;
    }

    /**
     * Gets the value of the damageQty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDamageQty() {
        return damageQty;
    }

    /**
     * Sets the value of the damageQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDamageQty(String value) {
        this.damageQty = value;
    }

    /**
     * Gets the value of the displayQty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayQty() {
        return displayQty;
    }

    /**
     * Sets the value of the displayQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayQty(String value) {
        this.displayQty = value;
    }

    /**
     * Gets the value of the onHandQty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnHandQty() {
        return onHandQty;
    }

    /**
     * Sets the value of the onHandQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnHandQty(String value) {
        this.onHandQty = value;
    }

    /**
     * Gets the value of the softAllocQty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftAllocQty() {
        return softAllocQty;
    }

    /**
     * Sets the value of the softAllocQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftAllocQty(String value) {
        this.softAllocQty = value;
    }

    /**
     * Gets the value of the ropsFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @JsonProperty("ropsFlag")
     public String getROPSFlag() {
        return ropsFlag;
    }

    /**
     * Sets the value of the ropsFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @JsonProperty("ropsFlag")
    public void setROPSFlag(String value) {
        this.ropsFlag = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrice(String value) {
        this.price = value;
    }

    /**
     * Gets the value of the stockLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockLevel() {
        return stockLevel;
    }

    /**
     * Sets the value of the stockLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockLevel(String value) {
        this.stockLevel = value;
    }

}
