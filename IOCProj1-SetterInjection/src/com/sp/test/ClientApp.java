package com.sp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.sp.beans.WishGenrator;

public class ClientApp {

	public static void main(String[] args) {
		
		System.out.println("ClientApp.main()");
		Resource res = null;
		BeanFactory factory = null;
		Object obj = null;
		
		// locate Spring Bean Configuration file
		res = new FileSystemResource("src/com/sp/cfgs/applicationContext.xml");
		System.out.println("Spring Bean config file located");
		
		// create IOC continer
		factory = new XmlBeanFactory(res);
		System.out.println("IOC container of type BeanFactory created");
		
		// Get target class object
		obj = factory.getBean("wish");
		System.out.println("Target class object injected to dependent class object");
		WishGenrator wg = (WishGenrator) obj;
		
		// invoke method
		System.out.println("WishMessage ::"+wg.genrateWishMessage());
		
	}

}
