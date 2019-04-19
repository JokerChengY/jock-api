package com.jock.fex.api.feign.param;

import com.jock.fex.api.base.BaseReq;

import java.util.Date;

public class EmployeeFindReq extends BaseReq {

	private static final long serialVersionUID = 193976367823238L;
	
	private String userName;//登录名，模糊查询
	
	private Long accountId;//员工账号id

	private String employeeNum;//员工编号
	
	private Long companyId;//中介id
	
	private Long deptId;//部门id 
	
	private String deptCode;//部门编码
	
	private String employeeName;//员工姓名
	
	private Long positionId;//职位Id
	
	private Integer type;//人员类型：0正式员工，1临时工
	
	private Date entryDate;//入职时间
	
	private Integer status;//在职状态
	
	private String phone;//客户电话
	
	private String souWay;//员工来源 3按揭 4中介

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public String getEmployeeNum() {
		return employeeNum;
	}

	public void setEmployeeNum(String employeeNum) {
		this.employeeNum = employeeNum;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Long getPositionId() {
		return positionId;
	}

	public void setPositionId(Long positionId) {
		this.positionId = positionId;
	}

	public Date getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getSouWay() {
		return souWay;
	}

	public void setSouWay(String souWay) {
		this.souWay = souWay;
	}
	
}
