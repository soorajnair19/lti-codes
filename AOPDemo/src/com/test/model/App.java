package com.test.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx =  new ClassPathXmlApplicationContext("applicationContext.xml");
	
		Employee e = ctx.getBean("employee", Employee.class);
		e.setName("Lukaku");
		e.setId(9);
		e.setRaisedSalary(100);
		e.setDepartment("Missing Open Goals");
		e.setAddress(new Address());
		
		
		int id = e.getId();
		System.out.println(id);
		
		String name = e.getName();
		System.out.println(name);
		
		System.out.println(e.getRaisedsalary(id));
		
	}

}
