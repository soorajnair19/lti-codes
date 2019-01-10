package com.test.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanCreator {
	
	@Bean
	public Employee employee()
	{
		return new Employee();
		
	}
	@Bean
	public Address address()
	{
		return new Address();
		
	}
	@Bean
	public NumberGenerator numberGenerator()
	{
		return new NumberGenerator();
		
	}

	@Bean
	public Department department()
	{
		return new Department();
		
	}
	
	
	
}
