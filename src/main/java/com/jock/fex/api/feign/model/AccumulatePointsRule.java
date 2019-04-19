package com.jock.fex.api.feign.model;

import javax.validation.constraints.NotNull;
import java.util.Date;


/**
 * 用户积分规则
 * tong
 */
public class AccumulatePointsRule {
	
    private Long id;

    private String name;//规则名称
    @NotNull(message="用户积分规则积分pointsCount不能为空")
    private Integer pointsCount;//积分
    @NotNull(message="用户积分规则状态status 不能为空")
    private Integer status;//状态 0:未启用 1:已启用

    private Integer type;//规则类型 0:每日签到/1:连续签到7天/2:下单/3:邀请注册认证/4:案件评价/5:阅读企业新闻奖励/6:阅读行业新闻奖励/7:查册/8:查看产品/9:积分兑换/10:送i7活动兑换扣减

    private String accountType;//用户类型 0:普通用户,1:中介,2:按揭员/类型可组合

    private Integer isSetApplyLimit;//是否设置适用区间 0:否 1:是2

    private Integer startApplyLimit;//适用区间/开始区间

    private Integer endApplyLimit;//适用区间/介绍区间

    private Integer isSetUpper;//是否设置每天/每月积分上限 0:否 1:是

    private Integer dayMonthUpper;//每天/每月积分上限 0:每天 1:每月

    private Integer upperCount;//每天积分上限

    private Integer isSetSameHandle;//同一位置操作的获得积分机会次数 0:否 1:是

    private Integer sameHandleCount;//同一位置操作的获得积分机会次数

    private Date createTime;//创建日期

    private Date updateTime;//修改日期

    private Long createBy;//创建人

    private Long updateBy;//修改人

    private String description;//描述

    private String realName;//修改人

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPointsCount() {
        return pointsCount;
    }

    public void setPointsCount(Integer pointsCount) {
        this.pointsCount = pointsCount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Integer getIsSetApplyLimit() {
        return isSetApplyLimit;
    }

    public void setIsSetApplyLimit(Integer isSetApplyLimit) {
        this.isSetApplyLimit = isSetApplyLimit;
    }

    public Integer getStartApplyLimit() {
        return startApplyLimit;
    }

    public void setStartApplyLimit(Integer startApplyLimit) {
        this.startApplyLimit = startApplyLimit;
    }

    public Integer getEndApplyLimit() {
        return endApplyLimit;
    }

    public void setEndApplyLimit(Integer endApplyLimit) {
        this.endApplyLimit = endApplyLimit;
    }

    public Integer getIsSetUpper() {
        return isSetUpper;
    }

    public void setIsSetUpper(Integer isSetUpper) {
        this.isSetUpper = isSetUpper;
    }

    public Integer getDayMonthUpper() {
        return dayMonthUpper;
    }

    public void setDayMonthUpper(Integer dayMonthUpper) {
        this.dayMonthUpper = dayMonthUpper;
    }

    public Integer getUpperCount() {
        return upperCount;
    }

    public void setUpperCount(Integer upperCount) {
        this.upperCount = upperCount;
    }

    public Integer getIsSetSameHandle() {
        return isSetSameHandle;
    }

    public void setIsSetSameHandle(Integer isSetSameHandle) {
        this.isSetSameHandle = isSetSameHandle;
    }

    public Integer getSameHandleCount() {
        return sameHandleCount;
    }

    public void setSameHandleCount(Integer sameHandleCount) {
        this.sameHandleCount = sameHandleCount;
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

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }
}