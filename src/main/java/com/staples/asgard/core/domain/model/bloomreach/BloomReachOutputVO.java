/**
 * 
 */
package com.staples.asgard.core.domain.model.bloomreach;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.staples.asgard.core.domain.model.bloomreach.StaplesBloomReachWrapperVO;

/**
 * @author sapient
 *
 */
@JsonAutoDetect(getterVisibility=Visibility.PROTECTED_AND_PUBLIC,setterVisibility=Visibility.PROTECTED_AND_PUBLIC,fieldVisibility=Visibility.PROTECTED_AND_PUBLIC)
@JsonInclude(Include.NON_NULL)
public class BloomReachOutputVO {
	
 	private StaplesBloomReachWrapperVO bloomReach;
 	
	public BloomReachOutputVO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param htmlContent
	 */
	public BloomReachOutputVO(StaplesBloomReachWrapperVO staplesBloomReachWrapperVO) {
		super();
		this.bloomReach = bloomReach;
	}

	public StaplesBloomReachWrapperVO getBloomReach() {
		return bloomReach;
	}

	public void setBloomReach(StaplesBloomReachWrapperVO bloomReach) {
		this.bloomReach = bloomReach;
	}
}
