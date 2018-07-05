
package com.sp.beans;

import java.util.Date;

public class WishGenrator {

	// Bean properties
	private Date date;
	private String name;

	// Parameterized Constructor for constructor-Injection
	private WishGenrator(Date date) {
		this.date = date;
	}

	// Business logic
	public String genrateWishMessage(String name) {
		System.out.println("WishGenrator.genrateWishMessage()");
		int hour = 0;
		// Get the current hour from system Date
		hour = date.getHours();

		// Genarate wish message
		if (hour <= 12) {
			return "Good morning" + name;
		} else if (hour <= 16) {
			return "Good Afternoon" + name;
		} else if (hour <= 20) {
			return "Good evening" + name;
		} else {
			return "Good night" + name;
		}
	} // if
} // Class
