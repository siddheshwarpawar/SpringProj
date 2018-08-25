package com.sp.beans;

import javax.inject.Inject;
import javax.inject.Named;

@Named("viechle")
public class Viechle {

	//1 field level injection
	//	@Inject
	private Engine engg;

//2 construcotr level injection
//	@Inject
//	public Viechle(Engine engg) {
//		this.engg = engg;
//	}
	
	
// 3 arbitary method level injection	
//	@Inject
//	public void assign(Engine engg) {
//		this.engg = engg;
//	}

	
// 4 Setters method injection
	@Inject
	@Named("b")
	public void setEngg(Engine engg) {
		this.engg = engg;
	}

	

	@Override
	public String toString() {
		return "Viechle [engg=" + engg + "]";
		
	}

}
