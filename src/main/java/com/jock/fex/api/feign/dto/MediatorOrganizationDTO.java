package com.jock.fex.api.feign.dto;

import com.jock.fex.api.feign.model.MediatorOrganization;

/**
 * 中介公司对象DTO
 * 
 * @author hj
 *
 */
public class MediatorOrganizationDTO extends MediatorOrganization {

	private static final long serialVersionUID = -5149532721559806575L;

	/**
	 * 会员级别
	 */
	private String levelText;

	/**
	 * 合作方式
	 */
	private String cooperationInformationText;

	/**
	 * 状态
	 */
	private String statusText;
	
	/**
	 * 中介公司id
	 */
	private Long id;

	public Long getId() {
		return this.getMediatorOrganizationId();
	}

	public String getLevelText() {
		return levelText;
	}

	public void setLevelText(String levelText) {
		this.levelText = levelText;
	}

	public String getCooperationInformationText() {
		return cooperationInformationText;
	}

	public void setCooperationInformationText(String cooperationInformationText) {
		this.cooperationInformationText = cooperationInformationText;
	}

	public String getStatusText() {
		return statusText;
	}

	public void setStatusText(String statusText) {
		this.statusText = statusText;
	}
}
