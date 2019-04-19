package com.jock.fex.api.feign.model;

import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class MediatorOrganization implements Serializable {
    private Long mediatorOrganizationId;

    /**
     * 中介名
     */
    @NotBlank(message="名称不能为空")
    private String name;

    /**
     * 省id
     */
    @NotBlank(message="省份不能为空")
    private Long provinceId;

    /**
     * 省名称
     */
    private String provinceName;

    /**
     * 市id
     */
    @NotBlank(message="城市不能为空")
    private Long cityId;

    /**
     * 市名称
     */
    private String cityName;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 联系人
     */
    private String contacts;

    /**
     * 联系方式
     */
    private String contactInformation;

    /**
     * 状态 0:禁用 1:启用
     */
    private Integer status;

    /**
     * 签约时间
     */
    private Date signDate;

    /**
     * 到期时间
     */
    private Date expireDate;

    /**
     * 签约人
     */
    private String signBy;

    /**
     * 会员等级，0银卡，1金卡，2砖石卡
     */
    private Integer level;

    /**
     * 合作方式，0无签约合作伙伴，1重要战略合作伙伴，2唯一战略合作伙伴
     */
    private Integer cooperationInformation;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人id
     */
    private Long createBy;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 修改人
     */
    private Long updateBy;

    private static final long serialVersionUID = 1L;

    public Long getMediatorOrganizationId() {
        return mediatorOrganizationId;
    }

    public void setMediatorOrganizationId(Long mediatorOrganizationId) {
        this.mediatorOrganizationId = mediatorOrganizationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getSignDate() {
        return signDate;
    }

    public void setSignDate(Date signDate) {
        this.signDate = signDate;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public String getSignBy() {
        return signBy;
    }

    public void setSignBy(String signBy) {
        this.signBy = signBy;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getCooperationInformation() {
        return cooperationInformation;
    }

    public void setCooperationInformation(Integer cooperationInformation) {
        this.cooperationInformation = cooperationInformation;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }
}