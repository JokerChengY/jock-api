package com.jock.fex.api.base;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class BaseResult<T> implements Serializable {

	private static final long serialVersionUID = 1L;

	private int code ;
	
	private String message;
	/**
	 * 返回结果集
	 */
	private T result;
	/**
	 * 系统版本
	 */
	private String v;
	/**
	 * 返回参数
	 */
	private Map<Object, Object> params = new HashMap<Object, Object>();
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getResult() {
		return result;
	}
	public void setResult(T result) {
		this.result = result;
	}
	public String getV() {
		return v;
	}
	public void setV(String v) {
		this.v = v;
	}
	public Map<Object, Object> getParams() {
		return params;
	}
	public void setParams(Map<Object, Object> params) {
		this.params = params;
	}

	

}
