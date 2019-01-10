package model;

public class User {
String first_name;
public User() {
	super();
	// TODO Auto-generated constructor stub
}

String salary;
public String getUsername() {
	return first_name;
}
public String getPassword() {
	return salary;
}
public void setUsername(String username) {
	this.first_name = username;
}
public void setPassword(String password) {
	this.salary = password;
}

public User(String username, String password) {
	this.first_name = username;
	this.salary = password;
}




}
