package com.jock.fex.api.feign.dto;

import com.jock.fex.api.feign.model.EvaluateOrganization;

public class EvaluateOrganizationDTO extends EvaluateOrganization {

	private static final long serialVersionUID = 1L;
	
	private Long id;

	private String rangeTypeText;

	private String statusText;

	public void setRangeTypeText(String rangeTypeText) {
		this.rangeTypeText = rangeTypeText;
	}

	public void setStatusText(String statusText) {
		this.statusText = statusText;
	}

	public Long getId() {
		return this.getEvaluateOrganizationId();
	}

	public void setId(Long id) {
		this.id = id;
	}

}
