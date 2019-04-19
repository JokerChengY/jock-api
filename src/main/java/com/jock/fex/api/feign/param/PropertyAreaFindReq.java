package com.jock.fex.api.feign.param;

import com.jock.fex.api.base.BaseReq;

public class PropertyAreaFindReq extends BaseReq{

	private static final long serialVersionUID = 972306928574697147L;
	
	private Long parentId;//父级id

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	
}
