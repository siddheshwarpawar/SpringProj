package com.sp.beans;

import java.util.Date;

public class Department_D {
	
	private int deptNo;
	private String deptName;
	private Date dop;
	
	// Parameterized Constructor
	public Department_D(int deptNo, String deptName, Date dop) {
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.dop = dop;
	}

	
	
	
	
	
	@Override
	public String toString() {
		return "Department_D [deptNo=" + deptNo + ", deptName=" + deptName + ", dop=" + dop + "]";
	}
	
	
	
	
	

}
