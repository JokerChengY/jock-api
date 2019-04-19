package com.jock.fex.api.feign.dto;

import com.jock.fex.api.feign.model.Feedback;

/**
 * 反馈DTO
 * @author hj
 *
 */
public class FeedbackDTO extends Feedback{
	
	private String createByText;

	public String getCreateByText() {
		return createByText;
	}

	public void setCreateByText(String createByText) {
		this.createByText = createByText;
	}
	
}
