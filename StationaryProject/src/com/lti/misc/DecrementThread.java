package com.lti.misc;

public class DecrementThread extends Thread {

	VolatileDemo vdemo1= new VolatileDemo();
	
	public VolatileDemo getVdemo1() {
		return vdemo1;
	}

	public void setVdemo1(VolatileDemo vdemo1) {
		this.vdemo1 = vdemo1;
	}

	public DecrementThread(VolatileDemo vdemo1) {
		super();
		this.vdemo1 = vdemo1;
	}

	public void run()
	{
		vdemo1.decrement();
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
	
}
