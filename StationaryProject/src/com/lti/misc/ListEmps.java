package com.lti.misc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class ListEmps{

	public static void main(String[] args)
	{
		Emp e1 = new Emp(231,"Dholu",33343);
		Emp e2 = new Emp(233,"Bholu",10000);
		Emp e3 = new Emp(233,"Bheem",40000);
		
		Emp e4 = new Emp(234,"Raju",70000);
		Emp e5 = new Emp(236,"Kaliya",60000);
		Emp e6 = new Emp(237,"Chutki",74343);
	
		List <Emp> emplist = new ArrayList<>();

		emplist.add(e1);
		emplist.add(e2);
		emplist.add(e3);
	
		
		List <Emp> temp_emplist = new ArrayList<>();
		temp_emplist.add(e4);
		temp_emplist.add(e5);
		temp_emplist.add(e6);
		

		
		List <Emp> allEmployees = new LinkedList<>();
		allEmployees.addAll(emplist);
		allEmployees.addAll(temp_emplist);
		
		Iterator<Emp> iterator = allEmployees.iterator();
		
		while(iterator.hasNext())
		{
			Emp empp = (Emp) iterator.next();
			System.out.println(empp);
		}
		
		allEmployees.remove(2);
		System.out.println("after removing emp");
		for (Emp e: allEmployees)
		{
			System.out.println(e);
		}
		System.out.println("Emplist is" +emplist);
		System.out.println("Templist is"+temp_emplist);
		
		System.out.println("After sorting by salary");
		Collections.sort(allEmployees);
		for(Emp e:allEmployees)
		System.out.println(e);
		
	
		/*System.out.println("After comparing Id");
		Collections.sort(allEmployees, new EmpIdComparator());
		for(Emp e:allEmployees)
		System.out.println(e);*/
		
		Map <String,Emp> empMap = new HashMap<>();
		empMap.put("Admin",e1);
		empMap.put("IT",e2);
		empMap.put("IT",e3);
		System.out.println("Complete Set");
		System.out.println(empMap.entrySet());
		System.out.println("Only the values");
		System.out.println(empMap.values());
		System.out.println("Only the keys");
		System.out.println(empMap.keySet());
	}
}
