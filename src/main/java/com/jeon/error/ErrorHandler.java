package com.jeon.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorHandler {
	
	/**
	 * 개발자 제어에 의한 에러 처리
	 * @param ex
	 * @return
	 */
	@ExceptionHandler(BizExcpetion.class)
	public ResponseEntity<String> driverBizExcpetion(BizExcpetion ex) {
		return new ResponseEntity<>(ex.getMessage(), ex.getHttpStatus());
	}
	
	/**
	 * 예상치 못한 에러 발생 시의 처리
	 * @param ex
	 * @return
	 */
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handler(Exception ex) {
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
