
package com.staples.asgard.core.domain.model.inventory;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Transient;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


/**
 * <p>Java class for nearBySearchParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nearBySearchParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requesterId" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "nearBySearchParams", propOrder = {
    "requesterId",
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
@XmlRootElement(name="getNearByReq")
@JsonAutoDetect(getterVisibility=Visibility.PROTECTED_AND_PUBLIC,setterVisibility=Visibility.PROTECTED_AND_PUBLIC,fieldVisibility=Visibility.PROTECTED_AND_PUBLIC)
@JsonInclude(Include.NON_NULL)
 public class NearBySearchParams implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = -4252825099500806156L;
	
	 
	
	public  NearBySearchParams(org.springframework.util.LinkedMultiValueMap requestParaMultiValueMap) {
		super();
		 
			try {
				org.apache.commons.beanutils.BeanUtils.populate(this, requestParaMultiValueMap);
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
 
		 
		 
	}
	
	
	@XmlElement(required = true,defaultValue="Test")
    @NotEmpty(message="requesterId is blank")
    protected String requesterId;
    protected String searchAddrLn;
    protected String searchCity;
    protected String searchState;
    @NotEmpty(message="searchZipCode is blank")
    protected String searchZipCode;
    @XmlElement(required = true,defaultValue="25")
    protected String searchRadius;
    @XmlElement(required = true)
    @NotEmpty(message="searchItem is blank")
    protected String searchItem;
    @XmlElement(required = true,defaultValue="en_US")    
    protected String searchLocale;
    protected String latitude;
    protected String longitude;
    
    @XmlTransient
    protected String errors;

    public NearBySearchParams() {
    	super();
    } 
    
    /**
     * Gets the value of the requesterId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequesterId() {
        return requesterId;
    }

    /**
     * Sets the value of the requesterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequesterId(String value) {
        this.requesterId = value;
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
    
	public String getErrors() {
		return errors;
	}

	public void setErrors(String errors) {
		this.errors = errors;
	}

}
