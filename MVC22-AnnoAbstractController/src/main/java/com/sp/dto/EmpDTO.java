package com.sp.dto;


public class EmpDTO {
	private int eid;
	private String ename;
	private String desg;
	private int salary;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmpDTO [eid=" + eid + ", ename=" + ename + ", desg=" + desg + ", salary=" + salary + "]";
	}	
}
