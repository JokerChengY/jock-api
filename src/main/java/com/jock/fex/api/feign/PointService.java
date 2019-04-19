package com.jock.fex.api.feign;

import com.jock.fex.api.base.BaseResp;
import com.jock.fex.api.feign.model.AccumulatePoints;
import com.jock.fex.api.feign.model.AccumulatePointsRule;
import com.jock.fex.api.feign.model.AccumulatePointsSummary;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 积分项目接口
 * 
 * @author 0
 *
 */
@FeignClient(value = "pointmgr")
@Component(value = "feignPointService")
public interface PointService {

	/**
	 * 用户剩余积分
	 * 
	 * @param token
	 * @param t
	 * @param s
	 * @return result:剩余积分
	 */
	@Deprecated
	@RequestMapping(value = "/app/v1/aggregateScore", method = RequestMethod.GET)
	BaseResp<Object> surplusPoint(@RequestParam("token") String token, @RequestParam("t") String t,
                                  @RequestParam("s") String s);
	/**
	 * 用户剩余积分
	 * @param param
	 * 			 * @param t
	 * 			   @param s
	 * 			   @param token
	 * @return  result:剩余积分
	 */
	@RequestMapping(value = "/app/v1/aggregateScore", method = RequestMethod.GET)
	BaseResp<Object> surplusPoint(@RequestParam Map<String, Object> param);

	/**
	 * 处理返回符合条件的积分规则
	 * @param token
	 * @param t
	 * @param s
	 * @param ruleType
	 *            规则类型
	 *            0:每日签到/1:连续签到7天/2:下单/3:邀请注册认证/4:案件评价/5:阅读企业新闻奖励/6:阅读行业新闻奖励/7:查册/8:查看产品/9:积分兑换/10:送i7活动兑换扣减/11:在线评估下单;12:积分抽奖返还;13:积分抽奖扣除;14:积分抽奖分享返积分;15:积分调整;16:首次注册认证通过',
	 * @param checkNumber
	 *            如果当前操作是下单则此值checkNumber为用户下单总数量，如果当前操作是邀请注册认证则此值checkNumber为用户邀请总数量，如果当前操作是查看产品则此值checkNumber为用户查看此产品总次数
	 * @param monthUpper
	 *            用户当月积分总数
	 * @param dayUpper
	 *            用户当日积分总数
	 * @return  AccumulatePointsRule
	 */
	@Deprecated
	@RequestMapping(value = "/common/select/point/getGccumulatePointsRule", method = RequestMethod.GET)
	BaseResp<AccumulatePointsRule> getGccumulatePointsRule(@RequestParam("token") String token,
                                                           @RequestParam("t") String t, @RequestParam("s") String s, @RequestParam("ruleType") Long ruleType,
                                                           @RequestParam("checkNumber") Integer checkNumber, @RequestParam("monthUpper") Integer monthUpper,
                                                           @RequestParam("dayUpper") Integer dayUpper);

	/**
	 *
	 * @param param
	 * 			token, t ,s

	 *  ruleType
	 *            规则类型
	 *            0:每日签到/1:连续签到7天/2:下单/3:邀请注册认证/4:案件评价/5:阅读企业新闻奖励/6:阅读行业新闻奖励/7:查册/8:查看产品/9:积分兑换/10:送i7活动兑换扣减/11:在线评估下单;12:积分抽奖返还;13:积分抽奖扣除;14:积分抽奖分享返积分;15:积分调整;16:首次注册认证通过',
	 * 	checkNumber
	 *            如果当前操作是下单则此值checkNumber为用户下单总数量，如果当前操作是邀请注册认证则此值checkNumber为用户邀请总数量，如果当前操作是查看产品则此值checkNumber为用户查看此产品总次数
	 *	 monthUpper
	 *            用户当月积分总数
	 *  dayUpper
	 *            用户当日积分总数
	 * @return   AccumulatePointsRule
	 */
	@RequestMapping(value = "/common/select/point/getGccumulatePointsRule", method = RequestMethod.GET)
	BaseResp<AccumulatePointsRule> getGccumulatePointsRule(@RequestParam Map<String, Object> param);






