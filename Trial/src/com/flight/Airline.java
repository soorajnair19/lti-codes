package com.flight;

public class Airline {
private int airlineId;
private String airlineName;
public Airline(String airlineName) {
	super();
	this.airlineName = airlineName;
}
public Airline() {
	super();
	// TODO Auto-generated constructor stub
}
public int getAirlineId() {
	return airlineId;
}
public String getAirlineName() {
	return airlineName;
}
public void setAirlineId(int airlineId) {
	this.airlineId = airlineId;
}
public void setAirlineName(String airlineName) {
	this.airlineName = airlineName;
}
@Override
public String toString() {
	return "Airline [airlineId=" + airlineId + ", airlineName=" + airlineName + "]";
}



}
