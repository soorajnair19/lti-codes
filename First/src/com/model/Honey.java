package com.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Honey implements Serializable {

	private int honeyId;
	private String honeyName;
	private String taste;
	private Set<Bee> bees = new HashSet<>();
	
	
	



	@Override
	public String toString() {
		return "Honey [honeyId=" + honeyId + ", honeyName=" + honeyName + ", taste=" + taste + ", bees=" + bees + "]";
	}



	public int getHoneyId() {
		return honeyId;
	}



	public void setHoneyId(int honeyId) {
		this.honeyId = honeyId;
	}



	public String getHoneyName() {
		return honeyName;
	}



	public void setHoneyName(String honeyName) {
		this.honeyName = honeyName;
	}



	public String getTaste() {
		return taste;
	}



	public void setTaste(String taste) {
		this.taste = taste;
	}



	public Set<Bee> getBees() {
		return bees;
	}



	public void setBees(Set<Bee> bees) {
		this.bees = bees;
	}



	public Honey() {
		// TODO Auto-generated constructor stub
	}

}
