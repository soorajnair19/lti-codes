package com.hibernate.inheritance;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Module extends Project implements Serializable {
private String mname;

public Module(String mname) {
	super();
	this.mname = mname;
}

public Module() {
	super();
	// TODO Auto-generated constructor stub
}

public String getMname() {
	return mname;
}

public void setMname(String mname) {
	this.mname = mname;
}

}
