package com.lti.model;

public class TestPen {
public static void  main(String[] args)
	{
		Pen p1 = new Pen();
		p1.setid(1);
		p1.setbrand("Rotomac");
		p1.setprice(70.0f);
		p1.setcolor("Black");
		System.out.println(p1);
		
		Pen p2=new Pen(2,"Parker",200.00f,"Blue");
		System.out.println(p2);
		
	}

}
