package com.jeon.jwt;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint {

	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException authException) throws IOException {
		// "response.sendError"은 "/error"로 리다이렉트 시키므로 setStatus 사용
		// response.sendError(HttpServletResponse.SC_UNAUTHORIZED);
		response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
	}
}