	/**
	 * 插入积分
	 * @param token
	 * @param t
	 * @param s
	 * @param accumulatePointsRule
	 *            积分规则信息
	 * @param ruleType
	 *            规则类型  0:每日签到/1:连续签到7天/2:下单/3:邀请注册认证/4:案件评价/
	 *            5:阅读企业新闻奖励/6:阅读行业新闻奖励/7:查册/8:查看产品/9:积分兑换/
	 *            10:送i7活动兑换扣减/11:在线评估下单;12:积分抽奖返还;13:积分抽奖扣除;
	 *            14:积分抽奖分享返积分;15:积分调整;16:首次注册认证通过',
	 * @param accountId
	 *            用户主键id
	 * @param sourceId
	 *            积分来源主键id/如：查看产品的产品主键
	 * @return
	 */
	@Deprecated
	@RequestMapping(value = "/common/select/point/saveAccumulatePointsRule", method = RequestMethod.POST)
	BaseResp<Integer> saveAccumulatePointsRule(@RequestParam("token") String token, @RequestParam("t") String t,
                                               @RequestParam("s") String s, @RequestBody AccumulatePointsRule accumulatePointsRule,
                                               @RequestParam("ruleType") Long ruleType, @RequestParam("accountId") Long accountId,
                                               @RequestParam("sourceId") Long sourceId);


	/**
	 * 插入积分
	 * @param param
	 * 		token
	 * 		 t
	 * 	     s
	 * 		ruleType
	 *            规则类型  0:每日签到/1:连续签到7天/2:下单/3:邀请注册认证/4:案件评价/
	 *            5:阅读企业新闻奖励/6:阅读行业新闻奖励/7:查册/8:查看产品/9:积分兑换/
	 *            10:送i7活动兑换扣减/11:在线评估下单;12:积分抽奖返还;13:积分抽奖扣除;
	 *            14:积分抽奖分享返积分;15:积分调整;16:首次注册认证通过',
	 *            accountId
	 *            用户主键id
	 *            sourceId
	 *            积分来源主键id/如：查看产品的产品主键
	 * @param accumulatePointsRule
	 *            积分规则信息

	 * @return  Integer
	 */
	@RequestMapping(value = "/common/select/point/saveAccumulatePointsRule", method = RequestMethod.POST)
	BaseResp<Integer> saveAccumulatePointsRule(@RequestParam("param") Map<String, Object> param, @RequestBody AccumulatePointsRule accumulatePointsRule);



	/**
	 * 查看用户所有总积分
	 *
	 * @param req
	 * @param account
	 * @return
	 */
	@Deprecated
	@RequestMapping(value = "/common/select/point/selectAccumulatePointsSummary", method = RequestMethod.GET)
	BaseResp<AccumulatePointsSummary> selectAccumulatePointsSummary(@RequestParam("token") String token,
                                                                    @RequestParam("t") String t, @RequestParam("s") String s);
	/**
	 * 查看用户所有总积分
	 * @param param
	 *   token,t,s
	 * @return AccumulatePointsSummary
	 */
	@RequestMapping(value = "/common/select/point/selectAccumulatePointsSummary", method = RequestMethod.GET)
	BaseResp<AccumulatePointsSummary> selectAccumulatePointsSummary(@RequestParam("param") Map<String, Object> param);


