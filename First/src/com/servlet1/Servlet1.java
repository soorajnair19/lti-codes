package com.servlet1;

import java.io.IOException;

import javax.annotation.security.RolesAllowed;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet("/Servlet1")
@RolesAllowed("tomcat")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
  
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
 response.getWriter().print("hi");
	}

 
}
