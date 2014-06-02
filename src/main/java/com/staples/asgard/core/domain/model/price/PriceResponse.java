package com.staples.asgard.core.domain.model.price;

import static com.staples.asgard.core.constants.PriceConstants.DEFAULT_RM;
import static com.staples.asgard.core.constants.PriceConstants.DEFAULT_SCALE;

import java.math.BigDecimal;
import java.util.List;

/**
 * PRICE response - POJO
 * 
 * @author srani
 * 
 */
public class PriceResponse {
	private String id = null;

	private BigDecimal listPrice = new BigDecimal(0).setScale(DEFAULT_SCALE,
			DEFAULT_RM);
	private BigDecimal finalPrice = new BigDecimal(0).setScale(DEFAULT_SCALE,
			DEFAULT_RM);
	private BigDecimal savings = new BigDecimal(0).setScale(DEFAULT_SCALE,
			DEFAULT_RM);
	private BigDecimal priceAfterSavings = new BigDecimal(0).setScale(
			DEFAULT_SCALE, DEFAULT_RM);
	private BigDecimal totalSavings = new BigDecimal(0).setScale(DEFAULT_SCALE,
			DEFAULT_RM);
	private BigDecimal manufacturerPrice = new BigDecimal(0).setScale(
			DEFAULT_SCALE, DEFAULT_RM);

	private boolean displayRegPricing = false;
	private boolean displayWasPricing = false;

	private List<Offers> buyMoreSaveMoreDetail = null;
	private List<PromoMessage> promotion = null;
	private Autoaddpromotion coupon = null;
	private List<Rebate> rebate = null;

	private String unitOfMeasure = null;

	private boolean noDataFound = true;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BigDecimal getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(BigDecimal finalPrice) {
		this.finalPrice = finalPrice.setScale(DEFAULT_SCALE, DEFAULT_RM);
	}

	public BigDecimal getListPrice() {
		return listPrice;
	}

	public void setListPrice(BigDecimal listPrice) {
		this.listPrice = listPrice.setScale(DEFAULT_SCALE, DEFAULT_RM);
	}

	public BigDecimal getSavings() {
		return savings;
	}

	public void setSavings(BigDecimal savings) {
		this.savings = savings.setScale(DEFAULT_SCALE, DEFAULT_RM);
	}

	public BigDecimal getPriceAfterSavings() {
		return priceAfterSavings;
	}

	public void setPriceAfterSavings(BigDecimal priceAfterSavings) {
		this.priceAfterSavings = priceAfterSavings;
	}

	public BigDecimal getTotalSavings() {
		return totalSavings;
	}

	public void setTotalSavings(BigDecimal totalSavings) {
		this.totalSavings = totalSavings.setScale(DEFAULT_SCALE, DEFAULT_RM);
	}

	public boolean isDisplayRegPricing() {
		return displayRegPricing;
	}

	public void setDisplayRegPricing(boolean displayRegPricing) {
		this.displayRegPricing = displayRegPricing;
	}

	public boolean isDisplayWasPricing() {
		return displayWasPricing;
	}

	public void setDisplayWasPricing(boolean displayWasPricing) {
		this.displayWasPricing = displayWasPricing;
	}

	public List<Offers> getBuyMoreSaveMoreDetail() {
		return buyMoreSaveMoreDetail;
	}

	public void setBuyMoreSaveMoreDetail(List<Offers> buyMoreSaveMoreDetail) {
		this.buyMoreSaveMoreDetail = buyMoreSaveMoreDetail;
	}

	public List<PromoMessage> getPromotion() {
		return promotion;
	}

	public void setPromotion(List<PromoMessage> promotion) {
		this.promotion = promotion;
	}

	public Autoaddpromotion getCoupon() {
		return coupon;
	}

	public void setCoupon(Autoaddpromotion coupon) {
		this.coupon = coupon;
	}

	public List<Rebate> getRebate() {
		return rebate;
	}

	public void setRebate(List<Rebate> rebate) {
		this.rebate = rebate;
	}

	public String getUnitOfMeasure() {
		return unitOfMeasure;
	}

	public void setUnitOfMeasure(String unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}

	public boolean isNoDataFound() {
		return noDataFound;
	}

	public void setNoDataFound(boolean noDataFound) {
		this.noDataFound = noDataFound;
	}

	public BigDecimal getManufacturerPrice() {
		return manufacturerPrice;
	}

	public void setManufacturerPrice(BigDecimal manufacturerPrice) {
		this.manufacturerPrice = manufacturerPrice;
	}

}
