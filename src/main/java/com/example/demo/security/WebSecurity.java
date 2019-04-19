package com.example.demo.security;

import org.springframework.stereotype.Component;

@Component
public class WebSecurity {

	//Entry Point Interceptor
	//.anyRequest().access("@webSecurity.entryPoint(authentication, request)")
//	public boolean entryPoint(org.springframework.security.core.Authentication auth, javax.servlet.http.HttpServletRequest request)
//			throws IOException {
//		return false;
//	}
	
}
