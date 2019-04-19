package com.jock.fex.api.feign;

import com.jock.fex.api.base.BaseResp;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 活动接口
 * 
 * @author 0
 *
 */
@FeignClient(value = "activitymgr")
@Component(value = "feignActivityService")
public interface ActivityService {

	/**
	 * 签到数据
	 * 
	 * @param param
	 * @return
	 */
	@RequestMapping(value = "/signin", method = RequestMethod.GET)
	BaseResp<Map<String, Object>> signIn(@RequestParam("req") Map<String, Object> param);

	/**
	 * 发红包
	 * 
	 * @param params
	 * @author ldt
	 */
	@PostMapping(value = "/red-packets/transactions")
	BaseResp<Boolean> redPacket(@RequestParam("req") Map<String, Object> params);

	/**
	 * 根据用户类型和金融产品id查询是否有红包活动
	 * 
	 * @author zgr
	 * @param accountType
	 * @param productId
	 * @return
	 */
	@GetMapping(value = "/activity/inline/getActivityByProductIdAccountType")
	BaseResp getActivityByProductIdAccountType(@RequestParam("t") String t, @RequestParam("s") String s);

	/**
	 * 2018年7月28日<br>
	 * 是否显示红包
	 * 
	 * @param orderCode
	 * @param params
	 *            t s accountId
	 * @return
	 */
	@GetMapping("/red-packets/transactions/{sn}")
	BaseResp<Object> showRedpacket(@PathVariable("sn") String orderCode, @RequestParam Map<String, Object> params);
}
