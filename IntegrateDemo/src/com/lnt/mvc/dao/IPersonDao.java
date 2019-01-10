package com.lnt.mvc.dao;
import java.util.List;

import com.lnt.mvc.model.Person;

public interface IPersonDao {

	public void addPerson(Person p);//insert
	public void updatePerson(Person p);//update/modify
	public List<Person> listPersons();//retrieve/listAll
	public Person getPersonById(int id);//search
	public void removePerson(int id);//delete/remove
}
