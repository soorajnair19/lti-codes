package com.lti.misc;
import java.io.Serializable;
import java.time.*;

public class Citizen implements Serializable {
private String aadharId;
private String name;
private Address address;
private LocalDate dob;

public String getAadharId() {
	return aadharId;
}

public void setAadharId(String aadharId) {
	this.aadharId = aadharId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

public LocalDate getDob() {
	return dob;
}

public void setDob(LocalDate dob) {
	this.dob = dob;
}

public Citizen(String aadharId, String name, Address address, LocalDate dob) {
	super();
	this.aadharId = aadharId;
	this.name = name;
	this.address = address;
	this.dob = dob;
}

@Override
public String toString() {
	return "Citizen [aadharId=" + aadharId + ", name=" + name + ", address=" + address + ", dob=" + dob + "]";
}






}

