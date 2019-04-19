package com.jock.fex.api.feign.param;

import com.jock.fex.api.base.BaseReq;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class LoginReq extends BaseReq implements Serializable {
	
	private static final long serialVersionUID = 414163816456410869L;
	@NotBlank(message="账号不能为空")
	private String loginUser;//登录名
	
	@NotBlank(message="密码不能为空")
    private String password;//登录密码md5加密
	
	@NotNull(message="os不能为空")
	private Integer os;//系统
	
	@NotBlank(message="设备id不能为空")
	private String deviceId;
	
	@NotBlank(message="客户端不能为空")
	private String clientId;
	

	public Integer getOs() {
		return os;
	}

	public void setOs(Integer os) {
		this.os = os;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getLoginUser() {
		return loginUser;
	}

	public void setLoginUser(String loginUser) {
		this.loginUser = loginUser;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}