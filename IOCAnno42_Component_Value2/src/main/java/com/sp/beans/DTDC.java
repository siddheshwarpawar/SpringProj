package com.sp.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("dtdc")
public class DTDC {

	@Autowired
	private Date date;
	
	@Value("hyd")
	private String location;
	
	public void deliver(int oid) {
		System.out.println("DTDC\t" +oid+ "\t will be delivered on \t ::"+date);
	}

	@Override
	public String toString() {
		return "DTDC [date=" + date + ", location=" + location + "]";
	}
	
}
