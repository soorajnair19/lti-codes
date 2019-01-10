 package com.lti.model;

public class Pen
{
//static variables to share within class with an assigned value, created as soon as class is created
	private static int ctr=0;

//instance variables which will give dynamic results when called, created only when instances are created
	private int id;
	private String brand;	
	private float price;
	private String color_of_ink;

	/*
//behaviour or methods, life time only till method exists
	public void setBrand()
	{
	String brandName="Reynolds";
	this.brand = brandName;
	System.out.println("The brand is "+this.brand);
	}
*/

Pen()
{System.out.println("default con");
ctr++;}

Pen(Pen p)
{
	this.id=p.id;
	this.brand=p.brand;
	this.price=p.price;
	this.color_of_ink=p.color_of_ink;	
	ctr++;
}
	
//constructor
Pen(int idd, String brand, float price, String color)
{
	System.out.println("constructor with args");
	this.id=idd;
	this.brand=brand;
	this.price=price;
	this.color_of_ink=color;
	ctr++;
}

public void setid(int idd)
{
	this.id=idd;
}

public void setbrand(String brd)
{
	this.brand=brd;
}

public void setprice(float prc)
{
	this.price=prc;
}
	
public void setcolor(String col)
{
	this.color_of_ink=col;
}



//setter methods
public int getid()
{
	return this.id;
}

public float getprice()
{
	return this.price;
}

public String getbrand()
{
	return this.brand;
}

public String getcolor()
{
	return this.color_of_ink;
}



//tostring
public String toString()
{
	return "id: " +this.id + "\n" + "brand:" + this.brand + "\n" +" Price:" + this.price+ "\n" + "Color:" +this.color_of_ink;


}

}