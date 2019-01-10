package com.lnt.mvc.service;
import java.util.List;

import com.lnt.mvc.dao.*;
import com.lnt.mvc.model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//@Service
public class PersonServiceImpl implements IPersonService {
	private IPersonDao personDao;
//setter method for personDao
	@Autowired
	public void setPersonDao(IPersonDao personDao) {
		this.personDao = personDao;
	}
	@Override
	@Transactional
	public void addPerson(Person p) {
		this.personDao.addPerson(p);
	}
	@Override
	@Transactional
	public void updatePerson(Person p) {
		this.personDao.updatePerson(p);
	}
	@Override
	@Transactional
	public List<Person> listPersons() {
		return this.personDao.listPersons();
	}
	@Override
	@Transactional
	public Person getPersonById(int id) {
		return this.personDao.getPersonById(id);
	}
	@Override
	@Transactional
	public void removePerson(int id) {
		this.personDao.removePerson(id);
	}
}
