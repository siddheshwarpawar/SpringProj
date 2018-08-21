package com.sp.beans;

public class MyRequestHandler {

	private static int count ;

	public MyRequestHandler() {
		count++;
		System.out.println("MyRequestHandler.MyRequestHandler() - 0 Parameter ");
	}
	
	public void handle(String data) {
		System.out.println( "Handling request :: "+count+ "with data ::\t " +data );
	}
	
}
