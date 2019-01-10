package com.lti.misc;

public class TesterRace {
	public static void main(String [] args)
	{
	Racer r1 = new Racer(10);
	r1.start();

	Racer r2= new Racer(1);
	r2.start();
}
}