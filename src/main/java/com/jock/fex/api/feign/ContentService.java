package com.jock.fex.api.feign;

import com.jock.fex.api.base.BaseResp;
import com.jock.fex.api.feign.dto.LoginAccount;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * 内容接口
 * 
 * @author 0
 *
 */
@FeignClient(value = "contentmgr")
@Component(value = "feignContentService")
public interface ContentService {

	/**
	 * 保存异常信息
	 * 
	 * @param token
	 * @param t
	 * @param s
	 * @return
	 */
	@PostMapping(value = "/exceptionInfo/public/saveExceptionInfo")
	BaseResp<LoginAccount> saveExceptionInfo(@RequestParam("params") Map<String, Object> params,
                                             @RequestParam("t") String t, @RequestParam("s") String s);

	/**
	 * 2018年11月12日<br>
	 * 支付成功回调
	 * 
	 * @param param
	 * @return
	 */
	@RequestMapping(value = "/examMessage/inline/payExamMessageCallBack", method = RequestMethod.PUT)
	BaseResp<Object> paySuccessCallback(@RequestParam("param") Map<String, Object> param);
}
