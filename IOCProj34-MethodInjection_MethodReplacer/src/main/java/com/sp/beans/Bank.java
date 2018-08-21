//P = Principal Amount.
//I = Interest Amount.
//r = Rate of Interest per year in decimal;
//r = R/100.
//R = Rate of Interest per year as a percent; 
//R = r * 100.

package com.sp.beans;

public class Bank {

	public float calcIntr(float pAmt, float time) {
		System.out.println("Bank.calcIntr(-,-)");
		return pAmt * time * 2.0f / 100;
	}
}
