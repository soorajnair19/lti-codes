package com.lti.misc;
import java.io.*;

public class FactoryClient {
	public static void main(String[] args) {
		AnimalFactory factory = new AnimalFactory();
		Animal animal = null;
		try(InputStreamReader is = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(is))
				{
				System.out.println("Enter the type: Herbivores/Carnivores");
				String type = br.readLine();
				animal = factory.createAnimal(type);
				System.out.println("Animal Created");
				animal.eat();
				}
				
		 catch(IOException e)
        {
            e.printStackTrace();
        }

	}

}
