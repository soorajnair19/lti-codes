package com.test.model;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		ctx.registerShutdownHook();
		/*Employee e1=ctx.getBean("employee",Employee.class);
		System.out.println(e1);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter new name:");
		e1.setName(sc.nextLine());
		System.out.println(e1);*/
		
		
		Integer x = ctx.getBean("randomNumber", Integer.class);
		System.out.println(x);
		
		
		
/*		Employee e2 = ctx.getBean("employee", Employee.class);
		System.out.println(e2);*/
		
		/*if(e1.hashCode()==e2.hashCode())
		{
			System.out.println("Equal");
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		}
		else
		{
			System.out.println("not equal");
			System.out.println(e1.hashCode());
			System.out.println(e2.hashCode());
			
		}*/
		
		
		
	}

}
