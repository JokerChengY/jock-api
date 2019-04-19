package com.jock.fex.api.feign;

import com.jock.fex.api.base.BaseResp;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * 资讯项目接口
 * 
 * @author 0
 *
 */
@FeignClient(value = "informationmgr")
@Component(value = "feignPolicyService")
public interface PolicyService {

	/**
	 * 根据文章id查询资讯类型
	 * 
	 * @param areaId
	 * @param t
	 * @param s
	 * @return
	 */
	@GetMapping("/policy/type/public/select/newsId")
	BaseResp<Map<String, Object>> selectByNewsId(@RequestParam("newsId") Long newsId, @RequestParam("t") String t,
                                                 @RequestParam("s") String s);

	/**
	 * 2019年1月9日<br>
	 * 查询有效的资讯类型
	 * 
	 * @param map
	 * @return
	 */
	@GetMapping("/policy/type/app/public/select/all")
	BaseResp<List<Map<String, Object>>> selectAll(@RequestParam("req") Map<String, Object> map);
}
