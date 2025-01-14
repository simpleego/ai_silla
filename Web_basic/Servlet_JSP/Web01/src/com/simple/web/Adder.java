package com.simple.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hi")
public class Adder extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html; charset=utf-8");
		
		PrintWriter  out =  resp.getWriter();
//		out.println("Hello Servlet!!");
//		out.println("<p>Hello Servlet!!</P>");
		
		String count_ = req.getParameter("count");
		int count=Integer.parseInt(count_);
		
		for (int i = 0; i < count; i++) {
			out.println("<p>¾È³ç Servlet!!</p>");			
		}
		
	}

}
