package com.jock.fex.api.feign.model.vo;

import java.util.Date;

/**
 * 2019年1月14日<br>
 * App最新信息提示
 * 
 * @author 0
 *
 */
public class AppProgress {

	private int dot;// 红点显示：0-不显示，1-显示
	private String tipLeft = "";// 提示信息
	private String tipRight = "";// 产权人姓名
	private String id = ""; // 订单id
	private int status;// 订单状态
	private Date createTime;// 最新时间

	/**
	 * @return the dot
	 */
	public int getDot() {
		return dot;
	}

	/**
	 * @param dot
	 *            the dot to set
	 */
	public void setDot(int dot) {
		this.dot = dot;
	}

	/**
	 * @return the tipLeft
	 */
	public String getTipLeft() {
		return tipLeft;
	}

	/**
	 * @param tipLeft
	 *            the tipLeft to set
	 */
	public void setTipLeft(String tipLeft) {
		if (tipLeft == null) {
			tipLeft = "";
		}
		this.tipLeft = tipLeft;
	}

	/**
	 * @return the tipRight
	 */
	public String getTipRight() {
		return tipRight;
	}

	/**
	 * @param tipRight
	 *            the tipRight to set
	 */
	public void setTipRight(String tipRight) {
		if (tipRight == null) {
			tipRight = "";
		}
		this.tipRight = tipRight;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime
	 *            the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}
