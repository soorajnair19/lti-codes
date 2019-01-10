package com.lti.misc;

public class Calculator {
	
	static Calculator instance=null;
	
	//instance variables
	private int num1;
	private int num2;
	//private int result;
	
	public static Calculator getInstance()
	{
		if (instance==null)
		{
			instance = new Calculator();
		}
		return instance;
	}
	
	//default non parameterized constructor
public Calculator()
	{
		this.num1=5;
		this.num2=10;
	}
	
	
	//parameterized constructor
/*public	Calculator(int a,int b)
	{
		this.num1=a;
		this.num2=b;
	}*/
	
/*public Calculator(Calculator c)
	{
		this.num1=c.num1;
		this.num2=c.num2;
	}
	*/
//getters or accessors
	public int getNum1()
	{
		return this.num1;
	}
	
	public int getNum2()
	{
		return this.num2;
	}
	
	public int setNum1(int a)
	{
		return this.num1=a;
	}
	
	public int setNum2(int b)
	{
		return this.num2=b;
	}
	
	
	
	public int  add()
	{
		return this.getNum1() + this.getNum2();
	}	
	
	public int  add(int a, int b)
	{
		return a+b;
	}	
	
	public int  sub()
	{
		return this.getNum1() - this.getNum2();
	}	

	public int sub(int a,int b)
	{
		return this.getNum1() - this.getNum2();
	}

	public int mul(int a,int b)
	{
		return this.num1 * this.num2;
	}

	public int div(int a,int b)
	{
		return this.num1 / this.num2;
	}

}
	