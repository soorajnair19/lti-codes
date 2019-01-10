package com.lti.hibernatedemos;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Employee {

private int id;
private String name;
private String email;
private boolean isPermanent;
private Date emplogin;
private Calendar empjoindate;
private String password;

public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Id
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public String getEmail() {
	return email;
}
public boolean isPermanent() {
	return isPermanent;
}
public Date getEmplogin() {
	return emplogin;
}

@Temporal(TemporalType.DATE)
public Calendar getEmpjoindate() {
	return empjoindate;
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
public void setPermanent(boolean isPermanent) {
	this.isPermanent = isPermanent;
}
public void setEmplogin(Date emplogin) {
	this.emplogin = emplogin;
}
@Temporal(TemporalType.TIMESTAMP)
public void setEmpjoindate(Calendar empjoindate) {
	this.empjoindate = empjoindate;
}public Employee() {
	super();
	// TODO Auto-generated constructor stub
}




}
