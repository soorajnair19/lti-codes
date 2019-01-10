package com.test.model;

import java.io.Serializable;
import org.springframework.stereotype.Component;

@Component
public class Department implements Serializable{
private int depid;
private String deptName;
@Override
public String toString() {
	return "Department [depid=" + depid + ", deptName=" + deptName + "]";
}
public int getDepid() {
	return depid;
}
public String getDeptName() {
	return deptName;
}
public void setDepid(int depid) {
	this.depid = depid;
}
public void setDeptName(String deptName) {
	this.deptName = deptName;
}
public Department() {
	super();
	// TODO Auto-generated constructor stub
}
public Department(int depid, String deptName) {
	super();
	this.depid = depid;
	this.deptName = deptName;
}
	


}
