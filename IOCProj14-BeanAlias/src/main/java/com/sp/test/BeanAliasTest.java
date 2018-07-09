package com.sp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sp.beans.ShooeType;

public class BeanAliasTest {

	public static void main(String[] args) {
		//create IOC container
		ShooeType st = null;
		BeanFactory factory = null;
		
		factory = new XmlBeanFactory(new ClassPathResource("com/sp/cfgs/applicationContext.xml"));
//		st = factory.getBean("Boot", ShooeType.class);
		// or
		
		st = factory.getBean("shooe", ShooeType.class);
		System.out.println(st);
		
		

	}

}
