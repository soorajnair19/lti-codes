package com.lti.misc;

public class Sender extends Thread{
	Data data;
	Sender (Data data)
	{this.data=data;}


	public void run()
	{
		String nm=Thread.currentThread().getName();
		synchronized(data)
		{	
			
			System.out.println(nm+"Thread started");	
			data.setMessage("java processing multithreads");
			System.out.println("message is sent");
			
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			
			data.notifyAll();
			System.out.println("notification sent to all waiting threads");


		}}}


