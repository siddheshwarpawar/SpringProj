package com.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Viechle {

// Used for fields
	@Autowired(required = true)
	@Qualifier("e1")
	Engine engg;

	
	
	// Used for Setter method
	@Autowired
	public void setEngg(Engine engg) {
		System.out.println("Viechle.setEngg()");
		this.engg = engg;
	}

	
	
	// Used for Constructor	
	@Autowired
	public Viechle(Engine engg) {
		System.out.println("Viechle.Viechle()");
		this.engg = engg;
	}


	// Used for Arbitary mehtod
	@Autowired(required = true)
	public void attachEng(Engine engg)
	{
		System.out.println("Viechle.attachEng()");
		this.engg = engg;
	}
	
	
	@Override
	public String toString() {
		return "Viechle [engg=" + engg + "]";
	}


}
