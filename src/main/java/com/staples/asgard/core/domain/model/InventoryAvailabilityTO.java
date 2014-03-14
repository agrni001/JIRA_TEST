package com.staples.asgard.core.domain.model;

/**
 * 
 * @author Sapient
 * Date: Jan 9, 2014
 *
 */
public class InventoryAvailabilityTO {
	
	/** Part Number **/
	private String partNumber;
	/** Quantity **/
	private int quantity;
	/** Lead Time Description **/
	private String leadTimeDescription;
	/** Minimum Lead Time **/
	private String leadTimeMin;
	/** Maximum Lead Time **/
	private String leadTimeMaximum;
	/** Error Status **/
	private String status;
	
	/**
	 * Default Constructor for ProductAvailabilityStatus.
	 * Sets availability to "NOT AVAILABLE" and quantity to 0.
	 */
	public InventoryAvailabilityTO() {
		this.quantity = 0;
	}
	
	/**
	 * Constructor for ProductAvailabilityStatus with partNumber parameter.
	 * Sets partNumber, availability to "NOT AVAILABLE" and quantity to 0.
	 */
	public InventoryAvailabilityTO(String partNumber, String quantity){
		this.quantity = Integer.parseInt(quantity);
		this.partNumber = partNumber;
	}
	
	/**
	 * Getter for partNumber
	 * @return partNumber
	 */
	public String getPartNumber() {
		return partNumber;
	}
	
	/**
	 * Setter for partNumber
	 * @param partNumber
	 */
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	
	/**
	 * Getter for quantity
	 * @return quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	
	/**
	 * Setter for quantity
	 * @param quantity
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	/**
	 * Getter for leadTimeDescription
	 * @return leadTimeDescription
	 */
	public String getLeadTimeDescription() {
		return leadTimeDescription;
	}
	
	/**
	 * Setter for leadTimeDescription
	 * @param leadTimeDescription
	 */
	public void setLeadTimeDescription(String leadTimeDescription) {
		this.leadTimeDescription = leadTimeDescription;
	}
	
	/**
	 * Getter for leadTimeMin
	 * @return leadTimeMin
	 */
	public String getLeadTimeMin() {
		return leadTimeMin;
	}
	
	/**
	 * Setter for leadTimeMin
	 * @param leadTimeMin
	 */
	public void setLeadTimeMin(String leadTimeMin) {
		this.leadTimeMin = leadTimeMin;
	}
	
	/**
	 * Getter for leadTimeMaximum
	 * @return leadTimeMaximum
	 */
	public String getLeadTimeMaximum() {
		return leadTimeMaximum;
	}
	
	/**
	 * Setter for leadTimeMaximum
	 * @param leadTimeMaximum
	 */
	public void setLeadTimeMaximum(String leadTimeMaximum) {
		this.leadTimeMaximum = leadTimeMaximum;
	}
	
	/**
	 * Getter for status
	 * @return status
	 */
	public String getStatus() {
		return status;
	}
	
	/**
	 * Setter for status
	 * @param status
	 */
	public void setStatus(String status) {
		this.status = status;
	}
}
