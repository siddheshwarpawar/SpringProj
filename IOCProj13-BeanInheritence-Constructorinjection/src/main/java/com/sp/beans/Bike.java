package com.sp.beans;

public class Bike {

	// instance field
	private int regNumber;
	private String ownerName;
	private String model;
	private String engineCC;
	private String color;
	private String milage;
	
	// Parameterized Constrictor
	public Bike(int regNumber, String ownerName, String model, String engineCC, String color, String milage) {
		this.regNumber = regNumber;
		this.ownerName = ownerName;
		this.model = model;
		this.engineCC = engineCC;
		this.color = color;
		this.milage = milage;
	}

	// toString method
	@Override
	public String toString() {
		return "Bike [regNumber=" + regNumber + ", ownerName=" + ownerName + ", model=" + model + ", engineCC="
				+ engineCC + ", color=" + color + ", milage=" + milage + "]";
	}
	
	
	
	
	
}
