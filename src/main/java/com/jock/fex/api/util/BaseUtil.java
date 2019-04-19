package com.jock.fex.api.util;

import com.jock.fex.api.base.BaseResp;
import com.jock.fex.api.exception.ApplicationException;

public class BaseUtil {

	/**
	 * 调用结果检测
	 * 
	 * @param resp
	 * @return
	 * @return
	 */
	public final static <T> T respCheck(BaseResp<T> resp) {

		if (resp.getCode() != 200) {
			throw new ApplicationException(resp);
		}

		return resp.getResult();
	}

	/**
	 * 不校验结果
	 * 
	 * @param resp
	 * @return
	 * @return
	 */
	public final static <T> T resp(BaseResp<T> resp) {
		if (resp != null && resp.getCode() == 200) {
			return resp.getResult();
		}
		return null;
	}

	/**
	 * 只校验结果
	 * 
	 * @param <T>
	 * 
	 * @param resp
	 * @return
	 * @return
	 */
	public final static <T> BaseResp<T> checkCode(BaseResp<T> resp) {

		if (resp.getCode() != 200) {
			throw new ApplicationException(resp);
		}

		return resp;
	}

}
