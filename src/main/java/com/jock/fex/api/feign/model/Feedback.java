package com.jock.fex.api.feign.model;

import java.util.Date;

public class Feedback {
    private Long feedbackId;

	private String caseNumber;

	private String feedbackInfo;

	private Long createBy;

	private Date createTime;

	private Long updateBy;

	private Date updateTime;

	public Long getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(Long feedbackId) {
		this.feedbackId = feedbackId;
	}

	public String getCaseNumber() {
		return caseNumber;
	}

	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber == null ? null : caseNumber.trim();
	}

	public String getFeedbackInfo() {
		return feedbackInfo;
	}

	public void setFeedbackInfo(String feedbackInfo) {
		this.feedbackInfo = feedbackInfo == null ? null : feedbackInfo.trim();
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