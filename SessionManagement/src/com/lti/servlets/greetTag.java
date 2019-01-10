package com.lti.servlets;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.StringWriter;


public class greetTag extends SimpleTagSupport{
	
	public void doTag() throws JspException, IOException{
JspWriter out = getJspContext().getOut();
out.println("<h1 style='color:red'>Greetings</h1>");


StringWriter writer = new StringWriter();
getJspBody().invoke(writer);
getJspContext().getOut().println("<h2 style='color:red'>Greetings</h2>"+writer.toString());
	}
}
