package com.jock.fex.api.feign.dto;

import com.jock.fex.api.feign.model.GuaranteeOrganization;

public class GuaranteeOrganizationDTO extends GuaranteeOrganization {

	private String statusText;

	private Long id;

	public Long getId() {
		return this.getGuaranteeOrganizationId();
	}

	public void setStatusText(String statusText) {
		this.statusText = statusText;
	}

}
