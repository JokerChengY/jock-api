package com.jock.fex.api.feign.model;

/**
 * 用户积分汇总
 */
public class AccumulatePointsSummary {
    private Long id;//

    private Long accountId;//用户主键id

    private Integer pointsCount;//总积分

    private Integer overplusPointsCount;//剩余积分

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

    public Integer getPointsCount() {
        return pointsCount;
    }

    public void setPointsCount(Integer pointsCount) {
        this.pointsCount = pointsCount;
    }

    public Integer getOverplusPointsCount() {
        return overplusPointsCount;
    }

    public void setOverplusPointsCount(Integer overplusPointsCount) {
        this.overplusPointsCount = overplusPointsCount;
    }
}