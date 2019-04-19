package com.jock.fex.api.feign;

import com.jock.fex.api.base.BaseResp;
import com.jock.fex.api.feign.model.vo.AppProgress;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * 评估接口
 * 
 * @author 0
 *
 */
@FeignClient(value = "onlinemgr")
@Component(value = "feignOnlineService")
public interface OnlineService {

	/**
	 * 2018年9月27日<br>
	 * 支付回调
	 * 
	 * @param param
	 *            t、s、orderCode、payMode
	 * @return null
	 */
	@RequestMapping(value = "/admin/assessment/order/pay/success/callback", method = RequestMethod.PUT)
	BaseResp<Object> paySuccessCallback(@RequestParam("param") Map<String, Object> param);

	/**
	 * 退款回调
	 * 
	 * @param param
	 *            t、s、orderCode
	 * @return null
	 */
	@RequestMapping(value = "/admin/assessment/order/refund/success/callback", method = RequestMethod.PUT)
	BaseResp<Object> refundSuccessCallback(@RequestParam("param") Map<String, Object> param);

	/**
	 * 2019年1月14日<br>
	 * 查询最新
	 * 
	 * @param param
	 *            t,s,accountId
	 * @return
	 */
	@RequestMapping(value = "/admin/order/progress/last", method = RequestMethod.GET)
	BaseResp<AppProgress> lastLimitOne(@RequestParam("param") Map<String, Object> param);
}
