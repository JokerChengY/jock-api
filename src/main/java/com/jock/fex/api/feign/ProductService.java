package com.jock.fex.api.feign;

import com.jock.fex.api.base.BaseResp;
import com.jock.fex.api.feign.model.vo.AppOrderLastNews;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@FeignClient(value = "productmgr")
@Component(value = "feignProductService")
public interface ProductService {

	/**
	 * 根据ID获取名称
	 *
	 * @param map
	 *            t=t&s=s&ids=[]
	 * @return "name": "按揭贷款",<br>
	 *         "id": 1,<br>
	 *         "parentId": null
	 */
	@GetMapping(value = "/products/names")
	BaseResp<List<Map<String, Object>>> productByIds(@RequestParam("req") Map<String, Object> map);

	/**
	 * 根据地区id获取产品id
	 *
	 * @param map
	 * @param areaId
	 * @author ldt
	 */
	@GetMapping(value = "/areas/{id}/products")
	BaseResp<List<Long>> getProductIds(@RequestParam("req") Map<String, Object> map, @PathVariable("id") Long areaId);

	/**
	 * 获取启用的产品
	 *
	 * @param params
	 * @author ldt
	 */
	@GetMapping(value = "/products/enabled")
	BaseResp<?> getEnabled(@RequestParam("req") Map<String, Object> params);

	/**
	 * 查询经纪人所有能接单的产品名称
	 *
	 * @param mortgageId
	 * @param t
	 * @param s
	 * @return
	 * @author zgr
	 */
	@GetMapping(value = "/inline/products/getProductNameByMortgageId")
	BaseResp<?> getProductNameByMortgageId(@RequestParam("mortgageId") Integer mortgageId, @RequestParam("t") String t,
                                           @RequestParam("s") String s);

	/**
	 * 首页显示产品
	 *
	 * @param param
	 *            t、s、v、cityId
	 * @return
	 * @author zgr
	 */
	@GetMapping(value = "/inline/products/getProductByHomePage")
	BaseResp<?> getProductByHomePage(@RequestParam("req") Map<String, Object> param);

	/**
	 * 城市id为空就根据id，查询产品名称和id 否则查询所有正常的产品
	 *
	 * @param areaId
	 * @param t
	 * @param s
	 * @return
	 */
	@GetMapping(value = "/inline/products/productNotEmptyCityId")
	BaseResp<?> getProductNotEmptyCityId(@RequestParam("req") Map<String, Object> map);

	/**
	 * 1.14 根据id查询产品 (2.0.3版本) 20181008新增
	 * 
	 * @param map
	 * @return { "v": "V1.0.0", "code": 200, "message": "操作成功", "result": [ { "id":
	 *         84,//产品id "productName": "小类第五个产品6666666",//产品名称 "salesImage":
	 *         "/image/2018/04/02/bbveol1rxj7lz2p5shh9.png",//营销图片 "icon":
	 *         "/image/2018/04/02/bbveol1rxj7lz2p5shh9.png",//产品图标 "parentId":
	 *         76,//大类id "sort": 6,//排序 "url": "https://www.baidu.com/",//url
	 *         "pageStyle": 1,//样式0：其他样式1：产品样式 "status": 1,//状态 0正常 1停用 2删除
	 *         "accountType": "0,1,2,3,4,5",//下单用户类型 "advantage":
	 *         "的确有钱",//产品卖点jumpUrl "jumpUrl": "",//客户连接 "minQuota": "",//借款最低额度
	 *         "maxQuota": "",//借款最高额度 "minTerm": "",//借款最低期限 "maxTerm": "",//借款最高期限
	 *         "minRate": "",//借款费率最低%月 "quotaTerm": "",//贷款期限 1:年 2:个月
	 *         "detailStyle": "",//详情样式 1：标准详情 2：i有车 "areaList": [//所属城市列表 {
	 *         "areaId": "440100,440200",//城市id json字符串 "typeId": 100000//小类id }, {
	 *         "areaId": "440300,440400,440500", "typeId": 100001, "typeList":
	 *         [//小类列表 { "typeName": "测试小类7",//小类名称 "id": 100010//小类id }, {
	 *         "typeName": "测试小类123改为456", "id": 100013 } ] } ], "homePageCityId":
	 *         "440100,440300",//首页显示城市 "hotrecommendCityId":
	 *         "400100,440300",//热门推荐城市
	 *         <p>
	 *         2.0.4版本新加 "mortgageProductId": "400100",//业务系统产品id "quotaTerm":
	 *         "1",//贷款期限 1:年 2:个月 "mortgageProductName": "400100",//业务系统产品名称
	 *         "businessType": "1",//详情样式 1：标准详情 2：i有车 "organizationList":
	 *         [{//城市机构集合 "organizationId":
	 *         "2510000002270073,2510000002270081",//机构id "cityId": 440100//城市id },
	 *         { "organizationId": "2510000002270073,2510000002270081", "cityId":
	 *         440500 }], "attrVo": [{ "prouductId": 1, "attributeType": 1,
	 *         "attributeValue": "产品可能很好玩" }, { "prouductId": 1, "attributeType": 2,
	 *         "elementType": 1, "attributeValue": "首套基准率8.5折" }, { "prouductId": 1,
	 *         "attributeType": 2, "elementType": 2, "attributeValue": "最长30年" }, {
	 *         "prouductId": 1, "attributeType": 3, "attributeValue": "资料1内容" }, {
	 *         "prouductId": 1, "attributeType": 3, "attributeValue": "资料2内容" }, {
	 *         "prouductId": 1, "attributeType": 4, "elementType": 1,
	 *         "processImage": "/image/2018/01/02/bbmzuj90dwy0zzswaaws.png",
	 *         "attributeValue": "提交申请" }, { "prouductId": 1, "attributeType": 4,
	 *         "elementType": 2, "processImage":
	 *         "/image/2018/01/02/bbmzuj90dwy0zzswaaws.png", "attributeValue": "审批"
	 *         }], "handler": {} } ], "params": {} }
	 */
	@GetMapping(value = "/admin/products/getProductById")
	BaseResp<?> getProductById(@RequestParam("req") Map<String, Object> map);

	/**
	 * 2019年1月16日<br>
	 * App我的产品订单客户订单最新消息提示
	 * 
	 * @param map
	 *            t、s、accountId、accountType
	 * @return
	 */
	@GetMapping(value = "/order/change/news/tip")
	BaseResp<AppOrderLastNews> meOrderTip(@RequestParam("req") Map<String, Object> map);
}
