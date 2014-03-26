
package com.staples.asgard.core.exceptions.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;




/**
 * <p>Java class for SOAPFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SOAPFault">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="faultcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="faultstring" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="faultactor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="faultservice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="faulttime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="detail" type="{http://staples.com/dotcom/consumer/getinventory}detail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SOAPFault", propOrder = {
    "faultcode",
    "faultstring",
    "faultactor",
    "faultservice",
    "faulttime",
    "detail"
})
public class SOAPFault {

    @XmlElementRef(name = "faultcode", namespace = "http://staples.com/dotcom/consumer/getinventory", type = JAXBElement.class)
    protected JAXBElement<String> faultcode;
    @XmlElementRef(name = "faultstring", namespace = "http://staples.com/dotcom/consumer/getinventory", type = JAXBElement.class)
    protected JAXBElement<String> faultstring;
    @XmlElementRef(name = "faultactor", namespace = "http://staples.com/dotcom/consumer/getinventory", type = JAXBElement.class)
    protected JAXBElement<String> faultactor;
    @XmlElementRef(name = "faultservice", namespace = "http://staples.com/dotcom/consumer/getinventory", type = JAXBElement.class)
    protected JAXBElement<String> faultservice;
    @XmlElementRef(name = "faulttime", namespace = "http://staples.com/dotcom/consumer/getinventory", type = JAXBElement.class)
    protected JAXBElement<String> faulttime;
    @XmlElementRef(name = "detail", namespace = "http://staples.com/dotcom/consumer/getinventory", type = JAXBElement.class)
    protected JAXBElement<Detail> detail;

    /**
     * Gets the value of the faultcode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFaultcode() {
        return faultcode;
    }

    /**
     * Sets the value of the faultcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFaultcode(JAXBElement<String> value) {
        this.faultcode = value;
    }

    /**
     * Gets the value of the faultstring property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFaultstring() {
        return faultstring;
    }

    /**
     * Sets the value of the faultstring property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFaultstring(JAXBElement<String> value) {
        this.faultstring = value;
    }

    /**
     * Gets the value of the faultactor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFaultactor() {
        return faultactor;
    }

    /**
     * Sets the value of the faultactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFaultactor(JAXBElement<String> value) {
        this.faultactor = value;
    }

    /**
     * Gets the value of the faultservice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFaultservice() {
        return faultservice;
    }

    /**
     * Sets the value of the faultservice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFaultservice(JAXBElement<String> value) {
        this.faultservice = value;
    }

    /**
     * Gets the value of the faulttime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFaulttime() {
        return faulttime;
    }

    /**
     * Sets the value of the faulttime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFaulttime(JAXBElement<String> value) {
        this.faulttime = value;
    }

    /**
     * Gets the value of the detail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Detail }{@code >}
     *     
     */
    public JAXBElement<Detail> getDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Detail }{@code >}
     *     
     */
    public void setDetail(JAXBElement<Detail> value) {
        this.detail = value;
    }

}
