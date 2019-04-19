package com.jock.fex.api.feign.model;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class DataDictionary implements Serializable {

	/**
     * Id
     */
    private Long dataDictionaryId;

    /**
     * 唯一Code
     */
    private String dataCode;

    /**
     * �?
     */
    private String dataValue;

    /**
     * 值名�?
     */
    @NotBlank(message="名称不能为空")
    private String dataName;

    /**
     * 备注
     */
    private String dataRemark;
    
    /**
     * 扩展字段
     */
	private String dataExt;

    /**
     * 类型表id
     */
    @NotNull(message="类型不能为空")
    private Long dataTypeId;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 状�??
     */
    private Integer status;

    /**
     * 创建�?
     */
    private Long createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Long getDataDictionaryId() {
        return dataDictionaryId;
    }

    public void setDataDictionaryId(Long dataDictionaryId) {
        this.dataDictionaryId = dataDictionaryId;
    }

    public String getDataCode() {
        return dataCode;
    }

    public void setDataCode(String dataCode) {
        this.dataCode = dataCode;
    }

    public String getDataValue() {
        return dataValue;
    }

    public void setDataValue(String dataValue) {
        this.dataValue = dataValue;
    }

    public String getDataName() {
        return dataName;
    }

    public void setDataName(String dataName) {
        this.dataName = dataName;
    }

    public String getDataRemark() {
        return dataRemark;
    }

    public void setDataRemark(String dataRemark) {
        this.dataRemark = dataRemark;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
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

	public Long getDataTypeId() {
		return dataTypeId;
	}

	public void setDataTypeId(Long dataTypeId) {
		this.dataTypeId = dataTypeId;
	}

	public String getDataExt() {
		return dataExt;
	}

	public void setDataExt(String dataExt) {
		this.dataExt = dataExt;
	}
}