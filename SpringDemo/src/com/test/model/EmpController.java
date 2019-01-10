package com.test.model;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import HibernateUtil.HibernateUtil;

@Controller
public class EmpController {
	
	public static void main (String args[])
	{
		SessionFactory factory = HibernateUtil.getSessionFactory();
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmpService empService = ctx.getBean("empService",EmpService.class);
		empService.addEmployee(new Employee());
		
		EmpService e = ctx.getBean("empService",EmpService.class);
		System.out.println(e);
		empService.delEmployee(new Employee());
	}
	
	
}
