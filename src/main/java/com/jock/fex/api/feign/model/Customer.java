package com.jock.fex.api.feign.model;

import java.util.Date;

public class Customer {
    private Long customerId;

	private String name;

	private Integer type;

	private String idCard;

	private String phone;

	private String workCompany;

	private String workPhone;

	private String jobGrade;

	private String nativePlace;

	private Date birthday;

	private String hobby;

	private Integer gender;

	private String homeAddress;

	private String remark;

	private String agentName;

	private String agentPhone;

	private String guaranteeName;

	private String guaranteePhone;

	private Integer personScore;

	private Integer personLevel;

	private Integer scAge;

	private Integer scGender;

	private Integer scMaritalStatus;

	private Integer scEducation;

	private Integer scIndustry;

	private Integer scJobGrade;

	private Integer scCompanyType;

	private Integer scYearlySalary;

	private Integer scCurrHouse;

	private Integer scPropertyArea;

	private Integer scPropertyState;

	private Integer scBusinessPurpose;

	private Long createBy;

	private Date createTime;

	private Long updateBy;

	private Date updateTime;

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
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

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard == null ? null : idCard.trim();
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone == null ? null : phone.trim();
	}

	public String getWorkCompany() {
		return workCompany;
	}

	public void setWorkCompany(String workCompany) {
		this.workCompany = workCompany == null ? null : workCompany.trim();
	}

	public String getWorkPhone() {
		return workPhone;
	}

	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone == null ? null : workPhone.trim();
	}

	public String getJobGrade() {
		return jobGrade;
	}

	public void setJobGrade(String jobGrade) {
		this.jobGrade = jobGrade == null ? null : jobGrade.trim();
	}

	public String getNativePlace() {
		return nativePlace;
	}

	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace == null ? null : nativePlace.trim();
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby == null ? null : hobby.trim();
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress == null ? null : homeAddress.trim();
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark == null ? null : remark.trim();
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName == null ? null : agentName.trim();
	}

	public String getAgentPhone() {
		return agentPhone;
	}

	public void setAgentPhone(String agentPhone) {
		this.agentPhone = agentPhone == null ? null : agentPhone.trim();
	}

	public String getGuaranteeName() {
		return guaranteeName;
	}

	public void setGuaranteeName(String guaranteeName) {
		this.guaranteeName = guaranteeName == null ? null : guaranteeName.trim();
	}

	public String getGuaranteePhone() {
		return guaranteePhone;
	}

	public void setGuaranteePhone(String guaranteePhone) {
		this.guaranteePhone = guaranteePhone == null ? null : guaranteePhone.trim();
	}

	public Integer getPersonScore() {
		return personScore;
	}

	public void setPersonScore(Integer personScore) {
		this.personScore = personScore;
	}

	public Integer getPersonLevel() {
		return personLevel;
	}

	public void setPersonLevel(Integer personLevel) {
		this.personLevel = personLevel;
	}

	public Integer getScAge() {
		return scAge;
	}

	public void setScAge(Integer scAge) {
		this.scAge = scAge;
	}

	public Integer getScGender() {
		return scGender;
	}

	public void setScGender(Integer scGender) {
		this.scGender = scGender;
	}

	public Integer getScMaritalStatus() {
		return scMaritalStatus;
	}

	public void setScMaritalStatus(Integer scMaritalStatus) {
		this.scMaritalStatus = scMaritalStatus;
	}

	public Integer getScEducation() {
		return scEducation;
	}

	public void setScEducation(Integer scEducation) {
		this.scEducation = scEducation;
	}

	public Integer getScIndustry() {
		return scIndustry;
	}

	public void setScIndustry(Integer scIndustry) {
		this.scIndustry = scIndustry;
	}

	public Integer getScJobGrade() {
		return scJobGrade;
	}

	public void setScJobGrade(Integer scJobGrade) {
		this.scJobGrade = scJobGrade;
	}

	public Integer getScCompanyType() {
		return scCompanyType;
	}

	public void setScCompanyType(Integer scCompanyType) {
		this.scCompanyType = scCompanyType;
	}

	public Integer getScYearlySalary() {
		return scYearlySalary;
	}

	public void setScYearlySalary(Integer scYearlySalary) {
		this.scYearlySalary = scYearlySalary;
	}

	public Integer getScCurrHouse() {
		return scCurrHouse;
	}

	public void setScCurrHouse(Integer scCurrHouse) {
		this.scCurrHouse = scCurrHouse;
	}

	public Integer getScPropertyArea() {
		return scPropertyArea;
	}

	public void setScPropertyArea(Integer scPropertyArea) {
		this.scPropertyArea = scPropertyArea;
	}

	public Integer getScPropertyState() {
		return scPropertyState;
	}

	public void setScPropertyState(Integer scPropertyState) {
		this.scPropertyState = scPropertyState;
	}

	public Integer getScBusinessPurpose() {
		return scBusinessPurpose;
	}

	public void setScBusinessPurpose(Integer scBusinessPurpose) {
		this.scBusinessPurpose = scBusinessPurpose;
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