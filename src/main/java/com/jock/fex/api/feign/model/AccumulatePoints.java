package com.jock.fex.api.feign.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * 用户积分流水表
 * Tong
 */

public class AccumulatePoints {
    private Long id;

    private Long accountId;//用户主键id

    private String realName;//用户名称

    private String accountType;//用户类型

    private Long accumulatePointsRuleId;//积分规则主键id

    private String accumulatePointsRuleName;//积分规则名称

    private Long sourceId;//积分来源主键id/如：查看产品的产品主键

    private Integer pointsCount;//积分

    private Integer Type;//规则类型 0:每日签到/1:连续签到7天/2:下单/3:邀请注册认证/4:案件评价/5:阅读企业新闻奖励/6:阅读行业新闻奖励/7:查册/8:查看产品/9:积分兑换/10:送i7活动兑换扣减/17订单退款积分回退

    private Integer Status;//积分类型 0:收入1:支出

    private Date createTime;//积分日期

    private String typeName;//积分类型名称

    private String statusName;//积分状态名称

    private String accountTypeName;//用户类型名称

    /**
     * 用户手机号 流水表中 无该字段，做页面扩展显示
     */
    private String phone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Long getAccumulatePointsRuleId() {
        return accumulatePointsRuleId;
    }

    public void setAccumulatePointsRuleId(Long accumulatePointsRuleId) {
        this.accumulatePointsRuleId = accumulatePointsRuleId;
    }

    public String getAccumulatePointsRuleName() {
        return accumulatePointsRuleName;
    }

    public void setAccumulatePointsRuleName(String accumulatePointsRuleName) {
        this.accumulatePointsRuleName = accumulatePointsRuleName;
    }

    public Long getSourceId() {
        return sourceId;
    }

    public void setSourceId(Long sourceId) {
        this.sourceId = sourceId;
    }

    public Integer getPointsCount() {
        return pointsCount;
    }

    public void setPointsCount(Integer pointsCount) {
        this.pointsCount = pointsCount;
    }

    public Integer getType() {
        return Type;
    }

    public void setType(Integer Type) {
        this.Type = Type;
    }

    public Integer getStatus() {
        return Status;
    }

    public void setStatus(Integer status) {
        Status = status;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getAccountTypeName() {
        return accountTypeName;
    }

    public void setAccountTypeName(String accountTypeName) {
        this.accountTypeName = accountTypeName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}