package com.sp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sp.beans.Bank;

public class MethodInjectionTest {

	public static void main(String[] args) {
		ApplicationContext  ctx;
		Bank bank ;
		
		// Create IOC contianer 
		ctx = new ClassPathXmlApplicationContext("com/sp/cfgs/applicationContext.xml");
		
		// getBean 
		bank = ctx.getBean("bank", Bank.class);
		
		System.out.println("Interset Amount :" +bank.calcIntr(200000, 22));
	}

}
