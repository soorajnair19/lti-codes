package com.model;

import javax.persistence.Embeddable;

@Embeddable
public class SchoolDetails {
private String address;
private int	scount;
private String isPublicSchool;
public SchoolDetails() {
	super();
	// TODO Auto-generated constructor stub
}
public SchoolDetails(String address, int scount, String isPublic) {
	super();
	this.address = address;
	this.scount = scount;
	this.isPublicSchool = isPublic;
}
public String getAddress() {
	return address;
}
public int getScount() {
	return scount;
}
public String isPublic() {
	return isPublicSchool;
}
public void setAddress(String address) {
	this.address = address;
}
public void setScount(int scount) {
	this.scount = scount;
}
public void setPublic(String isPublic) {
	this.isPublicSchool = isPublic;
}
@Override
public String toString() {
	return "SchoolDetails [address=" + address + ", scount=" + scount + ", isPublic=" + isPublicSchool + "]";
}



}
