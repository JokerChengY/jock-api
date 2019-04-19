package com.jock.fex.api.feign.dto;

import java.io.Serializable;

/**
 * 2018年10月25日<br>
 * 数据字典缓存对象<br>
 * 从数据字典取数出来存到redis的数据
 * 
 * @author 0
 *
 */
public class DataDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String dataKey;
	private String dataValue;
	private String dataRemark;

	/**
	 * @return the dataKey
	 */
	public String getDataKey() {
		return dataKey;
	}

	/**
	 * @param dataKey
	 *            the dataKey to set
	 */
	public void setDataKey(String dataKey) {
		this.dataKey = dataKey;
	}

	/**
	 * @return the dataValue
	 */
	public String getDataValue() {
		return dataValue;
	}

	/**
	 * @param dataValue
	 *            the dataValue to set
	 */
	public void setDataValue(String dataValue) {
		this.dataValue = dataValue;
	}

	/**
	 * @return the dataRemark
	 */
	public String getDataRemark() {
		return dataRemark;
	}

	/**
	 * @param dataRemark
	 *            the dataRemark to set
	 */
	public void setDataRemark(String dataRemark) {
		this.dataRemark = dataRemark;
	}

}
