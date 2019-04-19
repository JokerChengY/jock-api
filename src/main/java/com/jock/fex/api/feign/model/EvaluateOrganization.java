package com.jock.fex.api.feign.model;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class EvaluateOrganization implements Serializable {
    private Long evaluateOrganizationId;

    /**
     * 评估公司名
     */
    @NotBlank(message="名称不能为空")
    private String name;

    /**
     * 省id
     */
    @NotNull(message="省名称不能为空")
    private Long provinceId;

    /**
     * 省名称
     */
    private String provinceName;

    /**
     * 市id
     */
    @NotNull(message="市名称不能为空")
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
     * 取值类型，0固定值，1动态值，2范围值
     */
    private Integer rangeType;

    /**
     * 设定值
     */
    private String rangeValue;

    /**
     * 状态 0:禁用 1:启用
     */
    private Integer status;

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

    public Long getEvaluateOrganizationId() {
        return evaluateOrganizationId;
    }

    public void setEvaluateOrganizationId(Long evaluateOrganizationId) {
        this.evaluateOrganizationId = evaluateOrganizationId;
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

    public Integer getRangeType() {
        return rangeType;
    }

    public void setRangeType(Integer rangeType) {
        this.rangeType = rangeType;
    }

    public String getRangeValue() {
        return rangeValue;
    }

    public void setRangeValue(String rangeValue) {
        this.rangeValue = rangeValue;
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