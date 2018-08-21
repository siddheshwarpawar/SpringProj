package com.sp.beans;

import java.util.Date;

public class Employee_T {

	private int eno;
	private String name;
	private Department_D d;
	private Date dob;

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department_D getD() {
		return d;
	}

	public void setD(Department_D d) {
		this.d = d;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Employee_T [eno=" + eno + ", name=" + name + ", d=" + d + ", dob=" + dob + "]";
	}


}
