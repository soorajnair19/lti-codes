package com.lti.misc;

public class IncrementThread extends Thread {

	VolatileDemo vdemo= new VolatileDemo();
	
	public VolatileDemo getVdemo() {
		return vdemo;
	}

	public void setVdemo(VolatileDemo vdemo) {
		this.vdemo = vdemo;
	}

	public IncrementThread(VolatileDemo vdemo) {
		super();
		this.vdemo = vdemo;
	}

	public void run()
	{
		vdemo.increment();
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
