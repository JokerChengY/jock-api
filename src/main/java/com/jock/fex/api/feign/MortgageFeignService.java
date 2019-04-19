package com.jock.fex.api.feign;

import com.jock.fex.api.base.BaseResp;
import com.jock.fex.api.base.PageBean;
import com.jock.fex.api.feign.dto.*;
import com.jock.fex.api.feign.model.Customer;
import com.jock.fex.api.feign.model.ServiceProduct;
import com.jock.fex.api.feign.model.ext.DataDictionaryExt;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@FeignClient("mortgagemgr")
@Component("mortgageFeignService")
public interface MortgageFeignService {
	/**
	 * 查询反馈列表
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/feedback",method = RequestMethod.GET)
	public BaseResp<PageBean<FeedbackDTO>> getFeedBackInfoList(@RequestParam Map<String, Object> map);
	/**
	 * 新增反馈信息
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/feedback",method = RequestMethod.POST)
	public BaseResp<Long> feedBackInfoAdd(@RequestParam Map<String, Object> map);
	/**
	 * 查询中介机构列表
	 * @param token
	 * @param t
	 * @param s
	 * @return
	 */
	@RequestMapping(value = "/mediatorOrg",method = RequestMethod.GET)
	public BaseResp<PageBean<MediatorOrganizationDTO>> getMediatorOrgList(@RequestParam("token") String token, @RequestParam("t") String t, @RequestParam("s") String s);
	/**
	 * 查询担保机构列表
	 * @param token
	 * @param t
	 * @param s
	 * @return
	 */
	@RequestMapping(value = "/guaranteeOrg",method = RequestMethod.GET)
	public BaseResp<PageBean<GuaranteeOrganizationDTO>> getGuaranteeOrgList(@RequestParam("token") String token, @RequestParam("t") String t, @RequestParam("s") String s);
	/**
	 * 查询评估机构列表
	 * @param token
	 * @param t
	 * @param s
	 * @return
	 */
	@RequestMapping(value = "/evaluateOrg",method = RequestMethod.GET)
	public BaseResp<PageBean<EvaluateOrganizationDTO>> getAppraiserOrgList(@RequestParam("token") String token, @RequestParam("t") String t, @RequestParam("s") String s);
	/**
	 * 查询物业区域列表
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/propertyArea",method = RequestMethod.GET)
	public BaseResp<PageBean<PropertyAreaDTO>> getPropertyAreaList(@RequestParam Map<String, Object> map);
	/**
	 * 查询公司列表
	 * @param token
	 * @param t
	 * @param s
	 * @return
	 */
	@RequestMapping(value = "/company",method = RequestMethod.GET)
	public BaseResp<PageBean<CompanyDTO>> getDepartmentList(@RequestParam("token") String token, @RequestParam("t") String t, @RequestParam("s") String s);
	/**
	 * 查询数据字段列表
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/dataDictionary/listByType",method = RequestMethod.GET)
	public BaseResp<Map<String, List<DataDictionaryExt>>> getDictionary(@RequestParam Map<String, Object> map);
	/**
	 * 保存客户资料
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/customer",method = RequestMethod.POST)
	public BaseResp<Long> saveCustmer(@RequestParam Map<String, Object> map);
	/**
	 * 更新客户资料
	 * @param customerId
	 * @param parm
	 * @return
	 */
	@RequestMapping(value = "/customer/{customerId}",method = RequestMethod.PUT)
	public BaseResp<Long> updateCustmer(@PathVariable("customerId") Long customerId, @RequestParam Map<String, Object> parm);
	/**
	 * 查询客户资料详情
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/customer/detail",method = RequestMethod.GET)
	public BaseResp<Customer> seachCustmerDetail(@RequestParam Map<String, Object> map);
	/**
	 * 查询交易明细列表
	 * @param idCard
	 * @param token
	 * @param t
	 * @param s
	 * @return
	 */
	@RequestMapping(value = "/productData/deal",method = RequestMethod.GET)
	public BaseResp<List<ProductDataCustomerDTO>> queryDealList(@RequestParam("idCard") String idCard, @RequestParam("token") String token, @RequestParam("t") String t, @RequestParam("s") String s);
	/**
	 * 查询业务类型详情
	 * @param serviceProductId
	 * @param token
	 * @param t
	 * @param s
	 * @return
	 */
	@RequestMapping(value = "/serviceProduct/numRule/{serviceProductId}",method = RequestMethod.GET)
	public BaseResp<ServiceProduct> getServiceProductById(@RequestParam("serviceProductId") Long serviceProductId, @RequestParam("token") String token, @RequestParam("t") String t, @RequestParam("s") String s);
	/**
	 * 查询公司详情
	 * @param companyId
	 * @param token
	 * @param t
	 * @param s
	 * @return
	 */
	@RequestMapping(value = "/company/{companyId}",method = RequestMethod.GET)
	public BaseResp<CompanyDTO> getDepartment(@RequestParam("companyId") Long companyId, @RequestParam("token") String token, @RequestParam("t") String t, @RequestParam("s") String s);
	/**
	 * 根据accountId查询员工详情
	 */
	@RequestMapping(value = "/employee/get",method = RequestMethod.GET)
	public BaseResp<EmployeeDTO> getEmployeeByAccountId(@RequestParam("accountId") Long accountId, @RequestParam("t") String t, @RequestParam("s") String s);
	/**
	 * 查询员工列表
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/employee",method = RequestMethod.GET)
	public BaseResp<PageBean<EmployeeDTO>> findEmployeeList(@RequestParam Map<String, Object> map);

}
