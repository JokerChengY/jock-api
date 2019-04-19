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
 * 查询项目接口
 * 
 * @author 0
 *
 */
@FeignClient(value = "searchmgr")
@Component(value = "feignSearchService")
public interface SearchService {

	/**
	 * 根据openId查询查册管理员
	 * 
	 * @param openId
	 *            openId
	 * @param t
	 *            t
	 * @param s
	 *            s
	 * @return
	 */
	@RequestMapping(value = "/search/admin/web/openId", method = RequestMethod.GET)
	BaseResp<?> getSearchAdminByOpenId(@RequestParam("openId") String openId, @RequestParam("t") String t,
                                       @RequestParam("s") String s);

	/**
	 * 支付回调
	 *
	 * @param t
	 * @param s
	 * @param map
	 * @return
	 */
	@Deprecated
	@RequestMapping(value = "/search/web/allinpay/callback", method = RequestMethod.PUT)
	BaseResp<?> allinPayCallback(@RequestParam("t") String t, @RequestParam("s") String s,
                                 @RequestParam("map") Map<String, Object> map);

	/**
	 * 退款回调
	 * 
	 * @param param
	 *            t、s、orderCode
	 * @return boolean
	 */
	@Deprecated
	@RequestMapping(value = "/search/web/refund/callback", method = RequestMethod.PUT)
	BaseResp<?> refundCallback(@RequestParam("map") Map<String, Object> param);

	/**
	 * 支付回调
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/search/web/allinpay/callback", method = RequestMethod.PUT)
	BaseResp<Object> paySuccessCallback(@RequestParam("param") Map<String, Object> param);

	/**
	 * 退款回调
	 * 
	 * @param param
	 *            t、s、orderCode
	 * @return boolean
	 */
	@RequestMapping(value = "/search/web/refund/callback", method = RequestMethod.PUT)
	BaseResp<Object> refundSuccessCallback(@RequestParam("param") Map<String, Object> param);

	/**
	 * 2019年1月14日<br>
	 * 查询最新
	 * 
	 * @param param
	 *            t,s,accountId
	 * @return
	 */
	@RequestMapping(value = "/search/progress/last", method = RequestMethod.GET)
	BaseResp<AppProgress> lastLimitOne(@RequestParam("param") Map<String, Object> param);
}
