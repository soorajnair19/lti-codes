package com.hibernatedao.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Bidder {
private int bidid;
private String name;
private double amount;
private float quantity;

public Bidder() {
	super();
	// TODO Auto-generated constructor stub
}



public Bidder(String name, double amount, float quantity) {
	super();
	
	this.name = name;
	this.amount = amount;
	this.quantity = quantity;
}

@Id
@GeneratedValue(generator = "bidgg", strategy=GenerationType.SEQUENCE)
@SequenceGenerator(name="bidgg", sequenceName="bidgg")
public int getBidid() {
	return bidid;
}
public String getName() {
	return name;
}
public double getAmount() {
	return amount;
}
public float getQuantity() {
	return quantity;
}
public void setBidid(int bidid) {
	this.bidid = bidid;
}
public void setName(String name) {
	this.name = name;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public void setQuantity(float quantity) {
	this.quantity = quantity;
}


	
	
}
