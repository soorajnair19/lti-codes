package com.lti.arrays;

import com.lti.model.Pen;

public class BookArrayTester {
	private int id;
	private String title;
	private String author;
	private String dor;
	static int   ctr;
	  
	BookArrayTester()
	{System.out.println("default constructor");
	ctr++;
	}
	BookArrayTester( BookArrayTester b)
	{
		this.id=b.id;
		this.title=b.title;
		this.author=b.author;
		this.dor=b.dor;	
	ctr++;
	}
	//constructor
	BookArrayTester(int idd, String name, String title, String dor)
	{
		System.out.println("constructor with args");
		this.id=idd;
		this.brand=brand;
		this.price=price;
		this.color_of_ink=color;
		ctr++;
	}

	
//setters
	public void setid(int idd)
	{
		this.id=idd;
	}
	public void settitle(String ttl)
	{
		this.title=ttl;
	}
	public void setauthor(String auth)
	{
		this.author=auth;
	}
	public void setdor(String dore)
	{
		this.dor=dore;
	}
		//getters
	 
	public void getid()
	{	return this.id;
	}
	
	public void getauthor()
	{	return this.author;
	}
	
	public void gettitle()
	{	return this.title;
	}
	
	public void getdor()
	{	return this.dor;
	}
	
	}
}
