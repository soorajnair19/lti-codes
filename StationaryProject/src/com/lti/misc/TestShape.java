package com.lti.misc;
import java.util.*;

public class TestShape {
	public static void main(String [] args)
	{
		Shape shape = null;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the shape to be drawn:");
		System.out.println("1.Equilateral Triangle");
		System.out.println("2.Isosceles Triangle");
		System.out.println("3. Square");
		
		int choice = sc.nextInt();

	
	switch(choice)
	{
	case 1: 
	shape = new EqTriangle();
	break;	
	case 2:
	shape = new IsosTriangle();
	break;
	case 3:
	shape = new Square();
	break;
	default: System.out.println("Enter value between 1 and 3");
	}
    drawShape(shape);
	}
	

	public static void drawShape (Shape s)
	{
		s.draw();	
	}
}
