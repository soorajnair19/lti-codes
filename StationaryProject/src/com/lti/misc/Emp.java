package com.lti.misc;

public class Emp implements Comparable <Emp> {
private int id;
private String name;
private double salary;
public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

@AuthorOfTheCode(name="Bhuvan",id=1,email="bb@yt.com")
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public Emp(int id, String name, double salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}
@Override
public String toString() {
	return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}
public Emp() {
	super();
	// TODO Auto-generated constructor stub
}





public int compareTo(Emp e2) {
	if(this.salary == e2.salary)
	{
		return 0;
	}
	else if(this.salary>e2.salary)
	{
		return 1;
	}
	else
	{
		return -1;
	}
	
}




}

