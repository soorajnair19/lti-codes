package com.lti.dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.lti.model.*;
@Component
public class EmployeeDaoImpl implements EmpDao {

	@Autowired
	private JdbcTemplate jdbcTemplateObject;
	
	public void setJdbcTemplateObject(JdbcTemplate jdbcTemplateObject)
	{
		this.jdbcTemplateObject = jdbcTemplateObject;
		
	}
 
	@Override
	public void create(Employee e)
	{
		String SQL = "INSERT INTO Employee(name,age,salary) VALUES (?,?,?)";
		jdbcTemplateObject.update(SQL, new Object[] {e.getName(),e.getAge(),e.getSalary()});
		System.out.println("Employee created "+e.getName()+" Age= "+e.getAge()+" Salary= "+e.getSalary());
		
	}
		
	@Override
	public Employee getEmployee (Integer empid)
	{
		String SQL = "SELECT * FROM Employee WHERE id=?";
		Employee employee = (Employee) jdbcTemplateObject.queryForObject
				(SQL,new Object[] {empid}, new EmployeeMapper());
		return employee;

	}
		
		
	@Override
	public List listEmployees()
	{
		String SQL="SELECT * FROM Employee";
		List employees = (List) jdbcTemplateObject.query(SQL, new EmployeeMapper());
		return employees;
	}
		
	
	@Override
	public void delete(Integer empid)
	{
		String SQL="DELETE FROM Employee WHERE id=?";
		jdbcTemplateObject.update(SQL, new Object[] {empid});
		System.out.println("Deleted record with Empid= "+empid);
	}
	
	@Override
	public void update(Integer empid, Integer age)
	{
		String SQL="UPDATE Employee SET age=? WHERE id=?";
		jdbcTemplateObject.update(SQL, new Object[] {age, empid});
		System.out.println("Updated record with Empid= "+empid);
	}
	
	
		
		
	}
	

