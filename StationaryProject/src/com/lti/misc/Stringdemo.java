package com.lti.misc;

public class Stringdemo {
public static void main(String[] args)
{
StringBuilder sb1 = new StringBuilder();
sb1.append("this is a new string");
System.out.println(sb1.length()+"length");
System.out.println(sb1.capacity()+"capacity");
sb1.ensureCapacity(100);
System.out.println(sb1.capacity());
System.out.println(sb1.charAt(10));

sb1.reverse();
System.out.println(sb1);






}
}
