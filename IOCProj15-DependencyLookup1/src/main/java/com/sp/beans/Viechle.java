package com.sp.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Viechle {
		
	private String beanId ;
	

	// 0 - parameter constructor
	public Viechle() {
		System.out.println("Viechle.Viechle():0-parameter constructor");
	}
	
	// setter method
	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}
	public void move() {
		// create IOC contianer
		BeanFactory factory = null;
		factory = new XmlBeanFactory(new ClassPathResource("com/sp/cfgs/applicationContext.xml"));
		// get the object
		Engine engine = factory.getBean("engg1", Engine.class);
		// after getting the object invoke the methods
		engine.start();
	}


	
}