	/**
	 * 保存用户积分详细(总用户积分表） AccumulatePointsSummary PUT
	 *
	 * @param token
	 * @param t
	 * @param s
	 * @param accumulatePointsSummary
	 *            accumulatePointsSummaryService.update(accumulatePointsSummary);
	 * @return
	 */
	@Deprecated
	@RequestMapping(value = "/common/select/point/updateAccumulatePointsSummary", method = RequestMethod.PUT)
	BaseResp<Object> updateAccumulatePointsSummary(@RequestParam("token") String token, @RequestParam("t") String t,
                                                   @RequestParam("s") String s, @RequestBody AccumulatePointsSummary accumulatePointsSummary);
	/**
	 * 保存用户积分详细(总用户积分表） AccumulatePointsSummary PUT
	 * @param param
	 *  token
	 * t
	 * s
	 * @param accumulatePointsSummary
	 *            accumulatePointsSummaryService.update(accumulatePointsSummary);
	 * @param accumulatePointsSummary
	 * @return
	 */
	@RequestMapping(value = "/common/select/point/updateAccumulatePointsSummary", method = RequestMethod.PUT)
	BaseResp<Object> updateAccumulatePointsSummary(@RequestParam("param") Map<String, Object> param, @RequestBody AccumulatePointsSummary accumulatePointsSummary);


	/**
	 *
	 * accumulatePointsService.insert(accumulatePoints); 保存用户积分详细 （用户积分 详细表)
	 * accumulatePointsService.insert(accumulatePoints);
	 */
	@Deprecated
	@RequestMapping(value = "/common/select/point/insertAccumulatePoints", method = RequestMethod.POST)
	BaseResp<Object> insertAccumulatePoints(@RequestParam("token") String token, @RequestParam("t") String t,
                                            @RequestParam("s") String s, @RequestBody AccumulatePoints accumulatePoints);
	/**
	 * accumulatePointsService.insert(accumulatePoints); 保存用户积分详细 （用户积分 详细表)
	 * @param param   token:t:s
	 * @param accumulatePoints
	 * @return
	 */
	@RequestMapping(value = "/common/select/point/insertAccumulatePoints", method = RequestMethod.POST)
	BaseResp<Object> insertAccumulatePoints(@RequestParam("param") Map<String, Object> param, @RequestBody AccumulatePoints accumulatePoints);



	/**
	 * 查看当月用户积分上限 /** paramsMap.put("accountId", 用户ID); paramsMap.put("type",积分类型);
	 *
	 * paramsMap.put("status",收入状态);
	 */
	@Deprecated
	@RequestMapping(value = "/common/select/point/selectMonthUpper", method = RequestMethod.GET)
	BaseResp<Integer> selectMonthUpper(@RequestParam("token") String token, @RequestParam("t") String t,
                                       @RequestParam("s") String s, @RequestParam Map<String, Object> paramsMap);
	/**
	 * 查看当月用户积分上限 /**
	 *
	 * @param param  token ,t ,s
	 * paramsMap.put("accountId", 用户ID);
	 * paramsMap.put("type",积分类型);
	 * paramsMap.put("status",收入状态);
	 */
	@RequestMapping(value = "/common/select/point/selectMonthUpper", method = RequestMethod.GET)
	BaseResp<Integer> selectMonthUpper(@RequestParam("paramsMap") Map<String, Object> paramsMap);

	/**
	 * 查看当日用户积分上限 /**
	 *  paramsMap.put("accountId", 用户ID);
	 *   paramsMap.put("type",积分类型);
	 *
	 * paramsMap.put("status",收入状态);
	 */
	@Deprecated
	@RequestMapping(value = "/common/select/point/selectDayUpper", method = RequestMethod.GET)
	BaseResp<Integer> selectDayUpper(@RequestParam("token") String token, @RequestParam("t") String t,
                                     @RequestParam("s") String s, @RequestParam Map<String, Object> paramsMap);
	/**
	 *
	 * @param param  token t s
	 * @param paramsMap
	 * 	 * paramsMap.put("accountId", 用户ID);
	 * paramsMap.put("type",积分类型);
	 * paramsMap.put("status",收入状态);
	 * @return
	 */
	@RequestMapping(value = "/common/select/point/selectDayUpper", method = RequestMethod.GET)
	BaseResp<Integer> selectDayUpper(@RequestParam("paramsMap") Map<String, Object> paramsMap);

