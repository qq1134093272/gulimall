//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.zjh.common.exception;

import com.zjh.common.utils.R;
import org.apache.shiro.authz.AuthorizationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

@RestControllerAdvice
public class RRExceptionHandler {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public RRExceptionHandler() {
	}

	@ExceptionHandler({RRException.class})
	public R handleRRException(RRException e) {
		R r = new R();
		r.put("code", e.getCode());
		r.put("msg", e.getMessage());
		return r;
	}

	@ExceptionHandler({NoHandlerFoundException.class})
	public R handlerNoFoundException(Exception e) {
		this.logger.error(e.getMessage(), e);
		return R.error(404, "路径不存在，请检查路径是否正确");
	}

	@ExceptionHandler({DuplicateKeyException.class})
	public R handleDuplicateKeyException(DuplicateKeyException e) {
		this.logger.error(e.getMessage(), e);
		return R.error("数据库中已存在该记录");
	}

	@ExceptionHandler({AuthorizationException.class})
	public R handleAuthorizationException(AuthorizationException e) {
		this.logger.error(e.getMessage(), e);
		return R.error("没有权限，请联系管理员授权");
	}

	@ExceptionHandler({Exception.class})
	public R handleException(Exception e) {
		this.logger.error(e.getMessage(), e);
		return R.error();
	}
}
