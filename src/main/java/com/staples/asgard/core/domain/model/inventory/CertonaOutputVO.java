package com.staples.asgard.core.domain.model.inventory;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * This class encapsulates response data of the certona recommendation service.
 * It is mapped to the root element "response" of the xml 
 * 
 * @author Sapient
 * 
 */
@XmlRootElement(name = "response", namespace = "")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonAutoDetect(getterVisibility=Visibility.PUBLIC_ONLY,setterVisibility=Visibility.PUBLIC_ONLY,fieldVisibility=Visibility.PUBLIC_ONLY)
@JsonInclude(Include.NON_NULL)
public class CertonaOutputVO implements Serializable {

	private static final long serialVersionUID = -5109341418584439107L;
	
	@XmlElement(name = "scheme")
	private CertonaSchemeVO scheme;
	
	public CertonaOutputVO() {

	}

	public CertonaSchemeVO getScheme() {
		return scheme;
	}

	public void setScheme(CertonaSchemeVO scheme) {
		this.scheme = scheme;
	}
	
}
