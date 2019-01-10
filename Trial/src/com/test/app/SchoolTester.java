package com.test.app;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.model.School;
import com.model.SchoolDetails;

import HibernateUtil.HibernateUtil;

public class SchoolTester implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		School school = new School("Pillais");
		SchoolDetails schooldetail = new SchoolDetails();
		schooldetail.setAddress("Panvel");
		schooldetail.setPublic("true");
		schooldetail.setScount(500);
		school.setSchooldetail(schooldetail);
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		
		Transaction tx4 = session.beginTransaction();
		
		session.save(school);
		System.out.println("saving school object");
		
		tx4.commit();
		session.close();
	}

}
