package com.simple.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

@WebServlet("/calc_cookie")
public class Calc_Cookie extends HttpServlet {
	private static final long serialVersionUID = 1L;   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//ServletContext application = request.getServletContext();
		
		//HttpSession session = request.getSession();
		// Cookie 선언
		Cookie [] cookies = request.getCookies();
		
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		String value_ = request.getParameter("value");
		String op = request.getParameter("operator");
		
		System.out.println("==>"+value_);
		System.out.println("==>"+op);
		
		int value=0;
		
		if(!value_.equals("")) {
			value = Integer.parseInt(value_);
		}
		
		if(op.equals("=")) {
			// 두개의 숫자를 계산한다.
			int x=0;
			//int x = (int) session.getAttribute("value");
			for(Cookie c: cookies) {
				if(c.getName().equals("value")) {
					x = Integer.parseInt(c.getValue());
					break;
				}
			}		
			
			
			int y = value;
			String operator="";
			//String operator = (String) session.getAttribute("op");
			for(Cookie c: cookies) {
				if(c.getName().equals("op")) {
					operator = c.getValue();
					break;
				}
			}
			
			int result=0;
			if(operator.equals("+")) {
				result = x+y;
			}else {
				result = x-y;
			}
			
			out.println("결과값 : "+result);
			
		}else {
			// application 저장소에 전달받은 값과 연산자를 저장
			//application.setAttribute("value", value);
			//application.setAttribute("op", op);			
			//session.setAttribute("value", value);
			//session.setAttribute("op", op);	
			
			Cookie valueCookie = new Cookie("value", String.valueOf(value));
			Cookie opCookie = new Cookie("op", op);
			
			response.addCookie(valueCookie);
			response.addCookie(opCookie);
			
		}
		
	}

}
