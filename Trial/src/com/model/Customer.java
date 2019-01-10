package com.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="customer")
@SecondaryTable(name="custdetails")
public class Customer implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
int id;

String name;
@Column(name="custaddress",table="custdetails")
String address;
@Column(name="score",table="custdetails")

int creditscore;
public Customer(String name, String address, int creditscore, int rewardpts) {
	super();
	this.name = name;
	this.address = address;
	this.creditscore = creditscore;
	this.rewardpts = rewardpts;
}
@Column(name="reward",table="custdetails")

int rewardpts;
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}


@Id
@GeneratedValue(generator="cs",strategy=GenerationType.SEQUENCE)
@SequenceGenerator(name="cs", sequenceName="cs")
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public String getAddress() {
	return address;
}
public int getCreditscore() {
	return creditscore;
}
public int getRewardpts() {
	return rewardpts;
}
public void setId(int id) {
	this.id = id;
}
public void setName(String name) {
	this.name = name;
}
public void setAddress(String address) {
	this.address = address;
}
public void setCreditscore(int creditscore) {
	this.creditscore = creditscore;
}
public void setRewardpts(int rewardpts) {
	this.rewardpts = rewardpts;
}
@Override
public String toString() {
	return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", creditscore=" + creditscore
			+ ", rewardpts=" + rewardpts + "]";
}











}
