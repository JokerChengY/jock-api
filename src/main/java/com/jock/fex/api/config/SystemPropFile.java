package com.jock.fex.api.config;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Properties;

/**
 * 2018年8月8日<br>
 * 读取项目下system.properties文件信息
 * 
 * @author 0
 *
 */
public class SystemPropFile {

	private static Properties props;

	/**
	 * 读取文件
	 */
	private static void readFile() {
		try {
			final Resource resource = new ClassPathResource("system.properties");
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

}