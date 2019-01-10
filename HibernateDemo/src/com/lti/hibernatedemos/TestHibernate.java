package com.lti.hibernatedemos;

import java.util.GregorianCalendar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestHibernate {
public static void main(String args[]) {
	
	Employee e1 = new Employee();
	
	Configuration config = new Configuration();
	SessionFactory sfactory = config.configure().buildSessionFactory();
	Session session = sfactory.openSession();
	
	Transaction tx = session.beginTransaction();
	e1.setEmail("gg@gmail.com");
	e1.setId(1);
	e1.setName("Virat");
	e1.setEmpjoindate(new GregorianCalendar(2018,10,8));
	e1.setPassword("password");
	
	session.save(e1);
	
	tx.commit();
	session.close();
	
	e1.setEmail("aa@gmail.com");
	e1.setEmail("dd.gmail.com");
	   
	Session session1= sfactory.getCurrentSession();
	
	Employee e2= session1.load(Employee.class, id);
	System.out.println("before changes"+e2);
	session1.saveOrUpdate(e1);
	 System.out.println("after changes");
	 Employee e3=session1.load(Employee.class, id);
}
}
