package com.flight;

import java.util.List;

public class Flight {
private int flightId;
private String fromSector;
private String toSector;
private int capacity;

private List <Airline> airlineList;


public List<Airline> getAirlineList() {
	return airlineList;
}
public void setAirlineList(List<Airline> airlineList) {
	this.airlineList = airlineList;
}
public Flight() {
	super();
	// TODO Auto-generated constructor stub
}
public Flight(int flightid, String fromSector, String toSector, int capacity) {
	super();
	this.flightId=flightid;
	this.fromSector = fromSector;
	this.toSector = toSector;
	this.capacity = capacity;
}
public int getFlightId() {
	return flightId;
}
public String getFromSector() {
	return fromSector;
}
public String getToSector() {
	return toSector;
}
public int getCapacity() {
	return capacity;
}
public void setFlightId(int flightid) {
	this.flightId = flightid;
}
public void setFromSector(String fromSector) {
	this.fromSector = fromSector;
}
public void setToSector(String toSector) {
	this.toSector = toSector;
}
public void setCapacity(int capacity) {
	this.capacity = capacity;
}
@Override
public String toString() {
	return "Flight [flightid=" + flightId + ", fromSector=" + fromSector + ", toSector=" + toSector + ", capacity="
			+ capacity + ", airlineList=" + this.getAirlineList() + "]";
}




}
