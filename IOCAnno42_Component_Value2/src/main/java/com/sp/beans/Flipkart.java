package com.sp.beans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("fpk")
public class Flipkart {

	private DTDC dtdc ;

	@Autowired
	public void setDtdc(DTDC dtdc) {
		this.dtdc = dtdc;
	}
	
	public Flipkart() {
		System.out.println("Flipkart.Flipkart()");
	}
	
	public void shopping(String[] items) {
		System.out.println(Arrays.toString(items)+" are shopped");
		dtdc.deliver(new Random().nextInt(1000));
	}

	@Override
	public String toString() {
		return "Flipkart [dtdc=" + dtdc + "]";
	}
	
}
