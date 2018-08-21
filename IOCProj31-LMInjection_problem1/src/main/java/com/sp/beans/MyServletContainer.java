package com.sp.beans;

public class MyServletContainer {

	MyRequestHandler handler;
	
	public MyServletContainer () {
		System.out.println("MyServletContainer.MyServletContainer() - 0 Parameter constructor");
	}

	public void setHandler(MyRequestHandler handler) {
		this.handler = handler;
	}
	

	public  void processRequest(String data) {
		handler.handle(data);
	}
}
