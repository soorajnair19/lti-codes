package com.lti.misc;
import java.io.*;
import java.util.*;

public class ObjectInput {

	public static void main(String[] args) {
		List <Citizen> citizenlist = new ArrayList <>();
		try(FileInputStream fis = new FileInputStream("D:\\GGLTI\\gg.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);
				)
		{
			while(true)
		{
			Citizen citizen =(Citizen) ois.readObject();
			citizenlist.add(citizen);
			System.out.println(citizenlist);
		}
		}
		
		catch(Exception e)
		{
			System.out.println("file ended");
		}
		
	}

}
