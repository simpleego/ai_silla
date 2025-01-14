package com.simple.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class Sample extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 사용자에게 보내는 방식을 결정
		resp.setCharacterEncoding("UTF-8");
		// Content 해석 방식을 알려줌
		resp.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = resp.getWriter();
		
		String num1_ = req.getParameter("num1");// request 
		String num2_ = req.getParameter("num2");// request 
		
		//if(count_.equals("") || !count_)
		int num1 = Integer.parseInt(num1_);
		int num2 = Integer.parseInt(num2_);
		
		int sum = num1+num2;		
		int sub = num1-num2;		
		int mul = num1*num2;
		double div;
		
		if(num2 != 0) {
			div = (double)num1/num2;				
		}else {
			div = 0;
		}
		
		// 클라이언트 웹브라우저에 데이터 전송
		out.println("<h1>덧셈결과</h1>");
		out.println("<p>"+sum+"</p>");
		out.println("<h1>뺄셈결과</h1>");
		out.println("<p>"+sub+"</p>");
		out.println("<h1>곱셈결과</h1>");
		out.println("<p>"+mul+"</p>");
		out.println("<h1>나눗셈결과</h1>");
		out.println("<p>"+div+"</p>");
	

	}

}
