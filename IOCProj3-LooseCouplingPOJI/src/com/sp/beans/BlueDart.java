package com.sp.beans;

public class BlueDart implements Courier {

	// 0-parameter constructor
	public BlueDart() {
		System.out.println("BlueDart.BlueDart():0-param constructor");
	}
	
	@Override
	public String deliver(int orderId) {
		return "Bluedart is ready to deliver product of"+orderId;
	}



}
