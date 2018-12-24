package com.sp.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class EmpDTO implements Serializable {
	
	private int eid;
	private String ename;
	private String desg;
	private int salary;
	
}
