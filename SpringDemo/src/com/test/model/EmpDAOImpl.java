package com.test.model;

import org.springframework.stereotype.Repository;

@Repository
public class EmpDAOImpl implements IEmpDAO{

	@Override
	public void addEmployee(Employee e) {
		System.out.println("Employee added bro");
		
	}

	@Override
	public void delEmployee(Employee e) {
		System.out.println("employee deleted bro");
	}

}
