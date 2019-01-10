package com.test.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TesterApp {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanCreator.class);
		
		NumberGenerator ng = ctx.getBean("numberGenerator", NumberGenerator.class);
		System.out.println("random number generated "+ng.getNumber());
		
	}

}
