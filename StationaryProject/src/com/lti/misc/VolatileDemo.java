package com.lti.misc;

public class VolatileDemo {
volatile int x;


public int getX() {
	return x;
}



public void setX(int x) {
	this.x = x;
}



public void increment()
{
		this.x = x+5;
}

public void decrement()
{
	this.x=x-3;
}

}
