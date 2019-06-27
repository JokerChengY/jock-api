package com.jock.fex.api.feign;

import com.jock.fex.api.base.BaseResp;
import com.jock.fex.api.base.PageBean;
import com.jock.fex.api.feign.model.Role;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 用户项目接口
 * 
 * @author 0
 *
 */
@FeignClient(value = "usermgr")
@Component(value = "feignAccountService")
public interface AccountService {
//
//	/**
//	 * 获取当前登录人
//	 *
//	 * @param token
//	 * @param t
//	 * @param s
//	 * @return
//	 */
//	@RequestMapping(value = "/token", method = RequestMethod.GET)
//	BaseResp<LoginAccount> currentAccount(@RequestParam("token") String token, @RequestParam("t") String t,
//                                          @RequestParam("s") String s);
//
//	/**
//	 * 校验是否VIP用户
//	 *
//	 * @param token
//	 * @param t
//	 * @param s
//	 * @return
//	 */
//	@RequestMapping(value = "/vip/{accountId}", method = RequestMethod.GET)
//	BaseResp<Object> isVip(@PathVariable("accountId") Long accountId, @RequestParam("t") String t,
//                           @RequestParam("s") String s);
//
//	/**
//	 * 校验手机号码、用户名、邮箱是否存在
//	 *
//	 * @param token
//	 * @param t
//	 * @param s
//	 * @return
//	 */
//	@RequestMapping(value = "/exist", method = RequestMethod.POST)
//	BaseResp<Object> exist(@RequestParam("loginUser") String loginUser, @RequestParam("t") String t,
//                           @RequestParam("s") String s);
//
//	/**
//	 * 查询用户详情
//	 *
//	 * @param accountId
//	 *            用户id
//	 * @param t
//	 * @param s
//	 * @return
//	 */
//	@RequestMapping(value = "/account/{accountId}", method = RequestMethod.GET)
//	BaseResp<AccountDTO> selectAccount(@PathVariable("accountId") Long accountId, @RequestParam("t") String t,
//                                       @RequestParam("s") String s);
//
//	/**
//	 * 注册用户
//	 *
//	 * @param map
//	 * @return
//	 */
//	@SuppressWarnings("rawtypes")
//	@RequestMapping(value = "/register", method = RequestMethod.POST)
//	BaseResp<Long> registerAccount(@RequestParam Map map);
//
//	/**
//	 * 修改用户
//	 *
//	 * @param map
//	 * @return
//	 */
//	@SuppressWarnings("rawtypes")
//	@RequestMapping(value = "/update", method = RequestMethod.PUT)
//	BaseResp<Long> updateAccount(@RequestParam Map map);
//
//	/**
//	 * 账号密码登录
//	 *
//	 * @param map
//	 * @return
//	 */
//	@RequestMapping(value = "/login", method = RequestMethod.POST)
//	public BaseResp<LoginAccount> login(@RequestParam Map<String, Object> map);
//
//	/**
//	 * 注销登录
//	 *
//	 * @param map
//	 * @return
//	 */
//	@RequestMapping(value = "/loginOut", method = RequestMethod.POST)
//	public BaseResp<LoginAccount> loginOut(@RequestParam Map<String, Object> map);
//
//	/**
//	 * openId自动登录
//	 *
//	 * @param map
//	 *            openId,t,s
//	 * @return
//	 */
//	@RequestMapping(value = "/wx/auto/login", method = RequestMethod.POST)
//	public BaseResp<LoginAccount> wxAutoLogin(@RequestParam Map<String, Object> map);
//
//	/**
//	 * 查询指定角色下的所有用户
//	 *
//	 * @param map
//	 * @see com.jock.fex.api.feign.param.RoleAccountFindReq.java
//	 * @return
//	 */
//	@RequestMapping(value = "/role/{roleId}/account", method = RequestMethod.GET)
//	public BaseResp<PageBean<AccountDTO>> findRoleAccount(@PathVariable("roleId") Long roleId,
//                                                          @RequestParam Map<String, Object> map);
//
//	/**
//	 * 查询指定账号的角色列表
//	 *
//	 * @param accountId
//	 * @param t
//	 * @param s
//	 * @return
//	 */
//	@RequestMapping(value = "/account/{accountId}/role", method = RequestMethod.GET)
//	public BaseResp<List<AccountRoleDTO>> findAccountRole(@PathVariable("accountId") Long accountId,
//                                                          @RequestParam("t") String t, @RequestParam("s") String s);
//
//	/**
//	 * 查询指定角色id的角色信息
//	 *
//	 * @param roleId
//	 * @param t
//	 * @param s
//	 * @return
//	 */
//	@RequestMapping(value = "/role/{roleId}", method = RequestMethod.GET)
//	public BaseResp<Role> getRole(@PathVariable("roleId") Long roleId, @RequestParam("t") String t,
//                                  @RequestParam("s") String s);
//
//	/**
//	 * 查询角色列表
//	 *
//	 * @param t
//	 * @param s
//	 * @param page
//	 * @param rows
//	 * @param systemInfoId
//	 * @return
//	 */
//	@RequestMapping(value = "/role", method = RequestMethod.GET)
//	public BaseResp<PageBean<Role>> getRoleList(@RequestParam("t") String t, @RequestParam("s") String s,
//                                                @RequestParam("page") Integer page, @RequestParam("rows") Integer rows,
//                                                @RequestParam("systemInfoId") Long systemInfoId);
//
//	/**
//	 * 根据用户ID查询用户地区
//	 *
//	 * @param t
//	 * @param s
//	 * @param accountId
//	 * @return
//	 */
//	@RequestMapping(value = "/account/area/{accountId}", method = RequestMethod.GET)
//	public BaseResp<List<Long>> areaList(@RequestParam("t") String t, @RequestParam("s") String s,
//                                         @PathVariable("accountId") Long accountId);
//
//	/**
//	 * 检测用户是否已认证
//	 *
//	 * @param accountId
//	 * @param t
//	 * @param s
//	 * @return
//	 */
//	@RequestMapping(value = "/mediatorInfo/auth/{accountId}", method = RequestMethod.GET)
//	public BaseResp<Object> isMediator(@PathVariable("accountId") Long accountId, @RequestParam("t") String t,
//                                       @RequestParam("s") String s);
//
//	/**
//	 * 获取用户中介信息
//	 *
//	 * @param accountId
//	 *            账号id
//	 * @param t
//	 *            t
//	 * @param s
//	 *            s
//	 * @return
//	 */
//	@RequestMapping(value = "/mediatorInfo/{accountId}", method = RequestMethod.GET)
//	public BaseResp<Object> selectMediatorInfo(@PathVariable("accountId") Long accountId, @RequestParam("t") String t,
//                                               @RequestParam("s") String s);
//
//	/**
//	 * 获取按揭员的信息
//	 *
//	 * @param accountId
//	 * @param t
//	 * @param s
//	 * @return
//	 */
//	@GetMapping("/mortgageInfo/{accountId}")
//	BaseResp<Map<String, Object>> getMortgageInfo(@PathVariable("accountId") Long accountId,
//                                                  @RequestParam("t") String t, @RequestParam("s") String s);
//
//	/**
//	 * 获取子机构id
//	 *
//	 * @param id
//	 * @param t
//	 * @param s
//	 * @return
//	 */
//	@GetMapping("/mortgageOrg/{id}/children/ids")
//	BaseResp<String> getChildrenOrgIds(@PathVariable("id") Long id, @RequestParam("t") String t,
//                                       @RequestParam("s") String s);
//
//	/**
//	 * 获取用户公司部门
//	 *
//	 * @param accountId
//	 *            账号id
//	 * @param t
//	 *            t
//	 * @param s
//	 *            s
//	 * @return
//	 */
//	@RequestMapping(value = "/user/department/{accountId}", method = RequestMethod.GET)
//	public BaseResp<Object> selectCompanyDepartment(@PathVariable("accountId") Long accountId,
//                                                    @RequestParam("t") String t, @RequestParam("s") String s);
//
//	/**
//	 * 根据用户类型查询用户
//	 *
//	 * @param accountType
//	 *            用户类型：0,1,2,3,4
//	 * @param t
//	 * @param s
//	 * @return
//	 */
//	@RequestMapping(value = "/account/find/type", method = RequestMethod.GET)
//	public BaseResp<Object> findByAccountType(@RequestParam("accountType") String accountType,
//                                              @RequestParam("t") String t, @RequestParam("s") String s);
//
//	/**
//	 * 根据手机号查询用户
//	 *
//	 * @author zgr
//	 * @param phone
//	 * @param t
//	 * @param s
//	 * @return
//	 */
//	@RequestMapping(value = "/account/find/phone", method = RequestMethod.GET)
//	public BaseResp<AccountDTO> selectByPhone(@RequestParam("phone") String phone, @RequestParam("t") String t,
//                                              @RequestParam("s") String s);
//
//	/**
//	 * VIP详情
//	 *
//	 * @param param
//	 *            t、s、accountId
//	 * @return <br>
//	 *         "accountId": 18039, //用户id <br>
//	 *         "accountPhone": "13076763598", //用户手机号码 <br>
//	 *         "accountType": 4, //用户类型 <br>
//	 *         "endTime": 1501776000000, //结束时间 <br>
//	 *         "startTime": 1501171200000, //开始时间 <br>
//	 *         "vip": false //是否VIP，false-VIP已过期 <br>
//	 *         "expressType":0 //0-在线支付，1-到付，2-预付
//	 */
//	@RequestMapping(value = "/vip/detail", method = RequestMethod.GET)
//	public BaseResp<Map<String, Object>> vipDetail(@RequestParam Map<String, Object> param);
//
//	/**
//	 * 获取多个用户
//	 *
//	 * @param param
//	 *            t、s、accountIds
//	 * @return <br>
//	 *         "accountId": 1, // 用户id <br>
//	 *         "accountName": "admin", //用户账号 <br>
//	 *         "phone": "13527167721", //手机号码 <br>
//	 *         "realName": "管理员", //用户姓名 <br>
//	 *         "regWay": 10, //注册来源 <br>
//	 *         "type": 0 // 用户类型
//	 */
//	@RequestMapping(value = "/account/by/ids", method = RequestMethod.GET)
//	public BaseResp<Map<Long, Map<String, Object>>> getAccountByIds(@RequestParam Map<String, Object> param);
//
//	/**
//	 * 获取多个用户<br>
//	 * 查册导出用
//	 *
//	 * @param param
//	 *            t、s、accountIds
//	 * @return
//	 */
//	@RequestMapping(value = "/account/by/ids/search", method = RequestMethod.GET)
//	public BaseResp<Map<Long, Map<String, Object>>> getAccountByIdsSearch(@RequestParam Map<String, Object> param);
//
//	/**
//	 * 获取登录信息
//	 *
//	 * @param param
//	 *            t、s、token
//	 * @return
//	 */
//	@RequestMapping(value = "/log/select/token", method = RequestMethod.GET)
//	public BaseResp<Map<String, Object>> selectLoginLog(@RequestParam Map<String, Object> param);
//
//	/**
//	 * 获取用户信息
//	 *
//	 * @param param
//	 * @return
//	 */
//	@RequestMapping(value = "/account/select/info", method = RequestMethod.GET)
//	public BaseResp<Map<String, Object>> selectAccountInfo(@RequestParam Map<String, Object> param);
//
//	/**
//	 * 获取多个VIP
//	 *
//	 * @param param
//	 *            t、s、accountIds
//	 * @return
//	 */
//	@RequestMapping(value = "/vip/select/ids", method = RequestMethod.GET)
//	public BaseResp<Map<Long, Map<String, Object>>> getVipByIds(@RequestParam Map<String, Object> param);
//
//	/**
//	 * 获取查册查询条件
//	 *
//	 * @param param
//	 *            t、s
//	 * @return
//	 */
//	@RequestMapping(value = "/vip/search/condition", method = RequestMethod.GET)
//	public BaseResp<List<Map<String, Object>>> searchCondition(@RequestParam Map<String, Object> param);
//
//	/**
//	 * 查看金融经济人信息
//	 */
//	@RequestMapping(value = "/mortgageInfo/app/list/push", method = RequestMethod.GET)
//	public BaseResp<Object> appListPush(@RequestParam Map<String, Object> param);
//
//	/**
//	 * 2018年9月11日<br>
//	 * 多条件模糊查询获取用户account_id
//	 *
//	 * @param param<br>
//	 *            t<br>
//	 *            s<br>
//	 *            phone<br>
//	 *            accountName<br>
//	 *            realName<br>
//	 * @return<br>
//	 * 			16506,18529,20115
//	 */
//	@GetMapping("/account/select/accountIds")
//	public BaseResp<Object> selectAccountIds(@RequestParam Map<String, Object> param);
//
//	/**
//	 * 获取多个用户
//	 *
//	 * @param param
//	 *            t、s、phones
//	 * @return
//	 */
//	@RequestMapping(value = "/account/by/phones", method = RequestMethod.GET)
//	public BaseResp<Map<String, Map<String, Object>>> getAccountByPhones(@RequestParam Map<String, Object> param);
//
//	/**
//	 * 2018年9月7日<br>
//	 * 获取用户基本信息
//	 *
//	 * @param param
//	 *            t、s、accountId
//	 * @return "accountId": 19825, <br>
//	 *         "accountType": 0,//用户类型 <br>
//	 *         "branch": "",//中介分店 <br>
//	 *         "business": "", <br>
//	 *         "cityId": 440100, <br>
//	 *         "cityName": "",//注册城市 <br>
//	 *         "companyName": "",//按揭公司名称 <br>
//	 *         "icon": "/image/2018/01/20/zu9nazmrebmwqlfkyt0c.png", <br>
//	 *         "organizationName": "",//中介机构名称 <br>
//	 *         "phone": "15815840420", <br>
//	 *         "qrCode": "", <br>
//	 *         "realName": "良策小白龙", <br>
//	 *         "sex": "", <br>
//	 *         "teamName": ""//按揭团队名称
//	 */
//	@RequestMapping(value = "/account/public/select/share", method = RequestMethod.GET)
//	public BaseResp<Map<String, Object>> getAccountShareInfo(@RequestParam Map<String, Object> param);
//
//	/**
//	 * 2018年9月13日<br>
//	 * 系统自动注册
//	 *
//	 * @param param
//	 *            t、 s、 phone、 realName、 cityId、 regWay
//	 * @return <br>
//	 *         "accountId": 20137,<br>
//	 *         "phone": "",<br>
//	 *         "realName": ""<br>
//	 */
//	@RequestMapping(value = "/inside/register", method = RequestMethod.POST)
//	public BaseResp<List<Map<String, Object>>> insideRegister(@RequestParam Map<String, Object> param);
//
//	/**
//	 * 2018年9月13日<br>
//	 *
//	 * @param param
//	 *            t、s、accountIds
//	 * @return <br>
//	 *         "accountId": 20087,<br>
//	 *         "accountType": 5,<br>
//	 *         "accountTypeText": "合伙人",<br>
//	 *         "business": "按揭贷款,纯抵押贷款,商业贷款,组合贷款",<br>
//	 *         "companyName": "按揭公司",<br>
//	 *         "grade": "",<br>
//	 *         "phone": "13527167744",<br>
//	 *         "realName": "朱懋鲜",<br>
//	 *         "teamName": "红日区"<br>
//	 */
//	@RequestMapping(value = "/mortgageInfo/info/order", method = RequestMethod.GET)
//	public BaseResp<List<Map<String, Object>>> getMortgageInfo(@RequestParam Map<String, Object> param);
}
