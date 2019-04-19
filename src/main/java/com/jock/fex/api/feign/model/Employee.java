package com.jock.fex.api.feign.model;

import com.jock.fex.api.base.BaseReq;

import java.util.Date;

public class Employee extends BaseReq {
	
	private static final long serialVersionUID = 174584948L;
	
	private Long employeeId;//员工Id

	private Long accountId;//账号id

	private String employeeNum;//员工编码

	private String userName;//登录名
	
	private String password;//登录密码

	private String employeeName;//员工姓名

	private Long parentId;//父级id

	private Integer isManage;//是否主管

	private Integer gender;//性别

	private Long deptId;//部门id
	
	private String deptCode;//部门编号

	private Long companyId;//公司id
	
	private String position;//职位名称

	private Long positionId;//职位id

	private Date entryDate;//入职时间

	private Date birthday;//生日

	private Integer type;//人员类型：0正式员工，1临时工

	private String idCard;//身份证

	private String phone;//手机号

	private String workPhone;//工作电话

	private String shortPhone;//短号

	private String postcode;//邮编

	private String homePhone;//家庭电话

	private String homeAddress;//家庭地址

	private Double basicWage;//基本工资

	private String email;//邮箱

	private String remark;//备注

	private Date leaveDate;//离职日期

	private Integer status;//状态

	private String province;//省

	private String city;//市

	private String county;//区

	private String emergContact;//紧急联系人

	private String relation;//与紧急联系人关系

	private String emergPhone;//联系人电话

	private String wechatNum;//微信号

	private String licenseNumber;//执业证号

	private String souWay;//员工来源 3按揭 4中介
	
	private Long createBy;

	private Date createTime;

	private Long updateBy;

	private Date updateTime;

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Integer getIsManage() {
		return isManage;
	}

	public void setIsManage(Integer isManage) {
		this.isManage = isManage;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
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

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
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
		this.idCard = idCard;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getWorkPhone() {
		return workPhone;
	}

	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}

	public String getShortPhone() {
		return shortPhone;
	}

	public void setShortPhone(String shortPhone) {
		this.shortPhone = shortPhone;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Double getBasicWage() {
		return basicWage;
	}

	public void setBasicWage(Double basicWage) {
		this.basicWage = basicWage;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getLeaveDate() {
		return leaveDate;
	}

	public void setLeaveDate(Date leaveDate) {
		this.leaveDate = leaveDate;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getEmergContact() {
		return emergContact;
	}

	public void setEmergContact(String emergContact) {
		this.emergContact = emergContact;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public String getEmergPhone() {
		return emergPhone;
	}

	public void setEmergPhone(String emergPhone) {
		this.emergPhone = emergPhone;
	}

	public String getWechatNum() {
		return wechatNum;
	}

	public void setWechatNum(String wechatNum) {
		this.wechatNum = wechatNum;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public String getSouWay() {
		return souWay;
	}

	public void setSouWay(String souWay) {
		this.souWay = souWay;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}