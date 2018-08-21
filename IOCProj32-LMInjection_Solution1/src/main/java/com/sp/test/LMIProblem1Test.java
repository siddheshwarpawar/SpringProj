package com.sp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sp.beans.MyServletContainer;

public class LMIProblem1Test {

	public static void main(String[] args) {

		ApplicationContext ctx  = null;
		MyServletContainer msc = null;
		
		ctx = new ClassPathXmlApplicationContext("com/sp/cfgs/applicationContext.xml");
		
		
		MyServletContainer ms  = ctx.getBean("msc", MyServletContainer.class);
		ms.processRequest("Balaji Mudholkar");
		ms.processRequest("Siddheshwar Pawar..");
		ms.processRequest("Nilesh Pawar");
	}

}
