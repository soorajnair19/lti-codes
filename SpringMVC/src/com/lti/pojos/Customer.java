package com.lti.pojos;

public class Customer {
private int id;
private String name;
private String email;
private double creditallowed;
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
public Customer(int id, String name, String email, double creditallowed) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.creditallowed = creditallowed;
}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public String getEmail() {
	return email;
}
public double getCreditallowed() {
	return creditallowed;
}
public void setId(int id) {
	this.id = id;
}
public void setName(String name) {
	this.name = name;
}
public void setEmail(String email) {
	this.email = email;
}
public void setCreditallowed(double creditallowed) {
	this.creditallowed = creditallowed;
}
@Override
public String toString() {
	return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", creditallowed=" + creditallowed + "]";
}



}
