package com.lti.arrays;

public class BookArray {

	public static void main(String[] args) {

			
	}

	Pen [] penarr = new Pen[3];
	for(int i=0;i<penarr.length;i++)
	{
		penarr[i]=new Pen();
	}
	
	penarr[0].setId(1234);
	penarr[0].setBrand("DW");
	penarr[0].setPrice(500);
	
	
	
}
