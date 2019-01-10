package com.lti.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person implements Serializable {
	@Id
	@GeneratedValue
private int personId;
private String name;
@OneToOne(cascade=CascadeType.ALL)
private PersonData pdetails;



public PersonData getPdetails() {
	return pdetails;
}
public void setPdetails(PersonData pdetails) {
	this.pdetails = pdetails;
}
public int getPersonId() {
	return personId;
}
public String getName() {
	return name;
}
public void setPersonId(int personId) {
	this.personId = personId;
}
public void setName(String name) {
	this.name = name;
}
public Person(int personId, String name) {
	super();
	this.personId = personId;
	this.name = name;
}
public Person() {
	super();
	// TODO Auto-generated constructor stub
}

}
