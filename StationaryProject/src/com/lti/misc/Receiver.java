package com.lti.misc;

public class Receiver extends Thread{
	private Data data;

	public void run()
	{
		System.out.println("Waiting for the data bro");
		String nm=Thread.currentThread().getName();
		System.out.println(nm)
		;
		synchronized (data) {
			try
			{
				data.wait();
				System.out.println("still waiting bro");
				data.wait(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println("wait interrupted bro");	
			}
		}

		System.out.println("Received the data bro"+data.getMessage());
	}

	public Receiver(Data data) {
		super();
		this.data = data;
	}

}
