package com.sp.beans;

import java.util.List;

public class ShooeType {

	private List<String> shooeType = null;

	public void setShooeType(List<String> shooeType) {
		this.shooeType = shooeType;
	}

	@Override
	public String toString() {
		return "ShooeType [shooeType=" + shooeType + "]";
	}
}//class
