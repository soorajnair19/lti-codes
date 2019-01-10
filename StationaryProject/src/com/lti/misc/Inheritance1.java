package com.lti.misc;
import java.time.LocalDate;

public class Inheritance1
{
	protected int id;
	protected String salary;
	protected String name;
	protected String date;
	public Inheritance1(int id, String salary, String name, String date) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.date = date;
	}

	public Inheritance1()
	{
		super();
	}
	
	@Override
	public String toString() {
		return "Inheritance1 [id=" + id + ", salary=" + salary + ", name=" + name + ", date=" + date + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	

	public void greeting()
	{
		System.out.println("hello employee");
	}
}


