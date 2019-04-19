package com.jock.fex.api.feign.dto;

import java.io.Serializable;

public class AccountTypeDTO implements Serializable {

	private static final long serialVersionUID = -5716908140787996307L;

	private Long accountId;

	private Integer type;
	
	private String typeName;
	
	public AccountTypeDTO() {
	}

	public AccountTypeDTO(Long accountId) {
		this.accountId = accountId;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
	
}
