package com.sp.beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class MRWish2 implements MethodReplacer {

	public MRWish2() {
		System.out.println("MRWish.MRWish()");
	}
	
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		
		if (method.getName().equals("WishMsg1")) {
			
			String name = (String) args[0];
			return "Good Afternoon"+name;
			
		} else {
			return "Something went wrong..";
		}
		
		
	}

}
