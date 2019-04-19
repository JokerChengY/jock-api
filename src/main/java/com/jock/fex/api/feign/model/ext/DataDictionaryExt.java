package com.jock.fex.api.feign.model.ext;

import com.jock.fex.api.feign.model.DataDictionary;

/**
 * @author 
 */
public class DataDictionaryExt extends DataDictionary {
	
	private static final long serialVersionUID = 8468591424269154952L;
	
	private String type;
	private String typeName;
	private Long id;
	private String name;
	
	public Long getId(){
		return this.getDataDictionaryId();
	}
	
	public String getName(){
		return this.getDataName();
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
}