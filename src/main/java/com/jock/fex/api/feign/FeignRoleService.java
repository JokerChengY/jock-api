package com.jock.fex.api.feign;

import com.jock.fex.api.base.BaseResp;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "usermgr")
@Component(value = "feignRoleService")
public interface FeignRoleService {
	/**
	 * 增加角色
	 * 
	 * @param role
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "/role", method = RequestMethod.POST)
	public BaseResp<Object> saveRole(
            @RequestParam("roleName") String roleName,
            @RequestParam("roleCode") String roleCode,
            @RequestParam("isShow") Integer isShow,
            @RequestParam("systemInfoId") Long systemInfoId,
            @RequestParam("t") String t,
            @RequestParam("s") String s);

	/**
	 * 删除角色
	 * @param roleId
	 * @param req
	 */
	@RequestMapping(value = "/role/{roleId}", method = RequestMethod.DELETE)
	public BaseResp<Object> deleteRole(
            @PathVariable("roleId") Long roleId,
            @RequestParam("t") String t,
            @RequestParam("s") String s);

}
