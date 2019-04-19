package com.jock.fex.api.feign.model;

import java.util.Date;

public class ServiceProduct {
    private Long serviceProductId;

	private String name;

	private Integer type;

	private Integer sort;

	private Integer status;

	private String remark;

	private Integer isCompanyNumRules;

	private String numRules;

	private Long createBy;

	private Date createTime;

	private Long updateBy;

	private Date updateTime;

	public Long getServiceProductId() {
		return serviceProductId;
	}

	public void setServiceProductId(Long serviceProductId) {
		this.serviceProductId = serviceProductId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark == null ? null : remark.trim();
	}

	public Integer getIsCompanyNumRules() {
		return isCompanyNumRules;
	}

	public void setIsCompanyNumRules(Integer isCompanyNumRules) {
		this.isCompanyNumRules = isCompanyNumRules;
	}

	public String getNumRules() {
		return numRules;
	}

	public void setNumRules(String numRules) {
		this.numRules = numRules == null ? null : numRules.trim();
	}

	public Long getCreateBy() {
		return createBy;
	}

	public void setCreateBy(Long createBy) {
		this.createBy = createBy;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(Long updateBy) {
		this.updateBy = updateBy;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
