package com.test.app;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.model.*;
import HibernateUtil.HibernateUtil;


//import org.hibernate.cfg.AnnotationConfiguration;

public class Tester implements Serializable{

	public static void main(String [] args) {
		
		/*AnnotationConfiguration config = new AnnotationConfiguration();
		config.configure().buildSessionFactory();
		config.addAnnotatedClass(Customer.class);*/
		
		Customer c1 =  new Customer("Ronaldo","NY",2300,2000);
		Customer c3 =  new Customer("Ronaldinho","NY",230,20);
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(c1);
		System.out.println("customer data saved");
		tx.commit();
		
Query query = session.createQuery("from Customer");
		
		List <Customer> custlist = query.list();
		
		for(Customer customer:custlist)
		{
			System.out.println(customer);
		}
			
		System.out.println("closing session");
		session.close();
		
		
		
		
		Session session2 = factory.openSession();
		Transaction tx1 = session2.beginTransaction();

		Customer c = (Customer) session2.load(Customer.class , c3.getId());
		
		c.setAddress("Mumbai");
		c.setCreditscore(20000);
		c.setRewardpts(455);
		
		session2.saveOrUpdate(c);
		
		query=session2.createQuery("from Customer");
		custlist=query.list();
		tx1.commit();
		session2.close();
			
			
			

	
	}
}
