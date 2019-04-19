package com.jock.fex.api.feign.model;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Company implements Serializable {
    /**
     * Id
     */
    private Long companyId;

    /**
     * 公司名称
     */
    @NotBlank(message="公司名称不能为空")
    private String name;

    /**
     * 是否业务部门，0否，1是
     */
    private Integer isBusiness;

    /**
     * 区域，0广州，1外区
     */
    private Integer area;

    /**
     * 父级id
     */
    @NotNull(message="父级id不能为空")
    private Long parentId;

    /**
     * 级别 1, 2, 3, 4, 5
     */
    @NotNull(message="级别不能为空")
    private Integer grade;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 主管
     */
    private String supervisor;

    /**
     * 案号规则
     */
    private String numRules;

    /**
     * 备注
     */
    private String remark;

    /**
     * 状态，0禁用，1可用
     */
    private Integer status;

    /**
     * 创建人
     */
    private Long createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改人
     */
    private Long updateBy;

    /**
     * 修改时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIsBusiness() {
        return isBusiness;
    }

    public void setIsBusiness(Integer isBusiness) {
        this.isBusiness = isBusiness;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public String getNumRules() {
        return numRules;
    }

    public void setNumRules(String numRules) {
        this.numRules = numRules;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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