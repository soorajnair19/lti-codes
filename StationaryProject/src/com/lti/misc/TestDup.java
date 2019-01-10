package com.lti.misc;

class TestDup
{
	  static int x = 9;
    public static void main(String args[])
    {
       
        if (x == 9) 
        { 
            int x = 8;
            System.out.println(x);
        }
    } 
}