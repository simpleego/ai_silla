package com.simple.web;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CharaterEncodingFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, 
			ServletResponse response, 
			FilterChain chain)
			throws IOException, ServletException {
		
		// 한글 인코딩 설정
		request.setCharacterEncoding("utf-8");
		chain.doFilter(request, response);
	}

}
