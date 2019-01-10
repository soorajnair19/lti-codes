package com.lti.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Servlet1() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		String username= getInitParameter("username");
//		String password= getInitParameter("password");
//		
//		PrintWriter out=response.getWriter();
//		out.println("<a href='Servlet2'>Click here</a>");
//		 Cookie cookie1= new Cookie("name", username);
//		 response.addCookie(cookie1);
		
		List<Integer>list = new ArrayList<>();
		list.add(100);
		list.add(102);
		request.setAttribute("arrlist", list);
		request.getRequestDispatcher("jstlpractice.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
