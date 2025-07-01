package com.abigail.todolist;

public enum Frequency {

	WEEKLY ("Weekly"), 
	HOURLY("Hourly"),
	DAILY("Daily"),
	MONTHLY("Monthly");
private final String display;

public static  Frequency ignoreCase(String name) {
	return valueOf(name.toUpperCase());
}
	Frequency(String display) {

	this.display=display;
	}
	
	@Override
	public String toString() {
		return this.display;
	}
	
}
