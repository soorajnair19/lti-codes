package com.lti.misc;

import java.util.Scanner;

public class ManagerTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Inheritance1 e1 = new Inheritance1();
		e1.greeting();
		Inheritance1 e2 = new Manager();
		//Inheritance1 e2 = new Inheritance1();
		Inheritance1 e3 = null;
		e2.greeting();
		
		if(e2 instanceof Manager)
		{
			Manager m1 =  (Manager) e2; //check for downcasting
			m1.greeting();
		}
		
System.out.println("Enter the type of Employee");
String typeofemp = sc.nextLine();

if (typeofemp.equals("Inheritance1"))
{
e3 = new Inheritance1();
}
else if (typeofemp.equals("Manager"))
{
	e3 = new Manager();
	}

	}

public static void callGreeting (Inheritance1 e)
{
 if ( e instanceof Inheritance1)	
e.greeting();
 else if( e instanceof Manager)
e.greeting();

}

}
