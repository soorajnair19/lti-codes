package com.lti.gadgets;

public class TestGadget {
	
	public static void main(String[] args)
	{
		Mobile m1 = new Mobile("Android", CoverColor.BLACK,"A1");
		m1.turnOn();
		m1.turnOff();
		System.out.println(m1);
	}

}
