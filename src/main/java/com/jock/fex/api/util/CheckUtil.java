package com.jock.fex.api.util;

import com.jock.fex.api.base.BaseResp;
import com.jock.fex.api.exception.ApplicationException;
import org.springframework.util.StringUtils;

public class CheckUtil {

	/**
	 * 参数校验-!StringUtils.isEmpty(check)<br>
	 * code:501010
	 * 
	 * @param check
	 */
	public static void
	paramCheck(String check) {
		paramCheck(501010, check);
	}

	/**
	 * 参数校验-!StringUtils.isEmpty(check)<br>
	 * 
	 * @param check
	 */
	public static void paramCheck(Integer code, String check) {
		paramCheck(code, check, check);
	}

	/**
	 * 参数校验-!StringUtils.isEmpty(check)<br>
	 * 
	 * @param code
	 * @param msg
	 * @param check
	 */
	public static void paramCheck(Integer code, String msg, String check) {
		if (!StringUtils.isEmpty(check)) {
			throw new ApplicationException(code, msg);
		}
	}

	/**
	 * 参数校验-!StringUtils.isEmpty(check)<br>
	 * code:501010
	 * 
	 * @param code
	 * @param msg
	 * @param check
	 */
	public static void paramCheck(String msg, String check) {
		if (!StringUtils.isEmpty(check)) {
			throw new ApplicationException(501010, msg);
		}
	}

	/**
	 * 参数为null就报异常--code:501040
	 * 
	 * @param obj
	 */
	@Deprecated
	public static void emptyCheck(Object obj) {
		emptyCheck(obj, "参数为null");
	}

	/**
	 * 参数为null就报异常--code:501040
	 * 
	 * @param obj
	 * @param msg
	 *            异常信息
	 */
	@Deprecated
	public static void emptyCheck(Object obj, String msg) {
		emptyCheck(obj, 501040, msg);
	}

	/**
	 * 参数为null就报异常
	 * 
	 * @param obj
	 * @param msg
	 *            异常信息
	 */
	@Deprecated
	public static void emptyCheck(Object obj, Integer code, String msg) {
		if (obj == null) {
			throw new ApplicationException(code, msg);
		}
	}

	/**
	 * 参数不为null就报异常--code:501040
	 * 
	 * @param obj
	 * @param msg
	 */
	@Deprecated
	public final static void notNullCheck(Object obj, String msg) {
		notNullCheck(obj, 501040, msg);
	}

	/**
	 * 参数不为null就报异常
	 * 
	 * @param obj
	 * @param code
	 * @param msg
	 */
	@Deprecated
	public final static void notNullCheck(Object obj, Integer code, String msg) {
		if (obj != null) {
			throw new ApplicationException(code, msg);
		}
	}

	public final static void ifnull(Object obj, String msg) {
		ifnull(obj, 501040, msg);
	}

	public final static void ifnull(Object obj, Integer code, String msg) {
		if (obj == null) {
			throw new ApplicationException(code, msg);
		}
	}

	public final static void ifnotnull(Object obj, String msg) {
		ifnotnull(obj, 501040, msg);
	}

	public final static void ifnotnull(Object obj, Integer code, String msg) {
		if (obj != null) {
			throw new ApplicationException(code, msg);
		}
	}

	public final static void ifempty(String obj, String msg) {
		ifempty(obj, 501040, msg);
	}

	public final static void ifempty(String obj, Integer code, String msg) {
		if (StringUtils.isEmpty(obj)) {
			throw new ApplicationException(code, msg);
		}
	}

	public final static void ifnotempty(String obj, String msg) {
		ifnotempty(obj, 501040, msg);
	}

	public final static void ifnotempty(String obj, Integer code, String msg) {
		if (!StringUtils.isEmpty(obj)) {
			throw new ApplicationException(code, msg);
		}
	}

	public final static void ifzero(Long obj, String msg) {
		ifzero(obj, 501040, msg);
	}

	public final static void ifzero(Long obj, Integer code, String msg) {
		if (obj != null && obj == 0) {
			throw new ApplicationException(code, msg);
		}
	}

	public final static void ifnotzero(Long obj, String msg) {
		ifnotzero(obj, 501040, msg);
	}

	public final static void ifnotzero(Long obj, Integer code, String msg) {
		if (obj != null && obj != 0) {
			throw new ApplicationException(code, msg);
		}
	}

	public final static void ifzero(Integer obj, String msg) {
		ifzero(obj, 501040, msg);
	}

	public final static void ifzero(Integer obj, Integer code, String msg) {
		if (obj != null && obj == 0) {
			throw new ApplicationException(code, msg);
		}
	}

	public final static void ifnotzero(Integer obj, String msg) {
		ifnotzero(obj, 501040, msg);
	}

	public final static void ifnotzero(Integer obj, Integer code, String msg) {
		if (obj != null && obj != 0) {
			throw new ApplicationException(code, msg);
		}
	}

	public final static void ifTrue(boolean obj, String msg) {
		ifTrue(obj, 501040, msg);
	}

	public final static void ifTrue(boolean obj, Integer code, String msg) {
		if (obj) {
			throw new ApplicationException(code, msg);
		}
	}

	public final static void ifTrue(boolean obj, BaseResp<Object> resp) {
		if (obj) {
			throw new ApplicationException(resp);
		}
	}

}
