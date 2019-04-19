package com.jock.fex.api.feign;

import com.jock.fex.api.base.BaseResp;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "couponmgr")
@Component(value = "feignCouponService")
public interface CouponService {

	/**
	 * 查询有效优惠券，不分页
	 * 
	 * @param t
	 *            t
	 * @param s
	 *            s
	 * @return
	 */
	@RequestMapping(value = "/coupon/select/all/enabled", method = RequestMethod.GET)
	BaseResp<Object> selectAllEnabledCoupon(@RequestParam("t") String t, @RequestParam("s") String s);

	/**
	 * 即将过期的优惠券
	 * 
	 * @param token
	 *            token
	 * @param t
	 *            t
	 * @param s
	 *            s
	 * @return
	 */
	@RequestMapping(value = "/coupon/account/app/overdue/count", method = RequestMethod.GET)
	BaseResp<Object> appOverdueCount(@RequestParam("token") String token, @RequestParam("t") String t,
                                     @RequestParam("s") String s);

}
