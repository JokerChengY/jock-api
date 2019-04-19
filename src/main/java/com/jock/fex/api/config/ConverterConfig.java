package com.jock.fex.api.config;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间格式转换
 * 
 * @author 0
 *
 */
public class ConverterConfig implements Converter<String, Date> {

	private final static SimpleDateFormat sf1 = new SimpleDateFormat("yyyy/MM/dd");
	private final static SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd");
	private final static SimpleDateFormat sf3 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	private final static SimpleDateFormat sf4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	@Override
	public Date convert(String source) {
		try {
			if (source.matches("\\d{4}/\\d{2}/\\d{2}")) {
				return sf1.parse(source);
			} else if (source.matches("\\d{4}-\\d{2}-\\d{2}")) {
				return sf2.parse(source);
			} else if (source.matches("\\d{4}/\\d{2}/\\d{2}\\s+\\d{2}:\\d{2}:\\d{2}")) {
				return sf3.parse(source);
			} else if (source.matches("\\d{4}-\\d{2}-\\d{2}\\s+\\d{2}:\\d{2}:\\d{2}")) {
				return sf4.parse(source);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
}
