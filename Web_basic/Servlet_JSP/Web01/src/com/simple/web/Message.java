package com.simple.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Message
 */
@WebServlet("/message")
public class Message extends HttpServlet {
	private static final long serialVersionUID = 1L;       
    

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		PrintWriter out = response.getWriter();
		out.println("<h1>메시지 응답</h1>");
		out.println("<p>제목 : "+title+"</p>");
		out.println("<p>내용 : "+content+"</p>");		
	}

}
