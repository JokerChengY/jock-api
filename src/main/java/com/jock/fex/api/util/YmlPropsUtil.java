package com.jock.fex.api.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;


/**
 * 获取yml文件信息
 * @author zgr
 *
 */
@Configuration
public class YmlPropsUtil {

	//项目的服务名称
	private static String serviceName;
	
    @Value("${spring.application.name}")
    public void setServiceName(String name) {
    	serviceName = name;
    }
    public static String getServiceName() {
        return serviceName;
    }

}
