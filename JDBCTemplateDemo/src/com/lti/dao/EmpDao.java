package com.lti.dao;
import com.lti.model.*;
import java.util.List;

public interface EmpDao {

	void create(Employee e);
	Employee getEmployee (Integer empid);
	List listEmployees();
	void delete(Integer empid);
	void update(Integer empid, Integer age);
}
