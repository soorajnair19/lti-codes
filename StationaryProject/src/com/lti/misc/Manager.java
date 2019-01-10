package com.lti.misc;

public class Manager  extends Inheritance1{
	
	private String department_name;

	public String getDepartment_name() {
		return department_name;
	}

	//setter
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	public Manager(int id, String salary, String name, String date) {
		super(id, salary, name, date);
	}

	//tos
	@Override
	public String toString() {
		return "Manager [department_name=" + department_name + "]";
	}

	public Manager(int id, String salary, String name, String date, String department_name) {
		super(id, salary, name, date);
		this.department_name = department_name;
	}

	public Manager() {
		super();
		this.department_name= "Admin";
		
	}



	/*public Manager (Inheritance1 e, String  dname)
	{
		super(id, salary, name, date, dname);
		this.id = e.id;
		this.salary = e.salary;
		this.name = e.name;
		this.date = e.date;
		this.department_name=dname;
	}
	*/
	public void greeting()
	{
		System.out.println("hello manager");
	}
	
	
}
