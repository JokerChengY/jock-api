package com.jock.fex.api.feign.model;

import java.math.BigDecimal;
import java.util.Date;

public class CalculateParamsReq {
	
	private String formula;//计算公式
	
	private BigDecimal money;//所得提成金额
	
	private BigDecimal accumulate;//已收业绩累积(包括实收和成交)
	
	private BigDecimal collection;//实收金额
	
	private BigDecimal param;//返回参数
	

	public BigDecimal getParam() {
		return param;
	}

	public void setParam(BigDecimal param) {
		this.param = param;
	}

	private Date createDate;
	
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}


	public BigDecimal getMoney() {
		return money;
	}

	public BigDecimal getCollection() {
		return collection;
	}

	public String getFormula() {
		return formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

	public BigDecimal getAccumulate() {
		return accumulate;
	}

	public void setAccumulate(BigDecimal accumulate) {
		this.accumulate = accumulate;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}

	public void setCollection(BigDecimal collection) {
		this.collection = collection;
	}

	
}
