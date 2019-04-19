package com.jock.fex.api.base;

import java.io.Serializable;
import java.util.Map;

public class BaseReq implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 用户登录的token
	 */
	private String token;
	/**
	 * 所属系统
	 */
	private String t = "";

	/**
	 * 请求来源:web/applet/wechat/jf_android/jf_ios
	 */
	private String s = "";
	/**
	 * 请求版本
	 */
	private String v = "";

	private Integer page = 1;
	private Integer rows = 15;
	private String sidx = "";// 排序字段
	private String sord = "";// 排序规则

	private Map<Object, Object> param;

	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * @param token
	 *            the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	}

	/**
	 * @return the t
	 */
	public String getT() {
		return t;
	}

	/**
	 * @param t
	 *            the t to set
	 */
	public void setT(String t) {
		this.t = t;
	}

	/**
	 * @return the s
	 */
	public String getS() {
		return s;
	}

	/**
	 * @param s
	 *            the s to set
	 */
	public void setS(String s) {
		this.s = s;
	}

	/**
	 * @return the v
	 */
	public String getV() {
		return v;
	}

	/**
	 * @param v
	 *            the v to set
	 */
	public void setV(String v) {
		this.v = v;
	}

	/**
	 * @return the page
	 */
	public Integer getPage() {
		return page;
	}

	/**
	 * 
	 * @return
	 */
	public int currentPage() {
		if (this.page == null) {
			return 1;
		}
		return page;
	}

	/**
	 * @param page
	 *            the page to set
	 */
	public void setPage(Integer page) {
		if (page == null || page < 1) {
			page = 1;
		}
		this.page = page;
	}

	/**
	 * @return the rows
	 */
	public Integer getRows() {
		return rows;
	}

	/**
	 * @param rows
	 *            the rows to set
	 */
	public void setRows(Integer rows) {
		if (rows == null || rows < 1) {
			rows = 15;
		}
		this.rows = rows;
	}

	/**
	 * @return the sidx
	 */
	public String getSidx() {
		return sidx;
	}

	/**
	 * @param sidx
	 *            the sidx to set
	 */
	public void setSidx(String sidx) {
		this.sidx = sidx;
	}

	/**
	 * @return the sord
	 */
	public String getSord() {
		return sord;
	}

	/**
	 * @param sord
	 *            the sord to set
	 */
	public void setSord(String sord) {
		this.sord = sord;
	}

	/**
	 * @return the param
	 */
	public Map<Object, Object> getParam() {
		return param;
	}

	/**
	 * @param param
	 *            the param to set
	 */
	public void setParam(Map<Object, Object> param) {
		this.param = param;
	}

	/**
	 * 安卓
	 * 
	 * @return
	 */
	public Boolean isAndroid() {
		if ("jf_android".equals(s)) {
			return true;
		}
		return false;
	}

	/**
	 * ios
	 * 
	 * @return
	 */
	public Boolean isIos() {
		if ("jf_ios".equals(s)) {
			return true;
		}
		return false;
	}

	/**
	 * web后台管理
	 * 
	 * @return
	 */
	public Boolean isWeb() {
		if ("web".equals(s)) {
			return true;
		}
		return false;
	}

	/**
	 * 微信
	 * 
	 * @return
	 */
	public Boolean isWechat() {
		if ("wechat".equals(s)) {
			return true;
		}
		return false;
	}

	/**
	 * 微信小程序
	 * 
	 * @return
	 */
	public Boolean isApplet() {
		if ("applet".equals(s)) {
			return true;
		}
		return false;
	}
}
