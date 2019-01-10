package com.lti.jdbc;

public class Departments {
	private int deparment_id;
	private String department_name;
	private int manager_id;
	private int location_id;
	
	public Departments(int deparment_id, String department_name, int manager_id, int location_id) {
		super();
		this.deparment_id = deparment_id;
		this.department_name = department_name;
		this.manager_id = manager_id;
		this.location_id = location_id;
	}

	public int getDeparment_id() {
		return deparment_id;
	}

	public void setDeparment_id(int deparment_id) {
		this.deparment_id = deparment_id;
	}

	public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	public int getManager_id() {
		return manager_id;
	}

	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}

	public int getLocation_id() {
		return location_id;
	}

	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}

	@Override
	public String toString() {
		return "Departments [deparment_id=" + deparment_id + ", department_name=" + department_name + ", manager_id="
				+ manager_id + ", location_id=" + location_id + "]";
	}
	
	
	
	
}
