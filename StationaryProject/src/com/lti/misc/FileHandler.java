package com.lti.misc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class FileHandler {

	public static void main(String[] args)

	{
		int i=0;
		try(FileInputStream fa = new FileInputStream("D:\\GGLTI\\image1.png");
				FileOutputStream fb = new FileOutputStream("D:\\GGLTI\\image2.png")
				)

		{
			while((i=fa.read())!=-1)
			{
				//System.out.print((char)i);
				fb.write(i);
			}


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
