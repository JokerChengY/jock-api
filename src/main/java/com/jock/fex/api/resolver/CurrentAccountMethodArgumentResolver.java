package com.jock.fex.api.resolver;

import com.jock.fex.api.annotation.CurrentAccount;
import com.jock.fex.api.feign.dto.LoginAccount;
import com.jock.fex.util.RedisUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.MethodParameter;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

/**
 * 增加方法注入，将含有CurrentAccount注解的方法参数注入当前登录用户
 * 
 * @see com.jock.fex.api.annotation.CurrentAccount
 * @author yangcs
 * @date 2017/12/08.
 */
public class CurrentAccountMethodArgumentResolver implements HandlerMethodArgumentResolver {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public boolean supportsParameter(MethodParameter parameter) {
		// 如果参数类型是User并且有CurrentUser注解则支持
		return parameter.hasParameterAnnotation(CurrentAccount.class);
	}

	@Override
	public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer,
			NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
		String token = webRequest.getParameter("token");
		// 获取当前登录人
		if (StringUtils.isEmpty(token)) {
			return null;
		}
		return RedisUtils.getByKey(token, LoginAccount.class);
	}
}
