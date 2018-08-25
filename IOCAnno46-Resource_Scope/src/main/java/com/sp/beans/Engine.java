package com.sp.beans;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;

//@Named("eng")
public class Engine {

	//@Value("101")
	private int id;
	//@Value("Bike")
	private String type;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Engine [id=" + id + ", type=" + type + "]";
	}
}
