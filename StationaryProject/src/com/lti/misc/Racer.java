package com.lti.misc;

public class Racer extends Thread{
int i;

	public Racer(int i) {
	super();
	this.i = i;
}

	public void run()
	{
		for(int j=0;j<10;j++)
		{
			System.out.println(this.i * j);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println("Sleep Interrupted");
			}
		
		}
	}
	
}
