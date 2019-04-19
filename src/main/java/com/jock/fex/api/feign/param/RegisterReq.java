package com.jock.fex.api.feign.param;

import com.jock.fex.api.base.BaseReq;

import java.io.Serializable;

public class RegisterReq extends BaseReq implements Serializable {
	
	private static final long serialVersionUID = 414163816456410879L;

	private String phone;//手机号码

	private String accountName;//用户名

	private String email;//邮箱
	
	private String realName;//姓名

	private String password;//密码
	
	private String icon;//头像

	private Integer sex;//性别

	private Long provinceId;//省id

	private String provinceName;//省名称

	private Long cityId;//市id

	private String cityName;//市名称

	private Integer regWay;//注册来源

	private String referrer;//推荐人

	private Integer[] types;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public Integer getRegWay() {
		return regWay;
	}

	public void setRegWay(Integer regWay) {
		this.regWay = regWay;
	}

	public String getReferrer() {
		return referrer;
	}

	public void setReferrer(String referrer) {
		this.referrer = referrer;
	}

	public Integer[] getTypes() {
		return types;
	}

	public void setTypes(Integer[] types) {
		this.types = types;
	}
}