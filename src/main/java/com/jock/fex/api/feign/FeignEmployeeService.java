package com.jock.fex.api.feign;

import com.jock.fex.api.base.BaseResp;
import com.jock.fex.api.base.PageBean;
import com.jock.fex.api.feign.model.Employee;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * 员工项目接口
 * 
 * @author huasi_lin
 *
 */
@FeignClient(value = "employeemgr")
@Component
public interface FeignEmployeeService {

	/**
	 * 查询员工列表
	 * 
	 * @Title: findEmployeeList
	 * @param EmployeeFindReq -->> map
	 * @return BaseResp<List<Employee>>
	 * @author:huasi_lin
	 */
	@RequestMapping(value = "/employee/list", method = RequestMethod.GET)
	public BaseResp<PageBean<Employee>> findEmployeeList(@RequestParam Map<String, Object> map);


	/**
	 * 统计部门人数
	 * @param token
	 * @param t
	 * @param s
	 * @param companyId
	 * @param deptCode
	 * @param souWay员工来源 3按揭 4中介
	 * @return
	 */
	 
	@RequestMapping(value = "/employee/findNumByDept",method = RequestMethod.GET)
	public BaseResp<Integer> findEmpNumByDept(@RequestParam("t") String t,
                                              @RequestParam("s") String s, @RequestParam("companyId") Long companyId, String souWay);
	/**
	 * 查询最大员工编号
	 * @param token
	 * @param t
	 * @param s
	 * @param companyId
	 * @return
	 */

	@RequestMapping(value = "/employee/findMaxCodebyCompanyId",method = RequestMethod.GET)
	public BaseResp<String> findMaxCodebyCompanyId(@RequestParam("t") String t,
                                                   @RequestParam("s") String s, @RequestParam("companyId") Long companyId);

	/**
	 * 新增员工信息
	 * @param employee
	 * @return
	 */
	@RequestMapping(value = "/employee/add",method = RequestMethod.POST)
	public BaseResp<Long> insertEmployee(@RequestBody Employee employee);

	/**
	 * 更新员工信息
	 * @param employee
	 * @return
	 */
	@RequestMapping(value = "/employee/update",method = RequestMethod.PUT)
	public BaseResp<Long> updateEmployee(@RequestBody Employee employee);


	/**
	 * 查看员工信息
	 * @param token
	 * @param t
	 * @param s
	 * @param accountId
	 * @param souWay员工来源 3按揭 4中介
	 * @return
	 */
	@RequestMapping(value = "/employee/get",method = RequestMethod.GET)
	public BaseResp<Employee> getEmployee(@RequestParam("employeeId") Long employeeId, @RequestParam("accountId") Long accountId, @RequestParam("t") String t,
                                          @RequestParam("s") String s, @RequestParam("souWay") String souWay);
}
