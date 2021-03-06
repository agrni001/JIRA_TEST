package com.staples.asgard.core.domain.model.inventory;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for getAllitemsDetailResType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAllitemsDetailResType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="item" type="{http://is.mvs.staples.com/}responseItem" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType (XmlAccessType.FIELD)
@XmlType (name = "getAllitemsDetailResType", propOrder = { "item" })
@XmlRootElement (name = "itemDetails", namespace = "http://is.mvs.staples.com/")
@XmlSeeAlso ({ ArrayList.class })
public class GetAllitemsDetailResType implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1238468234L;

	@XmlElement (required = true, name = "item", namespace = "http://is.mvs.staples.com/")
	protected List<ResponseItem> item;

	/**
	 * Gets the value of the item property.
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any
	 * modification you make to the returned list will be present inside the JAXB object. This is
	 * why there is not a <CODE>set</CODE> method for the item property.
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getItem().add(newItem);
	 * </pre>
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link ResponseItem }
	 */
	public List<ResponseItem> getItem() {
		if (item == null) {
			item = new ArrayList<ResponseItem>();
		}
		return this.item;
	}
}