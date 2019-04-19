package com.jock.fex.api.feign;

import com.jock.fex.api.base.BaseResp;
import org.springframework.web.bind.annotation.RequestParam;

public interface BaseUserService {

	/**
	 * 获取当前登录人
	 * 
	 * @param token
	 * @param t
	 * @param s
	 * @return
	 */
	BaseResp currentUser(@RequestParam("token") String token, @RequestParam("t") String t, @RequestParam("s") String s);
}
