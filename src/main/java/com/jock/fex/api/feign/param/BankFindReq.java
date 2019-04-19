package com.jock.fex.api.feign.param;

import com.jock.fex.api.base.BaseReq;

public class BankFindReq extends BaseReq {

	private static final long serialVersionUID = 1L;

	private String name;
	
	private Integer status;

	private Long parentId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
