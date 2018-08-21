package com.sp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sp.beans.Viechle;

public class AwareInjectionTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx = null;
		Viechle viechle = null;
		
		ctx = new ClassPathXmlApplicationContext("com/sp/cfgs/applicationContext.xml");
		viechle = ctx.getBean("vec", Viechle.class);
		
		viechle.move();
		viechle.blowHorn();
		viechle.entertainment();
		((AbstractApplicationContext) ctx).close();
	}
}
