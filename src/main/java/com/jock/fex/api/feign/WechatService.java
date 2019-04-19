package com.jock.fex.api.feign;

import com.jock.fex.api.base.BaseResp;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(value = "wechatmgr")
@Component(value = "feignWechatService")
public interface WechatService {

	/**
	 * 获取微信配置
	 * 
	 * @param param
	 *            t、s
	 * @return
	 */
	@RequestMapping(value = "/wx/config", method = RequestMethod.GET)
	public BaseResp<Object> wxConfig(@RequestParam("map") Map<String, Object> map);

}
