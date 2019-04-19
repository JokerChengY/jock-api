package com.jock.fex.api.exception;

import com.jock.fex.api.base.BaseResp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 异常基类
 * 
 * @author ldt
 */
public class ApplicationException extends RuntimeException {

	private static final long serialVersionUID = -4171672110493055058L;

	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	private BaseResp<?> resp;

	public ApplicationException(BaseResp<?> resp) {
		this.resp = resp;
	}

	public ApplicationException(int code, String msg) {
		this(new BaseResp<>(code, msg));
	}

	public BaseResp<?> getResp() {
		return resp;
	}

	public void setResp(BaseResp<?> resp) {
		this.resp = resp;
	}

	@Override
	public String getMessage() {
		String message = resp.getMessage();
		if (message != null)
			return message;
		else
			return super.getMessage();
	}

}
