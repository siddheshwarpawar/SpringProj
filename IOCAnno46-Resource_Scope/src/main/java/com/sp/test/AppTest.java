package com.sp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sp.beans.Viechle;

public class AppTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx = null;
		Viechle v = null;
		
		ctx = new ClassPathXmlApplicationContext("com/sp/cfgs/applicationContext.xml");
		
		v = ctx.getBean("viechle", Viechle.class);
		
		System.out.println(v);
	}

}
