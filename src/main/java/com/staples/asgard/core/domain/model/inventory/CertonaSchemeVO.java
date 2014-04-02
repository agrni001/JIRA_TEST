package com.staples.asgard.core.domain.model.inventory;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * This class encapsulates response data of the certona recommendation service.
 * It is mapped to the scheme child element the xml 
 * 
 * @author Sapient
 * 
 */
//@XmlRootElement(name = "scheme")
@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "scheme")
public class CertonaSchemeVO {

	@XmlAttribute(name = "name")
	private String schemeName;
	
	@XmlElementWrapper(name = "products")
	@XmlElement(name = "product")
	private List<CertonaSkuVO> personalizationSkuList;
	@XmlElement (name = "pageid")
	private String pageid;
	@XmlElement (name = "boxtitle")
	private String boxtitle;

	public CertonaSchemeVO() {

	}

	public List<CertonaSkuVO> getPersonalizationSkuList() {
		return personalizationSkuList;
	}

	public void setPersonalizationSkuList(
			List<CertonaSkuVO> personalizationSkuList) {
		this.personalizationSkuList = personalizationSkuList;
	}

	public String getPageid() {
		return pageid;
	}

	public void setPageid(String pageid) {
		this.pageid = pageid;
	}
	
	public String getBoxtitle() {
		return boxtitle;
	}

	public void setBoxtitle(String boxtitle) {
		this.boxtitle = boxtitle;
	}
	
}
