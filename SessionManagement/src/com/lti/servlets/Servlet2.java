package com.lti.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public Servlet2() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();

		Cookie[] cookies =request.getCookies();
		for(Cookie cookie :cookies)
		{
			String name=cookie.getName();
			if(name.equals("name"))
			{
				String value=cookie.getValue();

				out.println("welcome "+value);

			}


		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
