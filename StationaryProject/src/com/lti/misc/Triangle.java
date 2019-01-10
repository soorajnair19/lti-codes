package com.lti.misc;
import java.util.*;

public class Triangle extends TwoDShape {
	Scanner sc= new Scanner(System.in);

	Triangle()
	{
		this.numofsides =3;
		System.out.println("Enter base:\n");
		this.breadth=sc.nextInt();
		System.out.println("Enter height:\n");
		this.length=sc.nextInt();
	}

	public float calcArea();
	{
		return (float)(0.5*this.length*this.breadth());
	}

	public float calcVol();
	{
		System.out.println("No volume for 2d shape");
		return 0.0f;
	}



}
