/* Generated by JavaFromJSON */
/*http://javafromjson.dashingrocket.com*/

package com.staples.asgard.core.domain.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.staples.asgard.core.domain.model.price.PromotionElement;
import com.staples.asgard.core.domain.model.price.RebatElement;
import com.staples.asgard.core.domain.model.price.ValueElement;

@JsonAutoDetect(getterVisibility = Visibility.PUBLIC_ONLY, setterVisibility = Visibility.PUBLIC_ONLY, fieldVisibility = Visibility.PUBLIC_ONLY)
@JsonInclude(Include.NON_NULL)
public class PriceOutputVO {

	private Integer user_price_flag;

	public void setUser_price_flag(Integer user_price_flag) {
		this.user_price_flag = user_price_flag;
	}

	public Integer getUser_price_flag() {
		return user_price_flag;
	}

	private ArrayList<String> listOfcurrency;

	public void setListOfCurrency(ArrayList<String> listOfcurrency) {
		this.listOfcurrency = listOfcurrency;
	}

	public ArrayList<String> getListOfCurrency() {
		return listOfcurrency;
	}

	private String currency;

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCurrency() {
		return currency;
	}

	private ArrayList<RebatElement[]> listOfRebates;

	public void setListOfRebates(ArrayList<RebatElement[]> listOfRebates) {
		this.listOfRebates = listOfRebates;
	}

	public ArrayList<RebatElement[]> getListOfRebates() {
		return listOfRebates;
	}

	private RebatElement[] rebates;

	public void setRebates(RebatElement[] rebates) {
		this.rebates = rebates;
	}

	public RebatElement[] getRebates() {
		return rebates;
	}

	private ArrayList<PromotionElement> listOfPromotions;

	public void setListOfPromotions(ArrayList<PromotionElement> listOfPromotions) {
		this.listOfPromotions = listOfPromotions;
	}

	public ArrayList<PromotionElement> getListOfPromotions() {
		return listOfPromotions;
	}

	private PromotionElement promotions;

	public void setPromotions(PromotionElement promotions) {
		this.promotions = promotions;
	}

	public PromotionElement getPromotions() {
		return promotions;
	}

	private ValueElement[] values;

	public void setValues(ValueElement[] values) {
		this.values = values;
	}

	public ValueElement[] getValues() {
		return values;
	}

	private String uom;

	public void setUom(String uom) {
		this.uom = uom;
	}

	public String getUom() {
		return uom;
	}

	public String getDocKey() {
		return docKey;
	}

	public void setDocKey(String docKey) {
		this.docKey = docKey;
	}

	private String docKey = null;

	private String _id = null;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

}