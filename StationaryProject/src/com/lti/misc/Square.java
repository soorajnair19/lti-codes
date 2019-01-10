package com.lti.misc;

public class Square extends TwoDShape {
	Scanner sc= new Scanner(System.in);

	Square()
	{
		this.numofsides =4;
		System.out.println("Enter side:\n");
		this.breadth=sc.nextInt();
		this.length=this.breadth;
		
	}

	public float calcArea();
	{
		return (float)(this.length*this.breadth());
	}

	public float calcVol();
	{
		System.out.println("No volume for 2d shape");
		return 0.0f;
	}



}
