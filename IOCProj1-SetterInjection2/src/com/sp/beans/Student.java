package com.sp.beans;

public class Student {

	// bean properties
	private String name ;

	// setter & getter method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//business logic
	public void displayInfo() {
		System.out.println("Hello::"+name);
	}
	
}
