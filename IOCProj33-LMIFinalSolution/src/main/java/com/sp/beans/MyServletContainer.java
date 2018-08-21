package com.sp.beans;

public abstract class MyServletContainer {
	
	public MyServletContainer() {
		System.out.println("  0 - parameter constructor");
	}

	public void processRequest(String data) {
		MyRequestHandler handler = genrate();
		handler.handle(data);
	}
	public abstract MyRequestHandler genrate();
	
}