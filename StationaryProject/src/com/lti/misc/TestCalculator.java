package com.lti.misc;

import java.util.Scanner;

import javax.jws.soap.SOAPBinding;

public class TestCalculator {
public static void main(String[ ] args)
{
	//Calculator c1 = new Calculator();
	Scanner sc=new Scanner(System.in);
	
	int input1,input2,output;
	System.out.println("Enter first number");
	input1=sc.nextInt();
	System.out.println("Enter second number");
	input2=sc.nextInt();
	
	//Calculator c1 = new Calculator(input1,input2);
	Calculator c2= new Calculator.getInstance();
	
	output= c2.add(input1, input2);
	System.out.println("Addition result is: "+output);
/*
	output= c1.sub(input1, input2);
	System.out.println("Subtraction result is: "+output);
	
	output= c1.mul(input1, input2);
	System.out.println("Multiplication result is: "+output);
	
	output= c1.div(input1, input2);
	System.out.println("Division result is: "+output);
	*/
	Calculator c2=new Calculator(9,10);
	System.out.println("add.." +c2.add());
	//System.out.println("sub.." +c2.sub());
	//System.out.println("mul.." +c2.mul());
	//System.out.println("div.." +c2.div());
	
	Calculator c3= new Calculator(c2);
	
	Calculator c4= new Calculator();
	c4.setNum1(45);
	c4.setNum2(67);
	System.out.println(c4.add());
	//System.out.println(c4.sub())
	
	
	
	
	
	
	
	Calculator c5= new Calculator();
		System.out.println("enter num1");
		c5.setNum1(sc.nextInt());
		System.out.println("enter num2");
		c5.setNum2(sc.nextInt());
		System.out.println(c5.add());
		//System.out.println();
}
	
}
