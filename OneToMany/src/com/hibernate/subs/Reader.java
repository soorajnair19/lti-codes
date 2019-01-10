package com.hibernate.subs;

import java.util.List;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Reader {
	@Id
	@GeneratedValue
	private int readerid;
	private String email;
	private String firstName;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="Reader_Sub", 
	joinColumns= {@JoinColumn(name="ReaderID", referencedColumnName="readerid")}, inverseJoinColumns= {
			@JoinColumn(name="SubscriptionID", referencedColumnName="subscriptionId")
	}
			
			
			)
	private List <Subscription> subscriptions;

	public int getReaderid() {
		return readerid;
	}

	public String getEmail() {
		return email;
	}

	public String getFirstName() {
		return firstName;
	}

	public List<Subscription> getSubscriptions() {
		return subscriptions;
	}

	public void setReaderid(int readerid) {
		this.readerid = readerid;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setSubscriptions(List<Subscription> subscriptions) {
		this.subscriptions = subscriptions;
	}

	public Reader(int readerid, String email, String firstName, List<Subscription> subscriptions) {
		super();
		this.readerid = readerid;
		this.email = email;
		this.firstName = firstName;
		this.subscriptions = subscriptions;
	}

	@Override
	public String toString() {
		return "Reader [readerid=" + readerid + ", email=" + email + ", firstName=" + firstName + ", subscriptions="
				+ subscriptions + "]";
	}

	public Reader() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
