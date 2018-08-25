package com.sp.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Named("vc")
@Scope("singleton")
public class VoterChecking {

	@Value("raja")
	private String name;
	@Value("35")
	private int age;

	@PostConstruct
	public void myInit() {
		System.out.println("VoterChecking.myInit()");
		if (name.equals("") || age<0 || age > 100) {
			throw new IllegalArgumentException("Please enter the valid name or age");
		}
	}
	
	@PreDestroy
	public void myDestroy() {
		System.out.println("VoterChecking.myDestroy()");
		name = null;
		age = 0;
	}
	
	@Lazy
	public String genrateResult() {
		System.out.println("VoterChecking.genrateResult()");
		if(age >= 18) 
			return name+"- You are eligibal to vote";
		else
			return name+"- you are not eligibal to vote wait for"+(18-age);
	}
}

