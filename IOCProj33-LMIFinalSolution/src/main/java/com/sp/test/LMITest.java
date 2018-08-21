package com.sp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sp.beans.MyServletContainer;

public class LMITest {

	public static void main(String[] args) {
		
		ApplicationContext ctx = null;
		MyServletContainer msc  = null;
		
		ctx = new ClassPathXmlApplicationContext("com/sp/cfgs/applicationContext.xml");
		
		msc  = ctx.getBean("beanId", MyServletContainer.class);
		
		msc.processRequest("Siddheshwar");
		msc.processRequest("Pawar");
		msc.processRequest("Parbhani");
	}

}
