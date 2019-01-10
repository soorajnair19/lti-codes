package com.lti.model;

import java.io.Serializable;

public class PersonData implements Serializable {
	public PersonData(int pdid, float salary, String aadharnum) {
		super();
		this.pdid = pdid;
		this.salary = salary;
		this.aadharnum = aadharnum;
	}
	private int pdid;
	private float salary;
	private String aadharnum;
	public int getPdid() {
		return pdid;
	}
	public float getSalary() {
		return salary;
	}
	public String getAadharnum() {
		return aadharnum;
	}
	public void setPdid(int pdid) {
		this.pdid = pdid;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public void setAadharnum(String aadharnum) {
		this.aadharnum = aadharnum;
	}
	@Override
	public String toString() {
		return "PersonData [pdid=" + pdid + ", salary=" + salary + ", aadharnum=" + aadharnum + "]";
	}
	public PersonData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
