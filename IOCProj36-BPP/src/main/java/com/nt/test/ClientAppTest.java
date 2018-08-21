package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.CustStudService;

public class ClientAppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = null;
		
		ctx = new ClassPathXmlApplicationContext("com/sp/cfgs/applicationContext.xml");
		
		// getBean
		CustStudService service = ctx.getBean("service", CustStudService.class);
		
		service.processCustomer(1001, "Nilesh", 5000 );
		service.processStudent(87, "rahul", "Java");
		service.processStudent(65, "balaji","Spring");
		service.processCustomer(98, "Siddheshwar", 331212);
	}

}
