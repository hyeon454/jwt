package com.jeon.error;

import org.springframework.http.HttpStatus;

public class BizExcpetion extends RuntimeException{
	private static final long serialVersionUID = 1L;
	private HttpStatus httpStatus;

	@SuppressWarnings("unused")
	private BizExcpetion() {}
	
	public BizExcpetion(String message, HttpStatus httpStatus) {
        super(message);
        this.setHttpStatus(httpStatus);
    }

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}
}
