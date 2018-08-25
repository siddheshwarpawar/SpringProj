package com.sp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sp.beans.Flipkart;

public class AppTest {

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		Flipkart fpkt = null ; 
		
		ctx = new ClassPathXmlApplicationContext("com/sp/cfgs/applicationContext.xml");
		
		fpkt = ctx.getBean("fpk", Flipkart.class);
		
		System.out.println(fpkt);
		fpkt.shopping(new String[] {"Watch", "Belt", "Shooes"});
		
		((AbstractApplicationContext) ctx).close();
	}

}
