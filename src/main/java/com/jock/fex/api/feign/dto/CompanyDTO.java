package com.jock.fex.api.feign.dto;

import com.jock.fex.api.feign.model.Company;

public class CompanyDTO extends Company{
	
	private String isBusinessText;
	
	private String areaText;
	
	private String statusText;
	
	private String parentName;
	
	private Long id;
	
	public Long getId(){
		return this.getCompanyId();
	}
	
	public void setAreaText(String areaText) {
		this.areaText = areaText;
	}

	public void setIsBusinessText(String isBusinessText) {
		this.isBusinessText = isBusinessText;
	}
	
	public void setStatusText(String statusText) {
		this.statusText = statusText;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	
}
