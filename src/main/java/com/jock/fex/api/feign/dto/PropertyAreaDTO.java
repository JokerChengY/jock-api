package com.jock.fex.api.feign.dto;

import com.jock.fex.api.feign.model.PropertyArea;

/**
 * 物业区域对象DTO
 * 
 * @author hj
 *
 */
public class PropertyAreaDTO extends PropertyArea {

	/**
	 * 状态
	 */
	private String statusText;

	private Long id;

	public Long getId() {
		return this.getPropertyAreaId();
	}

	public void setStatusText(String statusText) {
		this.statusText = statusText;
	}
}
