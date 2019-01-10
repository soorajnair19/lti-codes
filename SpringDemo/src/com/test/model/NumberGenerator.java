package com.test.model;

import org.springframework.stereotype.Component;

@Component
public class NumberGenerator {
Integer randomNumber;
public Integer getNumber()
{	
	return (int)(Math.random()*100);
	}
}
