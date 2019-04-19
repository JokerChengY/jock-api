package com.jock.fex.api.feign.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class CalculateScheme  {

	private Long calculateId;//计算方案Id

    private Integer calculateType;//计算方式编号

    private Long schemeId;//分成方案Id

    private BigDecimal fixAmount;//固定金额或提成比例
    
    private Integer availType;//生效方式，0按天 ，1按月

    private Date availTime;//生效时间

    private Date unavailTime;//失效时间

    private Date createDate;//创建时间

    private Date updateTime;//更新时间

    private String souWay;//来源
    
    private List<GraduationRate> graduationRates;//超额累进分级
    
    public Integer getAvailType() {
		return availType;
	}

	public void setAvailType(Integer availType) {
		this.availType = availType;
	}

	public List<GraduationRate> getGraduationRates() {
		return graduationRates;
	}

	public void setGraduationRates(List<GraduationRate> graduationRates) {
		this.graduationRates = graduationRates;
	}

	public Long getCalculateId() {
        return calculateId;
    }

    public void setCalculateId(Long calculateId) {
        this.calculateId = calculateId;
    }

    public Integer getCalculateType() {
        return calculateType;
    }

    public void setCalculateType(Integer calculateType) {
        this.calculateType = calculateType;
    }

    public Long getSchemeId() {
        return schemeId;
    }

    public void setSchemeId(Long schemeId) {
        this.schemeId = schemeId;
    }

    public BigDecimal getFixAmount() {
		return fixAmount;
	}

	public void setFixAmount(BigDecimal fixAmount) {
		this.fixAmount = fixAmount;
	}

	public Date getAvailTime() {
        return availTime;
    }

    public void setAvailTime(Date availTime) {
        this.availTime = availTime;
    }

    public Date getUnavailTime() {
        return unavailTime;
    }

    public void setUnavailTime(Date unavailTime) {
        this.unavailTime = unavailTime;
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
    
    public String getSouWay() {
		return souWay;
	}

	public void setSouWay(String souWay) {
		this.souWay = souWay;
	}
}