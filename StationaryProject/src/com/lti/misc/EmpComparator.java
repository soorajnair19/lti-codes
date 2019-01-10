package com.lti.misc;
import java.util.Comparator;

public class EmpComparator implements Comparator<Emp>{
	@Deprecated
	public int compare(Emp e1, Emp e2)
	{
		if(e1.getName()==e2.getName())
		{
			return 0;
		}
	}
	
}
