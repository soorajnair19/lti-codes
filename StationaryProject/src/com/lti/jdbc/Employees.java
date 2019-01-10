package com.lti.jdbc;

import com.lti.misc.Address;
import java.time.LocalDate;


public class Employees {
		private int employee_id;
		private String employee_name;
		private double salary;
		private LocalDate hire_date;
		private Address address;
		private LocalDate dob;
		private Departments dept_id;
		public Employees(int employee_id, String employee_name, double salary, LocalDate hire_date, Address address,
				LocalDate dob, Departments dept_id) {
			super();
			this.employee_id = employee_id;
			this.employee_name = employee_name;
			this.salary = salary;
			this.hire_date = hire_date;
			this.address = address;
			this.dob = dob;
			this.dept_id = dept_id;
		}
		public int getEmployee_id() {
			return employee_id;
		}
		public String getEmployee_name() {
			return employee_name;
		}
		public double getSalary() {
			return salary;
		}
		public LocalDate getHire_date() {
			return hire_date;
		}
		public Address getAddress() {
			return address;
		}
		public LocalDate getDob() {
			return dob;
		}
		public Departments getDept_id() {
			return dept_id;
		}
		public void setEmployee_id(int employee_id) {
			this.employee_id = employee_id;
		}
		public void setEmployee_name(String employee_name) {
			this.employee_name = employee_name;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public void setHire_date(LocalDate hire_date) {
			this.hire_date = hire_date;
		}
		public void setAddress(Address address) {
			this.address = address;
		}
		public void setDob(LocalDate dob) {
			this.dob = dob;
		}
		public void setDept_id(Departments dept_id) {
			this.dept_id = dept_id;
		}
		@Override
		public String toString() {
			return "Employees [employee_id=" + employee_id + ", employee_name=" + employee_name + ", salary=" + salary
					+ ", hire_date=" + hire_date + ", address=" + address + ", dob=" + dob + ", dept_id=" + dept_id
					+ "]";
		}
		
		
		
		
}
