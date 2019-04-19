package com.jock.fex.api.feign;

import com.jock.fex.api.base.BaseResp;
import com.jock.fex.api.base.PageBean;
import com.jock.fex.api.feign.dto.DataDTO;
import com.jock.fex.api.feign.model.Bank;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * 数据项目接口
 * 
 * @author 0
 *
 */
@FeignClient(value = "datamgr")
@Component(value = "feignDataService")
public interface DataService {

	@GetMapping("/area/select/province/city")
	BaseResp<List<Map<String, Object>>> selectProvinceCity(@RequestParam("areaId") Long areaId,
                                                           @RequestParam("t") String t, @RequestParam("s") String s);

	/**
	 * 获取地区数据
	 *
	 * @param parentId
	 *            父id
	 * @param t
	 * @param s
	 * @return
	 * @Deprecated-使用重载方法selectArea(Map<String, Object> param)
	 */
	@Deprecated
	@GetMapping(value = "/area/select/parentId")
	public BaseResp<List<Map<String, Object>>> selectArea(@RequestParam("parentId") String parentId,
                                                          @RequestParam("t") String t, @RequestParam("s") String s);

	/**
	 * 获取地区数据
	 *
	 * @param param
	 *            t/s/<br>
	 *            parentId：父级id<br>
	 *            enabled：启用的记录<br>
	 *            level：1-省，2-市，3-区
	 * @return
	 */
	@GetMapping(value = "/area/select/parentId")
	public BaseResp<List<Map<String, Object>>> selectArea(@RequestParam("map") Map<String, Object> param);

	/**
	 * 根据id查询地区信息
	 *
	 * @param parentId
	 * @param t
	 * @param s
	 */
	@GetMapping(value = "/area/select/{areaId}")
	public BaseResp<Map<String, Object>> selectAreaById(@PathVariable("areaId") Long areaId,
                                                        @RequestParam("t") String t, @RequestParam("s") String s);

	/**
	 * 获取启用地区数据
	 *
	 * @param t
	 * @param s
	 * @return
	 */
	@GetMapping(value = "/area/select/enabled")
	public BaseResp<List<Map<String, Object>>> selectAreaEnabled(@RequestParam("t") String t,
                                                                 @RequestParam("s") String s);

	/**
	 * 根据名称查询
	 *
	 * @param areaName
	 *            地区名称，全称或简称
	 * @param t
	 * @param s
	 * @return
	 */
	@GetMapping(value = "/area/select/name")
	public BaseResp<Map<String, Object>> selectByName(@RequestParam("areaName") String areaName,
                                                      @RequestParam("t") String t, @RequestParam("s") String s);

	/**
	 * 查询本地区和上级地区
	 *
	 * @param areaId
	 *            地区id
	 * @param t
	 *            t
	 * @param s
	 *            s
	 * @return
	 */
	@GetMapping(value = "/area/parent/{areaId}")
	public BaseResp<Map<String, Object>> areaParent(@PathVariable("areaId") Long areaId, @RequestParam("t") String t,
                                                    @RequestParam("s") String s);

	/**
	 * 按model模糊查询
	 *
	 * @param map
	 *            参数：enabled,model
	 * @param t
	 * @param s
	 * @return
	 */
	@GetMapping(value = "/area/model")
	public BaseResp<Object> selectByModel(@RequestParam Map<String, Object> map, @RequestParam("t") String t,
                                          @RequestParam("s") String s);

	/**
	 * 获取银行数据
	 *
	 * @return
	 */
	@GetMapping(value = "/bank/top")
	public BaseResp<List<Map<String, Object>>> bankList(@RequestParam("t") String t, @RequestParam("s") String s);

	/**
	 * 获得数据字典数据
	 */
	@GetMapping(value = "/dictionnary/select/code")
	public BaseResp<Object> selectByCode(@RequestParam("dataCode") String dataCode, @RequestParam("t") String t,
                                         @RequestParam("s") String s);

	/**
	 * 根据父id获取银行数据
	 *
	 * @return
	 */
	@GetMapping(value = "/bank")
	public BaseResp<PageBean<Bank>> getBankList(@RequestParam Map<String, Object> map);

	/**
	 * 根据父id获取银行数据
	 *
	 * @return
	 */
	@GetMapping(value = "/dict/select/{id}")
	public BaseResp<Object> selectDictById(@PathVariable("id") Long id, @RequestParam("t") String t,
                                           @RequestParam("s") String s);

	/**
	 * 2018年9月13日<br>
	 *
	 * @param param
	 *            t、s、cityIds
	 * @return <br>
	 *         "areaId": 440100,<br>
	 *         "children": [<br>
	 *         {<br>
	 *         "areaId": 440103,<br>
	 *         "initials": "L",<br>
	 *         "name": "荔湾区",<br>
	 *         "parentId": 440100,<br>
	 *         "shortName": "荔湾"<br>
	 *         }<br>
	 *         ],<br>
	 *         "cityKey": "4401",<br>
	 *         "name": "广州市"<br>
	 */
	@GetMapping(value = "/area/public/online")
	public BaseResp<List<Map<String, Object>>> onlineCity(@RequestParam Map<String, Object> param);

	/**
	 * 2018年10月25日<br>
	 * 根据redisKey获取数据
	 *
	 * @param param
	 *            t、s
	 * @param redisKey
	 * @return
	 */
	@GetMapping(value = "/redis/manager/select/{redisKey}")
	public BaseResp<List<DataDTO>> getRedisValue(@RequestParam Map<String, Object> param,
                                                 @PathVariable("redisKey") String redisKey);
}
