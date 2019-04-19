package com.jock.fex.api.feign.dto;

import java.io.Serializable;

public class ProductDataCustomerDTO implements Serializable {
	
	private static final long serialVersionUID = 2781823777132433526L;

	private String caseNumber;//案件号
	
	private String type;//客户类型，个人，公司
	
	private String buyType;//买卖方类型
	
	private String loanType;//借款人类别
	
	private String name;//姓名
	
	private String idCard;//身份证
	
	private String phone;//手机号码
	
	private String typeIn;//录入人
	
	private String typeInDate;//录入日期
	
	private String agentName;//代理人
	
	private String agentPhone;//代理人电话
	
	private String guaranteeName;//担保人
	
	private String guaranteePhone;//担保人电话
	
	private String propertyAddress;//物业地址
	
	private String businessPerson;//拓展人员

	public String getCaseNumber() {
		return caseNumber;
	}

	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}

	public String getBuyType() {
		return buyType;
	}

	public void setBuyType(String buyType) {
		this.buyType = buyType;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getTypeIn() {
		return typeIn;
	}

	public void setTypeIn(String typeIn) {
		this.typeIn = typeIn;
	}

	public String getTypeInDate() {
		return typeInDate;
	}

	public void setTypeInDate(String typeInDate) {
		this.typeInDate = typeInDate;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getAgentPhone() {
		return agentPhone;
	}

	public void setAgentPhone(String agentPhone) {
		this.agentPhone = agentPhone;
	}

	public String getGuaranteeName() {
		return guaranteeName;
	}

	public void setGuaranteeName(String guaranteeName) {
		this.guaranteeName = guaranteeName;
	}

	public String getGuaranteePhone() {
		return guaranteePhone;
	}

	public void setGuaranteePhone(String guaranteePhone) {
		this.guaranteePhone = guaranteePhone;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPropertyAddress() {
		return propertyAddress;
	}

	public void setPropertyAddress(String propertyAddress) {
		this.propertyAddress = propertyAddress;
	}

	public String getBusinessPerson() {
		return businessPerson;
	}

	public void setBusinessPerson(String businessPerson) {
		this.businessPerson = businessPerson;
	}
}