	/**
	 * 日月上限，积分规则插入积分整合接口 paramsMap包含的值
	 * accountId 用户ID
	 * type 规则类型
	 * 0:每日签到/1:连续签到7天/2:下单/3:邀请注册认证/4:案件评价/5:阅读企业新闻奖励/6:阅读行业新闻奖励/7:查册/8:查看产品/9:积分兑换/10:送i7活动兑换扣减/11:在线评估下单;12:积分抽奖返还;13:积分抽奖扣除;14:积分抽奖分享返积分;15:积分调整;16:首次注册认证通过',
	 * status //积分类型 0:收入1:支出 checkNumber
	 * 如果当前操作是下单则此值checkNumber为用户下单总数量，如果当前操作是邀请注册认证则此值checkNumber为用户邀请总数量，如果当前操作是查看产品则此值checkNumber为用户查看此产品总次数
	 * sourceId 积分来源主键id/如：查看产品的产品主键
	 *
	 * accountType 用户类型
	 * 适用于 type值 为 3
	 */
	@Deprecated
	@RequestMapping(value = "/common/select/point/saveHeadAccumulatePointsRule", method = RequestMethod.POST)
	BaseResp<Integer> saveHeadAccumulatePointsRule(@RequestParam("token") String token, @RequestParam("t") String t,
                                                   @RequestParam("s") String s, @RequestParam Map<String, Object> paramsMap);


	/**
	 * @param param
	 * 				token t s
	 * 日月上限，积分规则插入积分整合接口 paramsMap包含的值
	 * accountId 用户ID
	 * type 规则类型
	 * 0:每日签到/1:连续签到7天/2:下单/3:邀请注册认证/4:案件评价/5:阅读企业新闻奖励/6:阅读行业新闻奖励/7:查册/8:查看产品/9:积分兑换/10:送i7活动兑换扣减/11:在线评估下单;12:积分抽奖返还;13:积分抽奖扣除;14:积分抽奖分享返积分;15:积分调整;16:首次注册认证通过',
	 * status //积分类型 0:收入1:支出 checkNumber
	 * 如果当前操作是下单则此值checkNumber为用户下单总数量，如果当前操作是邀请注册认证则此值checkNumber为用户邀请总数量，如果当前操作是查看产品则此值checkNumber为用户查看此产品总次数
	 * sourceId 积分来源主键id/如：查看产品的产品主键
	 *
	 * accountType 用户类型
	 * 适用于 type值 为 3
	 */
	@RequestMapping(value = "/common/select/point/saveHeadAccumulatePointsRule", method = RequestMethod.POST)
	BaseResp<Integer> saveHeadAccumulatePointsRule(@RequestParam("paramsMap") Map<String, Object> paramsMap);




	/**
	 * 单次送积分校验 此接口只适用于单次送积分 第二次不再送 日月上限，积分规则插入积分整合接口 paramsMap包含的值 accountId 用户ID
	 * type 规则类型
	 * 0:每日签到/1:连续签到7天/2:下单/3:邀请注册认证/4:案件评价/5:阅读企业新闻奖励/6:阅读行业新闻奖励/7:查册/8:查看产品/9:积分兑换/10:送i7活动兑换扣减/11:在线评估下单;12:积分抽奖返还;13:积分抽奖扣除;14:积分抽奖分享返积分;15:积分调整;16:首次注册认证通过',
	 * status //积分类型 0:收入1:支出 checkNumber
	 * 如果当前操作是下单则此值checkNumber为用户下单总数量，如果当前操作是邀请注册认证则此值checkNumber为用户邀请总数量，如果当前操作是查看产品则此值checkNumber为用户查看此产品总次数
	 * sourceId 积分来源主键id/如：查看产品的产品主键
	 *
	 * accountType 用户类型
	 * 适用于 type值 为 16
	 */
	@Deprecated
	@RequestMapping(value = "/common/select/point/saveCheckHeadAccumulatePointsRule", method = RequestMethod.POST)
	BaseResp<Integer> saveCheckHeadAccumulatePointsRule(@RequestParam("token") String token,
                                                        @RequestParam("t") String t, @RequestParam("s") String s, @RequestParam Map<String, Object> paramsMap);

