package com.simple.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hi2")
public class Simple extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter  out =  resp.getWriter();
		out.println("Hello Servlet!!");
		out.println("<p>Hello Servlet!!</P>");
	}

}
