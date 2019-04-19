package com.jock.fex.api.feign;

import com.jock.fex.api.base.BaseResp;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * 积分项目接口
 * 
 * @author 0
 *
 */
@FeignClient(value = "shopmgr")
@Component(value = "feignPshopService")
public interface PshopService {

	/**
	 * 查册下单
	 * 
	 * @param addressId
	 * @param param
	 *            t,s,token,productCode,pShopOrderSource(2),orderCode
	 * @return
	 */
	@RequestMapping(value = "/inline/pshop/order/addExpressOrderBySearch/{addressId}", method = RequestMethod.POST)
	BaseResp<Object> searchOrder(@PathVariable("addressId") Long addressId,
                                 @RequestParam("map") Map<String, Object> param);

	/**
	 * 根据产品代码查询产信息
	 *
	 * @param param
	 *            t,s,productCode
	 * @return
	 */
	@RequestMapping(value = "/inline/pShopProduct/selectProductCode", method = RequestMethod.GET)
	BaseResp<Object> selectProductCode(@RequestParam("map") Map<String, Object> param);

	/**
	 * 更新订单支付状态
	 *
	 * @param param
	 *            t s token orderCode isSuccess payMode
	 * @return
	 */
	@RequestMapping(value = "/inline/pshop/order/updateOrderPayStatus", method = RequestMethod.PUT)
	BaseResp<Object> updatePayStatus(@RequestParam("map") Map<String, Object> param);

	/**
	 * 录入物流
	 *
	 * @param param
	 *            t s token orderCode express expressCompany
	 * @return
	 */
	@RequestMapping(value = "/admin/pShop/pShopOrder/saveExpressInfo", method = RequestMethod.PUT)
	BaseResp<Object> inputLogistics(@RequestParam("map") Map<String, Object> param);

	/**
	 * 查册无果退款
	 */
	@RequestMapping(value = "/inline/pshop/order/refundSearchByExpress", method = RequestMethod.PUT)
	public BaseResp<Object> refundSearchByExpress(@RequestParam("t") String t, @RequestParam("s") String s,
                                                  @RequestParam("orderCode") String orderCode);

	/**
	 * 异步退款修改订单状态
	 */
	@RequestMapping(value = "/inline/pshop/order/updateOrderCodeStatus", method = RequestMethod.PUT)
	public BaseResp<Object> updateOrderCodeStatus(@RequestParam("orderCode") String orderCode);

	/**
	 *
	 * 查询地址ID 的地址信息
	 *
	 * @param addressId
	 * @param param
	 * @return
	 */

	@RequestMapping(value = "/app_web/v1/pshop/order/address/update/{addressId}", method = RequestMethod.GET)
	public BaseResp addressUpdate(@PathVariable("addressId") Long addressId,
                                  @RequestParam("map") Map<String, Object> param);
}