	/**
	 * @param  param t s token
	 * 单次送积分校验 此接口只适用于单次送积分 第二次不再送 日月上限，积分规则插入积分整合接口 paramsMap包含的值 accountId 用户ID
	 * type 规则类型
	 * 0:每日签到/1:连续签到7天/2:下单/3:邀请注册认证/4:案件评价/5:阅读企业新闻奖励/6:阅读行业新闻奖励/7:查册/8:查看产品/9:积分兑换/10:送i7活动兑换扣减/11:在线评估下单;12:积分抽奖返还;13:积分抽奖扣除;14:积分抽奖分享返积分;15:积分调整;16:首次注册认证通过',
	 * status //积分类型 0:收入1:支出 checkNumber
	 * 如果当前操作是下单则此值checkNumber为用户下单总数量，如果当前操作是邀请注册认证则此值checkNumber为用户邀请总数量，如果当前操作是查看产品则此值checkNumber为用户查看此产品总次数
	 * sourceId 积分来源主键id/如：查看产品的产品主键
	 *
	 * accountType 用户类型
	 * 适用于 type值 为 16
	 */
	@RequestMapping(value = "/common/select/point/saveCheckHeadAccumulatePointsRule", method = RequestMethod.POST)
	BaseResp<Integer> saveCheckHeadAccumulatePointsRule(@RequestParam("paramsMap") Map<String, Object> paramsMap);



	/**
	 * 查册退积分 accountId 需要退款用户的ID totalPoint 退款积分
	 */
	@Deprecated
	@RequestMapping(value = "/inline/sendBackPointForSearch", method = RequestMethod.PUT)
	BaseResp<Integer> sendBackPointForSearch(@RequestParam("t") String t, @RequestParam("s") String s,
                                             @RequestParam("accountId") Long accountId, @RequestParam("totalPoint") Integer totalPoint,
                                             @RequestParam("sourceName") String sourceName);
	/**
	 * 退积分   t s
	 *  accountId 需要退款用户的ID totalPoint 退款积分 sourceName 退款名称
	 */
	@RequestMapping(value = "/inline/sendBackPointForSearch", method = RequestMethod.PUT)
	BaseResp<Integer> sendBackPointForSearch(@RequestParam("param") Map<String, Object> param);
	/**
	 * 单个商品扣除积分
	 *
	 * @param token
	 * @param t
	 * @param s
	 * @param sourceName
	 *            产品名
	 * @param totalPoint
	 *            积分数
	 * @return
	 */
	@Deprecated
	@RequestMapping(value = "/app/v1/deductPoint", method = RequestMethod.POST)
	BaseResp deductPoint(@RequestParam("token") String token, @RequestParam("t") String t, @RequestParam("s") String s,
                         @RequestParam("sourceName") String sourceName, @RequestParam("totalPoint") Integer totalPoint);
	/**
	 * 单个商品扣除积分
	 *
	 * @param token
	 * @param t
	 * @param s
	 * @param sourceName
	 *            产品名
	 * @param totalPoint
	 *            积分数
	 * @return
	 */
	@RequestMapping(value = "/app/v1/deductPoint", method = RequestMethod.POST)
	BaseResp deductPoint(@RequestParam("param") Map<String, Object> param);


	/**
	 * 查册扣除积分
	 *
	 * @param req
	 * @param account
	 *            用户信息
	 * @param sourceId
	 *            产品名称
	 * @param totalPoint
	 *            积分
	 * @param sourceId
	 *            产品名称2
	 * @param totalPoint
	 *            产品名称积分2
	 * @return
	 */
	@Deprecated
	@RequestMapping(value = "/app/v1/deductSearchPoint", method = RequestMethod.POST)
	BaseResp deductSearchPoint(@RequestParam("token") String token, @RequestParam("t") String t,
                               @RequestParam("s") String s, @RequestParam("sourceName") String sourceName,
                               @RequestParam("totalPoint") Integer totalPoint, @RequestParam("sourceName2") String sourceName2,
                               @RequestParam("totalPoint2") Integer totalPoint2);
	/**
	 * 查册扣除积分
	 *
	 * @param req
	 * @param account
	 *            用户信息
	 * @param sourceId
	 *            产品名称
	 * @param totalPoint
	 *            积分
	 * @param sourceId
	 *            产品名称2
	 * @param totalPoint
	 *            产品名称积分2
	 * @return
	 */

