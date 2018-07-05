package com.sp.beans;

import java.util.Random;

public class Flipkart {

	private Courier courier;
	
	// 0-parameter  constructor
	public Flipkart() {
		System.out.println("Flipkart:0-param constructor");
	}

	// Setter  method  for  setter  injection
	public void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier()");
		this.courier = courier;
	}
	
	// Business  logic  method
	public String purchase(String[] itmes) {
		// Genrate  orderId 
		Random rad = new Random();
		int orderId = rad.nextInt(70000);
		// Deliver  order
		String status = courier.deliver(orderId);
		return status+"\t Bill Amt For order id::"+orderId+" is 7000";
	}	
}
