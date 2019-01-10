package com.test.app;

import java.beans.Customizer;
import java.time.LocalDate;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.hibernate.inheritance.Module;
import com.hibernate.inheritance.Project;
import com.hibernate.inheritance.Task;
import com.model.Customer;

import HibernateUtil.HibernateUtil;

public class InheritTest {

	public static void main(String[] args) {
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		
		Transaction tx =  session.beginTransaction();
		
		
		Project p1 = new Project();
		p1.setPname("Banking");
		p1.setPid(p1.getPid());
		p1.setStartdate(LocalDate.of(2018,3,3));
		int id = (int)session.save(p1);
		
		session.save(p1);
		
		Module m1=new Module();
		m1.setMname("Withdrawal");
		session.save(m1);
		
		Task t1 = new Task();
		t1.setTname("ExceptionHandling");
		t1.setPid(id);
		t1.setMname(m1.getMname());
		session.save(t1);
		
		Project p2= new Project();
		p2.setStartdate(LocalDate.of(2017,3,3));
		p2.setPname("Ecommerce");
		int idp2=(int)session.save(p2);
		
		Module m2 = new Module();
		m2.setMname("Shoppingcart");
		m2.setPid(idp2);
		
		session.save(m2);
		
		
		Task t2 = new Task();
		t2.setPid(p2.getPid());
		t2.setMname(m2.getMname());
		t2.setTname("documentation");
		session.save(t2);
		tx.commit();
		
		String hql = "from Project p";
		
		Query query = session.createQuery(hql);
		List<Project> plist = query.list();
		for(Project p:plist)
		{
			System.out.println(p);
		}
		
		System.out.println("closing session");
		session.close();
		
		
		SessionFactory factory1 = HibernateUtil.getSessionFactory();
		Session session2 = factory1.openSession();
		
		Transaction tx1 =  session2.beginTransaction();
		Criteria custcriteria = session2.createCriteria(Customer.class);
		custcriteria.add(Restrictions.gt("creditScore", 1000));
		List <Customer> custlist = custcriteria.list();
		
		System.out.println("Customers having credit score > 1000 are listed:");
		
		for(Customer c10: custlist)
		{
			System.out.println(c10);
		}
		
		
		tx1.commit();
		session2.close();
		
		
		
	}

}
