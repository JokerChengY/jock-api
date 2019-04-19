package com.jock.fex.api.service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.jock.fex.api.feign.DataService;
import com.jock.fex.api.feign.dto.DataDTO;
import com.jock.fex.api.util.BaseUtil;
import com.jock.fex.util.RedisUtils;
import com.jock.fex.util.SpringUtil;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.*;

/**
 * 2018年11月2日<br>
 * 缓存数据服务类
 * 
 * @author 0
 *
 */
@Service
public final class DataTools {

	private static DataService dataService;
	static {
		dataService = (DataService) SpringUtil.getBean(DataService.class);
	}

	/**
	 * 2018年11月7日<br>
	 * 基本参数
	 * 
	 * @param project
	 * @return
	 */
	public final static Map<String, Object> getParam(String project) {
		final Map<String, Object> param = new HashMap<>();
		param.put("t", 2);
		param.put("s", "inside_" + project);
		return param;
	}

	/**
	 * 2018年11月2日<br>
	 * 
	 * @param param
	 * @param redisKey
	 * @return
	 */
	public final static Map<String, String> getMap(Map<String, Object> param, String redisKey) {
		final List<DataDTO> list = getList(param, redisKey);

		final Map<String, String> result = new HashMap<String, String>();
		if (!CollectionUtils.isEmpty(list)) {
			list.forEach(l -> result.put(l.getDataKey(), l.getDataValue()));
		}

		return result;
	}

	/**
	 * 2018年11月2日<br>
	 * 
	 * @param param
	 * @param redisKey
	 * @return
	 */
	public final static List<DataDTO> getList(Map<String, Object> param, String redisKey) {
		List<DataDTO> list = new ArrayList<>();
		try {
			final String json = RedisUtils.getByKey(redisKey);
			if (!StringUtils.isEmpty(json)) {
				final Gson gson = new Gson();
				list = gson.fromJson(json, new TypeToken<List<DataDTO>>() {
				}.getType());
			} else {
				try {
					list = BaseUtil.resp(dataService.getRedisValue(param, redisKey));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (list == null) {
			list = new ArrayList<>();
		}

		return list;
	}

	/**
	 * 2018年11月2日<br>
	 * 
	 * @param param
	 * @param redisKeys
	 * @return
	 */
	public final static Map<String, Map<String, String>> getMap(Map<String, Object> param, String... redisKeys) {
		return getMap(param, Arrays.asList(redisKeys));
	}

	/**
	 * 2018年11月2日<br>
	 * 
	 * @param param
	 * @param redisKeys
	 * @return
	 */
	public final static Map<String, List<DataDTO>> getList(Map<String, Object> param, String... redisKeys) {
		return getList(param, Arrays.asList(redisKeys));
	}

	/**
	 * 2018年11月2日<br>
	 * 
	 * @param param
	 * @param redisKeys
	 * @return
	 */
	public final static Map<String, Map<String, String>> getMap(Map<String, Object> param, List<String> redisKeys) {
		final Map<String, Map<String, String>> result = new HashMap<String, Map<String, String>>();
		redisKeys.forEach(s -> result.put(s, getMap(param, s)));
		return result;
	}

	/**
	 * 2018年11月2日<br>
	 * 
	 * @param param
	 * @param redisKeys
	 * @return
	 */
	public final static Map<String, List<DataDTO>> getList(Map<String, Object> param, List<String> redisKeys) {
		final Map<String, List<DataDTO>> result = new HashMap<String, List<DataDTO>>();
		redisKeys.forEach(s -> result.put(s, getList(param, s)));
		return result;
	}

	/**
	 * 2018年11月7日<br>
	 * 取第一个值<br>
	 * 对只有一个值的数据使用
	 * 
	 * @param param
	 * @param redisKey
	 * @return
	 */
	public final static String getValue(Map<String, Object> param, String redisKey) {
		final List<DataDTO> list = getList(param, redisKey);
		if (!CollectionUtils.isEmpty(list)) {
			// 默认取第一个
			return list.get(0).getDataValue();
		}
		return "";
	}

	/**
	 * 2018年11月7日<br>
	 * 取第一个对象<br>
	 * 
	 * @param param
	 * @param redisKey
	 * @return
	 */
	public final static DataDTO getData(Map<String, Object> param, String redisKey) {
		final List<DataDTO> list = getList(param, redisKey);
		if (!CollectionUtils.isEmpty(list)) {
			// 默认取第一个
			return list.get(0);
		}
		return null;
	}

	/********************** 常用数据方法 start ***********************/

	/**
	 * 2018年11月7日<br>
	 * oss存储对象域名
	 * 
	 * @param project
	 * @return
	 */
	public final static String ossDomain(String project) {
		final DataDTO data = getData(getParam(project), "data_oss_domain");
		if (data == null) {
			return "";
		}
		return data.getDataValue();
	}

	/**
	 * 2018年11月7日<br>
	 * 当前环境域名
	 * 
	 * @param project
	 * @return
	 */
	public final static String envDomain(String project) {
		final DataDTO data = getData(getParam(project), "data_env_domain");
		if (data == null) {
			return "";
		}
		return data.getDataValue();
	}

	/*********************** 常用数据方法 end **********************/
}
