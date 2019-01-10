package com.lnt.mvc.service;

import java.util.List;

import com.lnt.mvc.model.*;


public interface IPersonService {

	public void addPerson(Person p);
	public void updatePerson(Person p);
	public List<Person> listPersons();
	public Person getPersonById(int id);
	public void removePerson(int id);
	
}
