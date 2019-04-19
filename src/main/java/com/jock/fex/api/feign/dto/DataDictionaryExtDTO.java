package com.jock.fex.api.feign.dto;

import com.jock.fex.api.feign.model.ext.DataDictionaryExt;

public class DataDictionaryExtDTO extends DataDictionaryExt{
	private String statusText;
	private Long id;
	private String name;
	
	public Long getId(){
		return this.getDataDictionaryId();
	}
	
	public String getName(){
		return this.getDataName();
	}

	public void setStatusText(String statusText) {
		this.statusText = statusText;
	}
}
