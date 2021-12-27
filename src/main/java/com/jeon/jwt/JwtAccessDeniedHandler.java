package com.jeon.jwt;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class JwtAccessDeniedHandler implements AccessDeniedHandler {

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response,
			AccessDeniedException accessDeniedException) throws IOException {
		// "response.sendError"은 "/error"로 리다이렉트 시키므로 setStatus 사용
		// response.sendError(HttpServletResponse.SC_FORBIDDEN);
		response.setStatus(HttpServletResponse.SC_FORBIDDEN);
	}
}