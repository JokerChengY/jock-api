package com.jock.fex.api.feign.model;

import java.math.BigDecimal;
import java.util.Date;

public class GraduationRate {
    private Long id;//主键

    private Long calculateId;//计算方案Id

    private Integer level;//级数

    private BigDecimal lowerline;//业绩区间下限(不含)

    private BigDecimal topline;//业绩区间上限(含)

    private BigDecimal shareRate;//提成比例

    private Date createDate;//创建时间

    private Date updateTime;//更新时间

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCalculateId() {
        return calculateId;
    }

    public void setCalculateId(Long calculateId) {
        this.calculateId = calculateId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public BigDecimal getLowerline() {
        return lowerline;
    }

    public void setLowerline(BigDecimal lowerline) {
        this.lowerline = lowerline;
    }

    public BigDecimal getTopline() {
        return topline;
    }

    public void setTopline(BigDecimal topline) {
        this.topline = topline;
    }

    public BigDecimal getShareRate() {
        return shareRate;
    }

    public void setShareRate(BigDecimal shareRate) {
        this.shareRate = shareRate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}