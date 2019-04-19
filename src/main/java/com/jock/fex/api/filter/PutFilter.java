package com.jock.fex.api.filter;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.support.AllEncompassingFormHttpMessageConverter;
import org.springframework.http.server.ServletServerHttpRequest;
//import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.web.filter.HttpPutFormContentFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

@Component
public class PutFilter extends HttpPutFormContentFilter {

	private FormHttpMessageConverter formConverter = new AllEncompassingFormHttpMessageConverter();

	@Override
	protected void doFilterInternal(final HttpServletRequest request, HttpServletResponse response,
			FilterChain filterChain) throws ServletException, IOException {
		logger.info("请求方法:" + request.getMethod());

		if (("PUT".equals(request.getMethod()) || "PATCH".equals(request.getMethod())) && isFormContentType(request)) {
			HttpInputMessage inputMessage = new ServletServerHttpRequest(request) {
				@Override
				public InputStream getBody() throws IOException {
					return request.getInputStream();
				}
			};
			MultiValueMap<String, String> formParameters = this.formConverter.read(null, inputMessage);
//			if (CollectionUtils.isEmpty(formParameters)) {
//				Map<String, String[]> m = request.getParameterMap();
//				for (String key : m.keySet()) {
//					for (String s : m.get(key)) {
//						formParameters.add(key, s);
//					}
//				}
//				logger.info("formParameters:" + formParameters.toString());
//			}
			HttpServletRequest wrapper = new HttpPutFormContentRequestWrapper(request, formParameters);
			filterChain.doFilter(wrapper, response);
		} else {
			filterChain.doFilter(request, response);
		}
	}

	private boolean isFormContentType(HttpServletRequest request) {
		String contentType = request.getContentType();
		if (contentType != null) {
			try {
				MediaType mediaType = MediaType.parseMediaType(contentType);
				return (MediaType.APPLICATION_FORM_URLENCODED.includes(mediaType));
			} catch (IllegalArgumentException ex) {
				return false;
			}
		} else {
			return false;
		}
	}

	private static class HttpPutFormContentRequestWrapper extends HttpServletRequestWrapper {

		private MultiValueMap<String, String> formParameters;

		public HttpPutFormContentRequestWrapper(HttpServletRequest request, MultiValueMap<String, String> parameters) {
			super(request);
			this.formParameters = parameters;
		}

		@Override
		public String getParameter(String name) {
			String queryStringValue = super.getParameter(name);
			String formValue = this.formParameters.getFirst(name);
			return (queryStringValue != null ? queryStringValue : formValue);
		}

		@Override
		public Map<String, String[]> getParameterMap() {
			Map<String, String[]> result = new LinkedHashMap<>();
			Enumeration<String> names = getParameterNames();
			while (names.hasMoreElements()) {
				String name = names.nextElement();
				result.put(name, getParameterValues(name));
			}
			return result;
		}

		@Override
		public Enumeration<String> getParameterNames() {
			Set<String> names = new LinkedHashSet<>();
			names.addAll(Collections.list(super.getParameterNames()));
			names.addAll(this.formParameters.keySet());
			return Collections.enumeration(names);
		}

		@Override
		public String[] getParameterValues(String name) {
			String[] queryParam = (super.getQueryString() != null ? super.getParameterValues(name) : null);
			List<String> formParam = this.formParameters.get(name);
			if (formParam == null) {
				return queryParam;
			} else if (queryParam == null) {
				return formParam.toArray(new String[formParam.size()]);
			} else {
				List<String> result = new ArrayList<>(queryParam.length + formParam.size());
				result.addAll(Arrays.asList(queryParam));
				result.addAll(formParam);
				return result.toArray(new String[result.size()]);
			}
		}
	}
}