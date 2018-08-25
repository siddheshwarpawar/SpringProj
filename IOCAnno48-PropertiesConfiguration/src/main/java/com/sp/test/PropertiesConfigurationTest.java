package com.sp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sp.beans.DemoDAO;

public class PropertiesConfigurationTest {

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		DemoDAO ddao = null;
		
		ctx = new ClassPathXmlApplicationContext("com/sp/cfgs/applicationContext.xml");
		
		ddao = ctx.getBean("dao", DemoDAO.class);
		
		System.out.println(ddao);
	}

}
