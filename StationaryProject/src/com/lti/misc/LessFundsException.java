package com.lti.misc;

public class LessFundsException extends Exception {
private String message;

public LessFundsException(String message) {
	super();
	this.message = message;
}

public String getMessage() {
	return message;
}



	
}
