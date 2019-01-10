package com.lti.arrays;
import java.util.Arrays;
public class Arraysort 
{
	public static void main(String[] args)
	{
		char var1='a';
		char [ ] vararr = new char[10];
		int [] numss= new int[10];

		for(int i=0; i<10; ++i)
		{
			vararr[i]= 'a';
			numss[i]=(int)vararr[i];
			i++;			
		}
		System.out.println(Arrays.toString(vararr));
		System.out.println(Arrays.toString(numss));


		double [] nums = {10,1,5,4,7};

		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));

	}

}
