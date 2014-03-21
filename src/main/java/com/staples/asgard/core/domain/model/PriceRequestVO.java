
package com.staples.asgard.core.domain.model;

import java.util.List;
import java.util.Locale;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author srani
 * 
 */
@JsonAutoDetect(getterVisibility=Visibility.PUBLIC_ONLY,setterVisibility=Visibility.PUBLIC_ONLY,fieldVisibility=Visibility.PUBLIC_ONLY)
@JsonInclude(Include.NON_NULL)
public class PriceRequestVO {
	private String tenant = null;
	private String storeId = null;
	private Locale locale = null;
	private String geoZoneId = null;
	private String topCustomerZoneId = null;
	private String privateSavingId = null;

	private List<SKURequestVO> skuList = null;
	private int testDataType = -1;

	public PriceRequestVO() {
		super();
	}

	/**
	 * @return
	 */
	public String getTenant() {
		return tenant;
	}

	/**
	 * @param tenant
	 */
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

	/**
	 * @return
	 */
	public String getStoreId() {
		return storeId;
	}

	/**
	 * @param storeId
	 */
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	/**
	 * @return
	 */
	public Locale getLocale() {
		return locale;
	}

	/**
	 * @param locale
	 */
	public void setLocale(Locale locale) {
		this.locale = locale;
	}

	/**
	 * @return
	 */
	public String getGeoZoneId() {
		return geoZoneId;
	}

	/**
	 * @param geoZoneId
	 */
	public void setGeoZoneId(String geoZoneId) {
		this.geoZoneId = geoZoneId;
	}

	/**
	 * @return
	 */
	public String getTopCustomerZoneId() {
		return topCustomerZoneId;
	}

	/**
	 * @param topCustomerZoneId
	 */
	public void setTopCustomerZoneId(String topCustomerZoneId) {
		this.topCustomerZoneId = topCustomerZoneId;
	}

	/**
	 * @return
	 */
	public String getPrivateSavingId() {
		return privateSavingId;
	}

	/**
	 * @param privateSavingId
	 */
	public void setPrivateSavingId(String privateSavingId) {
		this.privateSavingId = privateSavingId;
	}

	/**
	 * @return
	 */

	public List<SKURequestVO> getSkuList() {
		return skuList;
	}

	/**
	 * @param skuList
	 */

	public void setSkuList(List<SKURequestVO> skuList) {
		this.skuList = skuList;
	}

	public int getTestDataType() {
		return testDataType;
	}

	public void setTestDataType(int type) {
		this.testDataType = type;
	}

}
