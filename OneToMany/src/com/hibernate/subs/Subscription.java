package com.hibernate.subs;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Subscription {
	@Id
	@GeneratedValue
	private int subscriptionid;
	private String title;
	
	@ManyToMany(cascade=CascadeType.ALL, mappedBy="subscriptions")
	
	private List <Reader> readers;

	public int getSubscriptionid() {
		return subscriptionid;
	}

	public String getTitle() {
		return title;
	}

	public List<Reader> getReaders() {
		return readers;
	}

	public void setSubscriptionid(int subscriptionid) {
		this.subscriptionid = subscriptionid;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setReaders(List<Reader> readers) {
		this.readers = readers;
	}

	public Subscription() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Subscription(int subscriptionid, String title, List<Reader> readers) {
		super();
		this.subscriptionid = subscriptionid;
		this.title = title;
		this.readers = readers;
	}

	@Override
	public String toString() {
		return "Subscription [subscriptionid=" + subscriptionid + ", title=" + title + ", readers=" + readers + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
