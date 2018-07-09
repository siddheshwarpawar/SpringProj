package com.sp.beans;

public class Engine {
	// 0 - parameter constructor
	public Engine() {
		System.out.println("Engine::0-Parameter constructor");
	}
	// Dependent class method
	public void start() {
		System.out.println("Engine is started");
	}

}// class
