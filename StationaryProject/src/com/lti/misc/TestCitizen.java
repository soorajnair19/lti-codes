package com.lti.misc;
import java.io.*;
import java.time.LocalDate;

public class TestCitizen {	
public static void main(String []args)
{

Address address1 = new Address("The address","MGM Rd","Mumbai","400601");
LocalDate date1= LocalDate.of(2002,02,02);

Address address2 = new Address("The address","GG Rd","Delhi","400602");
LocalDate date2= LocalDate.of(2002,10,02);

Address address3 = new Address("The address","SRJ Rd","Thane","400604");
LocalDate date3= LocalDate.of(2002,10,10);


Citizen citizen1= new Citizen("1111_2222_3333","Amit",address1,date1);
Citizen citizen2= new Citizen("1111_2222_7777","Samar",address2,date2);
Citizen citizen3 = new Citizen("1111_2222_5555","Felix",address3,date3);


System.out.println(citizen1);
System.out.println(citizen2);
System.out.println(citizen3);

//Citizen [] citizen = {citizen1,citizen2,citizen3};
	
	try(FileOutputStream fos = new FileOutputStream("D:\\GGLTI\\gg.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			)
	{
		oos.writeObject(citizen1);
		oos.writeObject(citizen2);
		oos.writeObject(citizen3);
	}
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	
	

}
}
