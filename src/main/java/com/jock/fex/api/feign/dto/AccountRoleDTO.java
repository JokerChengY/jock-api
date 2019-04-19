package com.jock.fex.api.feign.dto;

import com.jock.fex.api.feign.model.AccountRole;

import java.io.Serializable;

public class AccountRoleDTO extends AccountRole implements Serializable {
	
	private static final long serialVersionUID = 414163816456410869L;

	private String roleName;//角色名

    private String roleCode;//角色code

    private String roleDesc;//角色描述

    private Integer isShow;//是否显示

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	public String getRoleDesc() {
		return roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

	public Integer getIsShow() {
		return isShow;
	}

	public void setIsShow(Integer isShow) {
		this.isShow = isShow;
	}

    
}