	@RequestMapping(value = "/app/v1/deductSearchPoint", method = RequestMethod.POST)
	BaseResp deductSearchPoint(@RequestParam("param") Map<String, Object> param);





	/**
	 * 根据类型查询积分规则
	 *
	 * @author zgr
	 * @param req
	 * @param resp
	 * @param types
	 * @return
	 */
	@Deprecated
	@GetMapping(value = "/inline/getAccumulatePointsRuleByTypes")
	public BaseResp<List<AccumulatePointsRule>> getAccumulatePointsRuleByTypes(@RequestParam("types") String types,
                                                                               @RequestParam("t") String t, @RequestParam("s") String s);
	/**
	 * 根据类型查询积分规则
	 * @param param  types  , t ,s
	 * @return
	 */
	@GetMapping(value = "/inline/getAccumulatePointsRuleByTypes")
	public BaseResp<List<AccumulatePointsRule>> getAccumulatePointsRuleByTypes(@RequestParam("param") Map<String, Object> param);


	/**
	 *
	 * 根据积分类型，查询用户获取的积分
	 * @author zgr
	 * @param accoutnId
	 * @param types
	 * @param t
	 * @param s
	 * @return
	 */
	@Deprecated
	@GetMapping(value = "/inline/public/getAccountAccumulatePointsByTypes")
	public BaseResp<List<AccumulatePoints>> getAccountAccumulatePointsByTypes(@RequestParam("accountId") Long accoutnId,
                                                                              @RequestParam("types") String types, @RequestParam("t") String t, @RequestParam("s") String s);
	/**
	 * 根据积分类型，查询用户获取的积分
	 * @param param
	 * 				 * 	@param accoutnId
	 *					 @param types
	 * 					@param t
	 *					 @param s
	 * 					@return
	 */
	@GetMapping(value = "/inline/public/getAccountAccumulatePointsByTypes")
	public BaseResp<List<AccumulatePoints>> getAccountAccumulatePointsByTypes(@RequestParam("param") Map<String, Object> param);
	/**
	 * 查询邀请注册成功赠送积分和认证完成赠送积分规则 2.0.3版本
	 *
	 * @author zgr
	 * @param req
	 * 	private Long accountId;
		private Long type;
		private Long status;
		private Integer checkNumber;
		private Long sourceId;
		private Long accountType;
		private Long referrerId;//一级推荐人
	 * @param t
	 * @param s
	 * @return
	 */
	@PostMapping(value = "/inline/authGivePointByTime")
	public BaseResp authGivePointByTime(@RequestParam Map<String, Object> params, @RequestParam("t") String t,
                                        @RequestParam("s") String s);

	/**
	 * 查询积分规则区间值 type 积分类型
	 */
	@Deprecated
	@GetMapping(value = "/common/select/point/public/selectAccumulatePointsRuleByTypes")
	public BaseResp selectAccumulatePointsRuleByTypes(@RequestParam("type") Integer type, @RequestParam("t") String t,
                                                      @RequestParam("s") String s);

	/**
	 * 查询积分规则区间值 type 积分类型
	 * @param params type积分类型 t s
	 * @return  list（ {
            "pointsCount1": 10,  //中介用户的积分
            "pointsCount2": 3,	   //普通用户的积分
            "startApplyLimit": 1,	//开始区间
            "endApplyLimit": 3	    //结束区间
        },
		）
	 */
	@GetMapping(value = "/common/select/point/public/selectAccumulatePointsRuleByTypes")
	public BaseResp selectAccumulatePointsRuleByTypes(@RequestParam Map<String, Object> params);

}
