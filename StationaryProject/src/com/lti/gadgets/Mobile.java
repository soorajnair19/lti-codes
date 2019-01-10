package com.lti.gadgets;

public class Mobile extends Gadget {
	private String OS;
	private String model;
	private CoverColor covercolor;
	
public Mobile(String OS,CoverColor c,String model)
	{	
		super();
		this.covercolor = covercolor;
		this.model= model;
		this.OS= OS;	
	}
	
	private void closeAllApps()
	{
		System.out.println("Shutting down");
	}

	private void bootloader()
	{
		System.out.println("Turning on");
	}
	
	public void turnOn()
	{
		bootloader();
	}
	
	public void turnOff()
	{
		closeAllApps();
	}

	@Override
	public String toString() {
		return "Mobile [OS=" + OS + ", model=" + model + "]";
	}
 
	
 
 
 
 
 
 
 
}	
