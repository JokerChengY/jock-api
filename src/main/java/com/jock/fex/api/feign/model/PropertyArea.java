package com.jock.fex.api.feign.model;

import org.hibernate.validator.constraints.NotBlank;

import java.util.Date;

public class PropertyArea {
    private Long propertyAreaId;

    @NotBlank(message="名称不能为空")
	private String name;

	private Integer sort;

	private Integer status;

	private String remark;

	@NotBlank(message="父级id不能为空")
	private Long parentId;

	private Long createBy;

	private Date createTime;

	private Long updateBy;

	private Date updateTime;

	public Long getPropertyAreaId() {
		return propertyAreaId;
	}

	public void setPropertyAreaId(Long propertyAreaId) {
		this.propertyAreaId = propertyAreaId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
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

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
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