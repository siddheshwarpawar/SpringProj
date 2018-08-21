package com.sp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.sp.beans.Robot;

public class AppTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx = null;
		Robot robot = null;
	
		ctx = new ClassPathXmlApplicationContext("com/sp/cfgs/applicationContext.xml");
	
		robot = ctx.getBean("robot" , Robot.class);
		
		System.out.println(robot);
		
	}

}
