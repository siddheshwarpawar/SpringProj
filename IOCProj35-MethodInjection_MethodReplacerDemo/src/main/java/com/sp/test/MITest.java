package com.sp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sp.beans.Wish;

public class MITest {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/sp/cfgs/applicationContext.xml");
		Wish wish1  ; 
		wish1 = ctx.getBean("wish", Wish.class);
		
		System.out.println("WISH MESSAGE ::"+wish1.WishMsg1("Siddheshwar Pawar"));
	}

}
