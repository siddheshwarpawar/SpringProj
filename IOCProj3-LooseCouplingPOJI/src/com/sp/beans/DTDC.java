package com.sp.beans;

public class DTDC implements Courier {


	// 0-parameter constructor
	public DTDC() {
		System.out.println("DTDC.DTDC():0-param constructor");
	}
	
	@Override
	public String deliver(int orderId) {
		return "DTDC is ready to deliver product of"+orderId;
	}

}
