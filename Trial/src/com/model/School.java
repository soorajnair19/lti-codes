package com.model;

import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class School implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int scid;
	private String scname;
	private SchoolDetails schooldetail;
	
	@Embedded
	public SchoolDetails getSchooldetail() {
		return schooldetail;
	}


	public void setSchooldetail(SchoolDetails schooldetail) {
		this.schooldetail = schooldetail;
	}


	public School() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public School(String scname) {
		super();
		
		this.scname = scname;
	}
	
	@Id
	public int getScid() {
		return scid;
	}
	public String getScname() {
		return scname;
	}
	public void setScid(int scid) {
		this.scid = scid;
	}
	public void setScname(String scname) {
		this.scname = scname;
	}

	@Override
	public String toString() {
		return "School [scid=" + scid + ", scname=" + scname + "]";
	}
	

}
