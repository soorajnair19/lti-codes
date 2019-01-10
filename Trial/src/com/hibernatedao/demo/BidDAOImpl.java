package com.hibernatedao.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;


import HibernateUtil.HibernateUtil;
import com.hibernatedao.demo.*;


public class BidDAOImpl implements BidI{
	
	SessionFactory sf = HibernateUtil.getSessionFactory();

	public void addBid(Bidder bid) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();		
		
		int id = (Integer) session.save(bid);		
	
		System.out.println("Bid Successfully added with BidId : "+id);
		tx.commit();
		session.close();
		
	}

	public void updateBid(Bidder bid , int bidId) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();	
		
		Transaction tx1 = session.beginTransaction();
		
		Bidder bid1 = (Bidder) session.load(Bidder.class,bidId);
		bid.setBidderId(bidId);
		bid1 = bid;
		session.saveOrUpdate(bid1);
		tx1.commit();
		session.close();
	}

	public void delBid(int bidId) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();	
		
		Transaction tx1 = session.beginTransaction();
		
		Bidder bid1 = (Bidder) session.load(Bidder.class,bidId);	
		session.delete(bid1);
		
		tx1.commit();
		session.close();
	}

	public List<Bidder>  listAllBidder() {
		// TODO Auto-generated method stub
		Session session = sf.openSession();	
		
		Transaction tx = session.beginTransaction();
		
		Query query = session.createQuery("from Bid");
		List<Bid> c1 = query.list();	
		
		return c1;
	}

	public Bidder listBidderById(int bidId) {
		// TODO Auto-generated method stub
		List<Bidder> c = new ArrayList<Bidder>();
		Bidder b = new Bidder() ;
		Session session = sf.openSession();	
		
		Transaction tx = session.beginTransaction();	
		
		Criteria custcriteria=session.createCriteria(Bidder.class);
		custcriteria.add(Restrictions.eq("bidId", bidId));
		c=custcriteria.list();	
		
		for(Bidder cust : c)
		{
			b = cust;
		}  
		return b;
	}
	

}