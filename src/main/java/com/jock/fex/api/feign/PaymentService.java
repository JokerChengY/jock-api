package com.jock.fex.api.feign;

import com.jock.fex.api.base.BaseResp;
import com.jock.fex.util.constant.Constants;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * 支付api
 * 
 * @author ldt
 */
@FeignClient(Constants.PAYMENT_SERVICE)
@Component(value = "feignPaymentService")
public interface PaymentService {

	/**
	 * 获取支付渠道
	 * 
	 * @param params
	 *            t,s <br>
	 * @author ldt
	 */
	@GetMapping("/channels/enabled")
	public BaseResp<?> enabled(@RequestParam("req") Map<String, Object> params);

	/**
	 * 微信支付
	 * 
	 * @param params
	 *            t,s,token <br>
	 *            String orderNo 订单号 <br>
	 *            BigDecimal amount 金额 <br>
	 *            String body 标题 <br>
	 * 
	 * @author ldt
	 */
	@PostMapping("/wechat")
	BaseResp<?> wechatPay(@RequestParam("req") Map<String, Object> params);

	/**
	 * 支付宝支付
	 * 
	 * @param params
	 *            t,s,token <br>
	 *            String orderNo 订单号 <br>
	 *            BigDecimal amount 金额 <br>
	 *            String body 标题 <br>
	 * 
	 * @author ldt
	 */
	@PostMapping("/alipay")
	BaseResp<?> alipay(@RequestParam("req") Map<String, Object> params);

	/**
	 * 查询订单支付状态
	 * 
	 * @param params
	 *            t,s,accountId
	 * @param no
	 *            订单号
	 * @return true支付成功
	 * @author ldt
	 */
	@GetMapping("/transactions/{no}/pay-status")
	BaseResp<Boolean> query(@RequestParam("req") Map<String, Object> params, @PathVariable("no") String no);

	/**
	 * 退款
	 * 
	 * @param params
	 *            t,s,accountId <br>
	 *            String orderNo 订单号 <br>
	 *            BigDecimal amount 金额 <br>
	 * 
	 * @author ldt
	 */
	@PostMapping("/refund")
	BaseResp<?> refund(@RequestParam("req") Map<String, Object> params);

	/**
	 * 发红包
	 * 
	 * @param params
	 *            t,s,accountId <br>
	 *            String orderNo 订单号 <br>
	 *            BigDecimal amount 金额 <br>
	 *            String body 标题 <br>
	 * 
	 * @author ldt
	 */
	@PostMapping("/red-packet")
	BaseResp<Boolean> redPacket(@RequestParam("req") Map<String, Object> params);

}
