package com.staples.asgard.core.domain.model.price;

import java.util.ArrayList;

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
public class PriceOutput {

	private int user_price_flag;

	public void setUser_price_flag(int user_price_flag) {
		this.user_price_flag = user_price_flag;
	}

	public int getUser_price_flag() {
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

	private ArrayList<Rebate[]> listOfRebates;

	public void setListOfRebates(ArrayList<Rebate[]> listOfRebates) {
		this.listOfRebates = listOfRebates;
	}

	public ArrayList<Rebate[]> getListOfRebates() {
		return listOfRebates;
	}

	private Rebate[] rebates;

	public void setRebates(Rebate[] rebates) {
		this.rebates = rebates;
	}

	public Rebate[] getRebates() {
		return rebates;
	}

	private ArrayList<Promotion> listOfPromotions;

	public void setListOfPromotions(ArrayList<Promotion> listOfPromotions) {
		this.listOfPromotions = listOfPromotions;
	}

	public ArrayList<Promotion> getListOfPromotions() {
		return listOfPromotions;
	}

	private Promotion promotions;

	public void setPromotions(Promotion promotions) {
		this.promotions = promotions;
	}

	public Promotion getPromotions() {
		return promotions;
	}

	private Value[] values;

	public void setValues(Value[] values) {
		this.values = values;
	}

	public Value[] getValues() {
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