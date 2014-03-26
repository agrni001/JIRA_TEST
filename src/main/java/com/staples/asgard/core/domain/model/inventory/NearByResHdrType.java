
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


/**
 * <p>Java class for nearByResHdrType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nearByResHdrType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="statusDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="histSeqNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="searchAddrLn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="searchCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="searchState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="searchZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="searchRadius" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="searchItem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="searchLocale" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nearByResHdrType", propOrder = {
    "status",
    "statusDesc",
    "histSeqNum",
    "searchAddrLn",
    "searchCity",
    "searchState",
    "searchZipCode",
    "searchRadius",
    "searchItem",
    "searchLocale",
    "latitude",
    "longitude"
})
@JsonAutoDetect(getterVisibility=Visibility.PUBLIC_ONLY,setterVisibility=Visibility.PUBLIC_ONLY,fieldVisibility=Visibility.PUBLIC_ONLY)
@JsonInclude(Include.NON_NULL)
 public class NearByResHdrType implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 2276222544828078496L;
	
	@XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    protected String statusDesc;
    @XmlElement(required = true)
    protected String histSeqNum;
    protected String searchAddrLn;
    protected String searchCity;
    protected String searchState;
    protected String searchZipCode;
    @XmlElement(required = true)
    protected String searchRadius;
    @XmlElement(required = true)
    protected String searchItem;
    @XmlElement(required = true)
    protected String searchLocale;
    protected String latitude;
    protected String longitude;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDesc() {
        return statusDesc;
    }

    /**
     * Sets the value of the statusDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDesc(String value) {
        this.statusDesc = value;
    }

    /**
     * Gets the value of the histSeqNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHistSeqNum() {
        return histSeqNum;
    }

    /**
     * Sets the value of the histSeqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHistSeqNum(String value) {
        this.histSeqNum = value;
    }

    /**
     * Gets the value of the searchAddrLn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchAddrLn() {
        return searchAddrLn;
    }

    /**
     * Sets the value of the searchAddrLn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchAddrLn(String value) {
        this.searchAddrLn = value;
    }

    /**
     * Gets the value of the searchCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchCity() {
        return searchCity;
    }

    /**
     * Sets the value of the searchCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchCity(String value) {
        this.searchCity = value;
    }

    /**
     * Gets the value of the searchState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchState() {
        return searchState;
    }

    /**
     * Sets the value of the searchState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchState(String value) {
        this.searchState = value;
    }

    /**
     * Gets the value of the searchZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchZipCode() {
        return searchZipCode;
    }

    /**
     * Sets the value of the searchZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchZipCode(String value) {
        this.searchZipCode = value;
    }

    /**
     * Gets the value of the searchRadius property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchRadius() {
        return searchRadius;
    }

    /**
     * Sets the value of the searchRadius property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchRadius(String value) {
        this.searchRadius = value;
    }

    /**
     * Gets the value of the searchItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchItem() {
        return searchItem;
    }

    /**
     * Sets the value of the searchItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchItem(String value) {
        this.searchItem = value;
    }

    /**
     * Gets the value of the searchLocale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchLocale() {
        return searchLocale;
    }

    /**
     * Sets the value of the searchLocale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchLocale(String value) {
        this.searchLocale = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitude(String value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitude(String value) {
        this.longitude = value;
    }

}
