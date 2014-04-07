package com.staples.asgard.core.domain.model.price;

import static com.staples.asgard.core.constants.PriceConstants.DEFAULT_ZONE;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author srani
 * 
 */
@JsonAutoDetect(getterVisibility = Visibility.PUBLIC_ONLY, setterVisibility = Visibility.PUBLIC_ONLY, fieldVisibility = Visibility.PUBLIC_ONLY)
@JsonInclude(Include.NON_NULL)
public class PriceRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4592538709068555459L;

	public PriceRequest(
			org.springframework.util.LinkedMultiValueMap requestParaMultiValueMap) {
		super();
		try {
			org.apache.commons.beanutils.BeanUtils.populate(this,
					requestParaMultiValueMap);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@NotEmpty(message = "The tenant id field is mandatory.")
	private String tenant = null;
	@NotEmpty(message = "The store id field is mandatory.")
	private String storeId = null;
	@NotEmpty(message = "The locale field is mandatory.")
	private String locale = null;
	private String geoZoneId = null;
	private String topCustomerZoneId = null;
	// TODO pick from the MONGO
	private String defaultZoneId = DEFAULT_ZONE;

	private String skuListForPrice = null;

	private String skuListForProduct = null;

	private int testDataType = -1;

	public PriceRequest() {
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
	public String getLocale() {
		return locale;
	}

	/**
	 * @param locale
	 */
	public void setLocale(String locale) {
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
	public int getTestDataType() {
		return testDataType;
	}

	/**
	 * @param type
	 */
	public void setTestDataType(int type) {
		this.testDataType = type;
	}

	/**
	 * @return
	 */
	public String getDefaultZoneId() {
		return defaultZoneId;
	}

	/**
	 * @param defaultZoneId
	 */
	public void setDefaultZoneId(String defaultZoneId) {
		this.defaultZoneId = defaultZoneId;
	}

	/**
	 * @return
	 */
	public String getSkuListForPrice() {
		return skuListForPrice;
	}

	/**
	 * @param skuListForPrice
	 */
	public void setSkuListForPrice(String skuListForPrice) {
		this.skuListForPrice = skuListForPrice;
	}

	/**
	 * @return
	 */
	public String getSkuListForProduct() {
		return skuListForProduct;
	}

	/**
	 * @param skuListForProduct
	 */
	public void setSkuListForProduct(String skuListForProduct) {
		this.skuListForProduct = skuListForProduct;
	}

}
