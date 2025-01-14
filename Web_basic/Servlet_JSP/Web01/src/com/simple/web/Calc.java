package com.simple.web;

import java.io.IOException;

import java.net.URLEncoder;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xpath.internal.functions.Function;

@WebServlet("/cal")
public class Calc extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		// 사용자에게 보내는 방식을 결정
		resp.setCharacterEncoding("UTF-8");
		// Content 해석 방식을 알려줌
		resp.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = resp.getWriter();
		
		String num1_ = req.getParameter("num1");// request 
		String num2_ = req.getParameter("num2");// request 
		String op_ = req.getParameter("op");// request
		
		//String op_ = URLEncoder.encode(op,  "UTF-8");  
		
		// 자바
		//System.out.println((op.encodeUriComponent("`~!@#$%^&*()-_=+[{]}\\|;:\'\",<.>/?");
		
		System.out.println(op_);
		
		if(num1_ != null && num2_ != null && op_ != null) {
			
			int num1 = Integer.parseInt(num1_);
			int num2 = Integer.parseInt(num2_);			
			
			int result=0;
			double result_=0.0;
			
			switch (op_) {
			case "+":
				result = num1+num2;
				break;
			case "-":
				result = num1-num2;
				break;
			case "x":
				result = num1*num2;
				break;
			case "/":
				if(num2!=0) {
					result_ = (double)num1*num2;				
				}else {
					result_ = 0;
				}
				break;
			default:
				out.println("해당 연산자는 지원하지 않습니다.");		
				break;
			}
			
			if(op_.equals("/")) {
				out.println(op_+" 연산결과 : "+result_);
			}else {
				out.println(op_+" 연산결과 : "+result);	
			}
		}
			
	}

}
