package com.sp.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class EmpDTO implements Serializable {

	private int id;
	private String name;
	private String desg;
	private int sal;

}
