package com.jock.fex.api.config;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Properties;

/**
 * 2018年8月8日<br>
 * 读取外部配置公共配置文件信息
 * 
 * @author 0
 *
 */
public class CommonPropFile {

	private static Properties props;

	/**
	 * 该文件不放在代码库，存放在服务器上
	 */
	private static String propFile = "/data/developer/project/config/common.properties";

	/**
	 * 读取文件
	 */
	private static void readFile() {
		try {
			final Resource resource = new FileSystemResource(propFile);
			props = PropertiesLoaderUtils.loadProperties(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 获取属性
	 * 
	 * @param key
	 * @return
	 */
	public static String getProperty(String key) {
		if (props == null) {
			readFile();
		}
		return props == null ? null : props.getProperty(key);
	}

	/**
	 * 获取属性
	 * 
	 * @param key
	 *            属性key
	 * @param defaultValue
	 *            属性value
	 * @return
	 */
	public static String getProperty(String key, String defaultValue) {
		if (props == null) {
			readFile();
		}
		return props == null ? null : props.getProperty(key, defaultValue);
	}

	// common.properties 字段

	/**
	 * 阿里云存储域名
	 */
	@Deprecated
	public final static String accessUrl = getProperty("accessUrl");
	/**
	 * 服务环境域名
	 */
	@Deprecated
	public final static String baseHost = getProperty("baseHost");
}