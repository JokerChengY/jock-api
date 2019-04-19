package com.jock.fex.api.feign.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class AccountDTO implements Serializable {

	private static final long serialVersionUID = -5716908140787996307L;

	private Long accountId;

	private String phone;

	private String accountName;

	private String email;
	
	private String realName;

	private String icon;

	private Integer sex;

	private Long provinceId;

	private String provinceName;

	private Long cityId;

	private String cityName;

	private Integer status;

	private String openId;

	private String miniAppOpenId;

	private Integer regWay;

	private String referrer;

	private Date referrerTime;

	private String position; 
	
	private String desc;

	private Date createTime;

	private Date updateTime;
	
	private List<AccountTypeDTO> typeList;

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getRegWay() {
		return regWay;
	}

	public void setRegWay(Integer regWay) {
		this.regWay = regWay;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Long getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(Long provinceId) {
		this.provinceId = provinceId;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public Long getCityId() {
		return cityId;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getMiniAppOpenId() {
		return miniAppOpenId;
	}

	public void setMiniAppOpenId(String miniAppOpenId) {
		this.miniAppOpenId = miniAppOpenId;
	}

	public String getReferrer() {
		return referrer;
	}

	public void setReferrer(String referrer) {
		this.referrer = referrer;
	}

	public Date getReferrerTime() {
		return referrerTime;
	}

	public void setReferrerTime(Date referrerTime) {
		this.referrerTime = referrerTime;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public List<AccountTypeDTO> getTypeList() {
		return typeList;
	}

	public void setTypeList(List<AccountTypeDTO> typeList) {
		this.typeList = typeList;
	}

}
