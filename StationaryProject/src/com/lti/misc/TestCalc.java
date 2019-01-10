package com.lti.misc;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestCalc {
	Calculator c = new Calculator();
	long expected;
	int value1,value2;
	

	@BeforeClass
	public static void m1() {System.out.println("Testing begins");}

	@Before
	public void m3() {System.out.println("before testing..unit level");}

	@Parameters
	public static Collection data()
	{
		return Arrays.asList(new Object [ ] [ ]
				{ 
			{1,0,1},{10,5,5},{23,18,5},{34,17,17}}); 
	}

	public TestCalc(long expected,int value1,int value2)
	{
		this.expected= expected;
		this.value1 = value1;
		this.value2=value2;
	}
	@Test
	public void testAddIntInt() {
		assertEquals(5, c.add(2,3));;
	}

/*	@Test
	public void testSubIntInt() {
		assertEquals(-5, c.sub(20,5));
	}*/
	@AfterClass
	public static void m2() {System.out.println("Testing ends");}

	@After
	public void m4() {System.out.println("after testing..unit level");}

	/*@Test
	public void m5()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter username");
		String username = sc.next();
		System.out.println("enter password");
		String pwd = sc.next();

		assertEquals("admin", username);

		assertEquals("admin@123",pwd);
		System.out.println("welcome admin");


	}*/


}
