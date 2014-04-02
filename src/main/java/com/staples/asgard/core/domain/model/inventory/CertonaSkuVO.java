package com.staples.asgard.core.domain.model.inventory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
/**
 * This class encapsulates response data of the certona recommendation service.
 * It is mapped to the child element "products" the xml 
 * 
 * @author Sapient
 * 
 */
//@XmlRootElement(namespace = "com.staples.asgard.core.domain.model.inventory.CertonaOutputVO")
//@XmlType(name = "product")
@XmlAccessorType(XmlAccessType.FIELD)
public class CertonaSkuVO {
	
	@XmlElement(name = "productid")
	private Integer productId;//"productid" : "325451" 	
	@XmlElement(name = "variant")
	private Integer variant;//"variant" : "1137"
	
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getVariant() {
		return variant;
	}
	public void setVariant(Integer variant) {
		this.variant = variant;
	}

}
