package com.jock.fex.api.base;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PageBean<T> implements Serializable {

	private static final long serialVersionUID = 2674565007012146041L;
	private int nowPage = 1;
	private int pageSize = 15;
	private int totalRecord;
	private int totalPage = 1;
	private boolean requireTotal = true;
	private List<T> resultList;
	private Object jsonList;
	private Map<String, Object> params = new HashMap<String, Object>();
	
	public PageBean() {
		super();
	}

	public PageBean(int nowPage, int pageSize) {
		super();
		if(nowPage>=1) {
			this.nowPage = nowPage;
		}
		if(pageSize>=1) {
			this.pageSize = pageSize;
		}
	}

	public int getNowPage() {
		return this.nowPage;
	}

	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}

	public int getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalRecord() {
		return this.totalRecord;
	}

	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
		if (totalRecord > 0) {
			int totalPage = totalRecord % this.pageSize == 0 ? totalRecord / this.pageSize
					: totalRecord / this.pageSize + 1;
			this.setTotalPage(totalPage);
		}

	}

	public int getTotalPage() {
		return this.totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public boolean isRequireTotal() {
		return this.requireTotal;
	}

	public void setRequireTotal(boolean requireTotal) {
		this.requireTotal = requireTotal;
	}

	public List<T> getResultList() {
		return this.resultList;
	}

	public void setResultList(List<T> resultList) {
		this.resultList = resultList;
	}

	public Map<String, Object> getParams() {
		return this.params;
	}

	public void setParams(Map<String, Object> params) {
		this.params = params;
	}

	public Object getJsonList() {
		return this.jsonList;
	}

	public void setJsonList(Object jsonList) {
		this.jsonList = jsonList;
	}

}