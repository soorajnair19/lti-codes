package com.hibernate.inheritance;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Project implements Serializable {
private int pid;
private String pname;
private LocalDate startdate;
public Project() {
	super();
	// TODO Auto-generated constructor stub
}
public Project(String pname, LocalDate startdate) {
	super();
	
	this.pname = pname;
	this.startdate = startdate;
}

@Id
@GeneratedValue(generator = "scdet", strategy=GenerationType.SEQUENCE)
@SequenceGenerator(name="scdet", sequenceName="scdet")
public int getPid() {
	return pid;
}
public String getPname() {
	return pname;
}
public LocalDate getStartdate() {
	return startdate;
}
public void setPid(int pid) {
	this.pid = pid;
}
public void setPname(String pname) {
	this.pname = pname;
}
public void setStartdate(LocalDate startdate) {
	this.startdate = startdate;
}
@Override
public String toString() {
	return "Project [pid=" + pid + ", pname=" + pname + ", startdate=" + startdate + "]";
}




}