package com.simple.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculator
 */
@WebServlet("/calc")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		
		String num1_ = request.getParameter("num1");
		String num2_ = request.getParameter("num2");
		String op = request.getParameter("op");
		
		int num1 = Integer.parseInt(num1_);
		int num2 = Integer.parseInt(num2_);
		
		int result=0;
		double result1=0.0;
		
		switch (op) {
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
			if(num2 != 0)
				result1 = (double)num1/num2;
			break;
		default:
			break;
		}
		
		out.println("<h1>결과 출력</h1>");
		
		if(op.equals("/")) {
			out.println("<p>"+num1+op+num2+"="+result1+"</p>");
		}else {
			out.println("<p>"+num1+op+num2+"="+result+"</p>");			
		}
	}

}
