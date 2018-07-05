package com.sp.beans;

import java.util.Date;

public class WishGenrator {

	// bean properties
	private String name;
	private Date date;

	// setter method for setter injection
	public void setDate(Date date) {
		this.date = date;
	}
	public void setName(String name) {
		this.name = name;
	}

	// Business logic
	public String genrateWishMessage() {
		System.out.println("WishGenrator.genrateWishMessage()");
		int hour = 0;
		// get the current hour from system Date
		hour = date.getHours();

		// genrate wish message
		if (hour <= 12) {
			return "Good morning" + name;
		} else if (hour <= 16) {
			return "Good Afternoon" + name;
		} else if (hour <= 20) {
			return "Good evening" + name;
		} else {
			return "Good night" + name;
		}
	}
}
