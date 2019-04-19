package com.jock.fex.api.feign.param;

import com.jock.fex.api.base.BaseReq;

public class RoleAccountFindReq extends BaseReq {

	private static final long serialVersionUID = 414163816456410869L;
	//可扩展查询条件
	private Long roleId;//角色id
	
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	
}