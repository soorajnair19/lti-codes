package com.model;

import java.io.Serializable;

public class Bee implements Serializable{
private int beeId;
private String beeName;
private Honey honey;
public int getBeeId() {
	return beeId;
}
public void setBeeId(int beeId) {
	this.beeId = beeId;
}
public String getBeeName() {
	return beeName;
}
public void setBeeName(String beeName) {
	this.beeName = beeName;
}
public Honey getHoney() {
	return honey;
}
public void setHoney(Honey honey) {
	this.honey = honey;
}
@Override
public String toString() {
	return "Bee [beeId=" + beeId + ", beeName=" + beeName + ", honey=" + honey + "]";
}
public Bee(int beeId, String beeName, Honey honey) {
	super();
	this.beeId = beeId;
	this.beeName = beeName;
	this.honey = honey;
}
public Bee() {
	super();
}



}
