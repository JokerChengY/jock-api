package com.jock.fex.api.feign;

import com.jock.fex.api.base.BaseResp;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(value = "pushmgr")
@Component(value = "feignPushService")
public interface PushService {

	/**
	 * 发送验证码短信
	 * 
	 * @author zgr
	 * @param phone
	 * @param t
	 * @param s
	 * @return
	 */
	@GetMapping(value = "/app/accountMessage/sendMessage")
	public BaseResp<Object> sendMessage(@RequestParam("phone") String phone, @RequestParam("t") String t,
                                        @RequestParam("s") String s);

	/**
	 * 发送短信
	 *
	 * @param phone
	 *            手机号码
	 * @param content
	 *            短信内容
	 * @param t
	 *            t
	 * @param s
	 *            s
	 * @return
	 */
	@GetMapping(value = "/app/accountMessage/sms")
	public BaseResp<Object> sendSms(@RequestParam("phone") String phone, @RequestParam("content") String content,
                                    @RequestParam("t") String t, @RequestParam("s") String s);

	/**
	 * app推送
	 *
	 * @author zgr
	 * @param map
	 * @param t
	 * @param s
	 * @return
	 */
	@PostMapping(value = "/app/accountMessage/pushUmengAppUnicast")
	public BaseResp<Object> pushUmengAppUnicast(@RequestBody Map<String, Object> req);

	/**
	 * 微信模板推送
	 *
	 * @author zgr
	 * @param map
	 * @param t
	 * @param s
	 * @return
	 */
	@PostMapping(value = "/app/accountMessage/pushWeChat")
	public BaseResp<Object> pushWeChat(@RequestParam("req") Map<String, Object> req);

	/**
	 * 未读消息数
	 *
	 * @param token
	 * @param t
	 * @param s
	 * @return
	 */
	@GetMapping(value = "/app/accountMessage/getUnreadAmount")
	public BaseResp<Object> unReadCount(@RequestParam("token") String token, @RequestParam("t") String t,
                                        @RequestParam("s") String s);

	/**
	 * 新增消息
	 *
	 * @param message
	 * @param t
	 * @param s
	 * @return
	 */
	@PostMapping(value = "/app/accountMessage/add")
	public BaseResp<Object> addMessage(@RequestBody Map<String, Object> message, @RequestParam("t") String t,
                                       @RequestParam("s") String s);

	/**
	 * 2.0.2版本 app推送
	 *
	 * @author zgr
	 * @param map
	 * @param t
	 * @param s
	 * @return
	 */
	@PostMapping(value = "/app/accountMessage/pushUmengAppMessageUnicast")
	public BaseResp<Object> pushUmengAppMessageUnicast(@RequestParam("params") Map<String, Object> req);

	/**
	 * 2.0.2版本 未读消息数
	 *
	 * @author zgr
	 * @param token
	 * @param t
	 * @param s
	 * @return
	 */
	@GetMapping(value = "/app/accountMessage/getUnreadMessageAmount")
	public BaseResp<Object> getUnreadMessageAmount(@RequestParam("token") String token, @RequestParam("t") String t,
                                                   @RequestParam("s") String s);

	/**
	 * 2018年12月7日<br>
	 * App首页服务提醒
	 * 
	 * @param params
	 * @return "dateStr": "56天前",//消息时间<br>
	 *         "title": "测试"//消息标题
	 */
	@GetMapping(value = "/app/accountMessage/messageRemind")
	public BaseResp<Map<String, Object>> messageRemind(@RequestParam("params") Map<String, Object> params);
}
