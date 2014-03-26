/**
 * 
 */
package com.staples.asgard.browse.price.vo;

import java.util.Date;

/**
 * @author Sapient
 * 
 */
public class PromotionVO {

	private String promotionName = null;

	private String promotionMessage = null;

	private Integer promotionTypeId = null;

	private String promotionImage = null;

	private Date promotionStartDate = null;

	private Date promotionEndDate = null;

	public String getPromotionName() {
		return promotionName;
	}

	public void setPromotionName(String promotionName) {
		this.promotionName = promotionName;
	}

	public String getPromotionMessage() {
		return promotionMessage;
	}

	public void setPromotionMessage(String promotionMessage) {
		this.promotionMessage = promotionMessage;
	}

	public Integer getPromotionTypeId() {
		return promotionTypeId;
	}

	public void setPromotionTypeId(Integer promotionTypeId) {
		this.promotionTypeId = promotionTypeId;
	}

	public String getPromotionImage() {
		return promotionImage;
	}

	public void setPromotionImage(String promotionImage) {
		this.promotionImage = promotionImage;
	}

	public Date getPromotionStartDate() {
		return promotionStartDate;
	}

	public void setPromotionStartDate(Date promotionStartDate) {
		this.promotionStartDate = promotionStartDate;
	}

	public Date getPromotionEndDate() {
		return promotionEndDate;
	}

	public void setPromotionEndDate(Date promotionEndDate) {
		this.promotionEndDate = promotionEndDate;
	}

}
