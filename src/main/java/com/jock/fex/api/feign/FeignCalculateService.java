package com.jock.fex.api.feign;

import com.jock.fex.api.base.BaseResp;
import com.jock.fex.api.feign.model.CalculateScheme;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "calculatemgr")
@Component
public interface FeignCalculateService {
	/**
	 * 新增计算方案
	 * 
	 * @param calculateScheme
	 * @param string2
	 * @param string
	 * @return
	 */
	@RequestMapping(value = "/calculateScheme/add", method = RequestMethod.POST)
	BaseResp<Object> insertCalculateScheme(@RequestBody CalculateScheme calculateScheme, @RequestParam("t") String t,
                                           @RequestParam("s") String s);

	/**
	 * 查询分成方案对应的计算方案
	 *
	 * @param schemeId
	 * @param t
	 * @param s
	 * @return
	 */
	@RequestMapping(value = "/calculateScheme/findByScheme", method = RequestMethod.GET)
	BaseResp<List<CalculateScheme>> findBySchemeId(@RequestParam("schemeId") Long schemeId, @RequestParam("t") String t,
                                                   @RequestParam("s") String s, @RequestParam("souWay") String souWay);

	/**
	 * 修改计算方案
	 *
	 * @param calculateScheme
	 * @return
	 */
	@RequestMapping(value = "/calculateScheme/update", method = RequestMethod.PUT)
	BaseResp<Object> updateCalculateScheme(@RequestBody CalculateScheme calculateScheme, @RequestParam("t") String t,
                                           @RequestParam("s") String s);

	/**
	 * 查询分成方案对应的有效计算方案
	 *
	 * @param req
	 * @param calculateId
	 * @return
	 */
	@RequestMapping(value = "/calculateScheme/findAvailById", method = RequestMethod.GET)
	public BaseResp<CalculateScheme> findAvailById(@RequestParam("t") String t, @RequestParam("s") String s,
                                                   @RequestParam("schemeId") Long schemeId, @RequestParam("souWay") String souWay,
                                                   @RequestParam("times") String times);

}
