package com.sp.beans;

import org.springframework.beans.factory.annotation.Required;

public class Robot {

	private int robotId;
	private String name;
	
	public void setRobotId(int robotId) {
		this.robotId = robotId;
	}
	
	@Required
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Robot [robotId=" + robotId + ", name=" + name + "]";
	}
	
	
	
}
