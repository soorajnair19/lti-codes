package com.lti.misc;

public class UncheckedExceptionHdlg {
public static void main(String[] args)
{
try
{
int z = 50/0;	
}

catch (NumberFormatException ne)
{
System.out.println("format exception");
}

catch(ArithmeticException ae)
{
System.out.println("cannot divide by zero");
}

catch (Exception e)
{
System.out.println("some exception");
}

System.out.println("regular code");
System.out.println("some more code");

}
}
