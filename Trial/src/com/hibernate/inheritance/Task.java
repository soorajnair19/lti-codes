package com.hibernate.inheritance;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Task extends Module implements Serializable {
private String tname;

public Task() {
	super();
	// TODO Auto-generated constructor stub
}

public Task(String tname) {
	super();
	this.tname = tname;
}

public String getTname() {
	return tname;
}

public void setTname(String tname) {
	this.tname = tname;
}


}
