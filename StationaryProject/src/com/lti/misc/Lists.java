package com.lti.misc;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Lists {
public static void main(String [] args)
{

	List <Double> listofsals = new ArrayList<>();
	listofsals.add(3343.34);
	listofsals.add(4444.66);
	listofsals.add(2567.56);

	Iterator iterator = listofsals.iterator();
	while (iterator.hasNext())
	{
		Double sal = (Double)iterator.next();
		System.out.println(sal);
		
	}

}
}
