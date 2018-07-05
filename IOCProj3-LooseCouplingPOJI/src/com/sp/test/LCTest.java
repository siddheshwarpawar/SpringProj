package com.sp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.sp.beans.Flipkart;

public class LCTest {

	public static void main(String[] args) {
		
		// Locate  spring  bean  configuration  file
		Resource res = new FileSystemResource("src/com/sp/cfgs/applicationContext.xml");
		
		// Create  BeanFactory  IOC  container
		BeanFactory factory = new XmlBeanFactory(res);
		
		//  Get bean object
		Flipkart fp = (Flipkart) factory.getBean("fpkt");
		
		// Call  the  business  logic
		String billMsg = fp.purchase(new String[] {"Shirt", "Mobile", "Books"});
		System.out.println(billMsg);
	}

}
