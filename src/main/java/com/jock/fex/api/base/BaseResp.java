package com.jock.fex.api.base;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class BaseResp<T extends Object> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * 系统版本
	 */
	private String v;

	/**
	 * 成功：200，错误代码使用AABBCC三级返回码。
	 * 
	 * AA级：项目端口号后两位 <br>
	 * BB级：10（参数异常）；20（服务器异常）；30（版本异常）；40（上传下载异常）；50（数据库操作异常）<br>
	 * CC级：10（缺少必要参数）；20（缺少非必要参数）；30（参数类型异常）；40（非法参数）；50（未知异常）
	 * 51（插入异常，插入失败）；52（删除异常，删除失败），53（更新异常，更新失败）；54（查询异常，查询失败）
	 */
	private int code = 200;
	private String message = "操作成功";
	/**
	 * 返回结果集
	 */
	@JsonInclude
	private T result;
	/**
	 * 返回参数
	 */
	private Map<Object, Object> params = new HashMap<Object, Object>();

	/**
	 * 默认构造方法
	 */
	public BaseResp() {

	}

	public BaseResp(int code, String message) {
		this.code = code;
		this.message = message;
	}

	/**
	 * 是否成功构造方法
	 * 
	 * @param blean
	 */
	public BaseResp(boolean blean) {
		logger.debug("Response : " + blean);
		if (!blean) {
			setCode(200);
			setMessage("操作成功");
		} else {
			setCode(500);
			setMessage("操作失败");
		}
	}

	public boolean succeed() {
		return code == 200;
	}

	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(int code) {
		this.code = code;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the result
	 */
	public T getResult() {
		return result;
	}

	/**
	 * @param result
	 *            the result to set
	 * @return
	 */
	public BaseResp<T> setResult(T result) {
		this.result = result;
		return this;
	}

	/**
	 * @return the params
	 */
	public Map<Object, Object> getParams() {
		if (params == null) {
			params = new HashMap<Object, Object>();
		}
		return params;
	}

	/**
	 * @param params
	 *            the params to set
	 */
	public void setParams(Map<Object, Object> params) {
		this.params = params;
	}

	/**
	 * 设置返回状态信息
	 * 
	 * @param code
	 * @param message
	 */
	public BaseResp<T> setState(int code, String message) {
		setCode(code);
		setMessage(message);
		return this;
	}

	/**
	 * 设置成功状态和信息
	 * 
	 * @param code
	 * @param message
	 */
	public BaseResp<T> setSuccess(int code, String message) {
		return setState(code, message);
	}

	/**
	 * 设置失败状态和信息
	 * 
	 * @param code
	 * @param message
	 */
	public BaseResp<T> setFail(int code, String message) {
		return setState(code, message);
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

	@Override
	public String toString() {
		return "BaseResp [ v=" + v + ", code=" + code + ", message=" + message + ", result=" + result + "]";
	}

}
