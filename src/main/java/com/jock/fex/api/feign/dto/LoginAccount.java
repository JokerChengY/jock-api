package com.jock.fex.api.feign.dto;

import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

public class LoginAccount {

	private Long accountId;

	private String token;

	private String accountName;

	private String realName;

	private String phone;

	private String email;

	private String icon;

	private Integer sex;

	private Integer status;

	private List<AccountTypeDTO> typeList;

	private String referrer;

	private Long provinceId;

	private String provinceName;

	private Long cityId;

	private String cityName;

	private Date now;

	private Date expiresTime;

	private String openId;

	private String miniAppOpenId;

	private String qrCode;

	private String businessCity;

	// 按揭员
	private String language;
	private String business;
	private String introduce;
	private String trainCertificate;

	public String getReferrer() {
		return referrer;
	}

	public void setReferrer(String referrer) {
		this.referrer = referrer;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = StringUtils.isEmpty(icon) ? null : icon;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
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

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public List<AccountTypeDTO> getTypeList() {
		return typeList;
	}

	public void setTypeList(List<AccountTypeDTO> typeList) {
		this.typeList = typeList;
	}

	/**
	 * @return the now
	 */
	public Date getNow() {
		return now;
	}

	/**
	 * @param now
	 *            the now to set
	 */
	public void setNow(Date now) {
		this.now = now;
	}

	public Date getExpiresTime() {
		return expiresTime;
	}

	public void setExpiresTime(Date expiresTime) {
		this.expiresTime = expiresTime;
	}

	/**
	 * @return the openId
	 */
	public String getOpenId() {
		return openId;
	}

	/**
	 * @param openId
	 *            the openId to set
	 */
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	/**
	 * @return the miniAppOpenId
	 */
	public String getMiniAppOpenId() {
		return miniAppOpenId;
	}

	/**
	 * @param miniAppOpenId
	 *            the miniAppOpenId to set
	 */
	public void setMiniAppOpenId(String miniAppOpenId) {
		this.miniAppOpenId = miniAppOpenId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	/**
	 * @return the sex
	 */
	public Integer getSex() {
		return sex;
	}

	/**
	 * @param sex
	 *            the sex to set
	 */
	public void setSex(Integer sex) {
		this.sex = sex;
	}

	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @param language
	 *            the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * @return the business
	 */
	public String getBusiness() {
		return business;
	}

	/**
	 * @param business
	 *            the business to set
	 */
	public void setBusiness(String business) {
		this.business = business;
	}

	/**
	 * @return the introduce
	 */
	public String getIntroduce() {
		return introduce;
	}

	/**
	 * @param introduce
	 *            the introduce to set
	 */
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	/**
	 * @return the qrCode
	 */
	public String getQrCode() {
		return qrCode;
	}

	/**
	 * @param qrCode
	 *            the qrCode to set
	 */
	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	/**
	 * @return the businessCity
	 */
	public String getBusinessCity() {
		return businessCity;
	}

	/**
	 * @param businessCity
	 *            the businessCity to set
	 */
	public void setBusinessCity(String businessCity) {
		this.businessCity = businessCity;
	}

	/**
	 * @return the trainCertificate
	 */
	public String getTrainCertificate() {
		return trainCertificate;
	}

	/**
	 * @param trainCertificate
	 *            the trainCertificate to set
	 */
	public void setTrainCertificate(String trainCertificate) {
		this.trainCertificate = trainCertificate;
	}

}
