package com.sp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sp.beans.Bike;

public class CollectionMerging {

	public static void main(String[] args) {

		BeanFactory factory = null;

		Bike b1 = null, b2 = null;
		
		//create IOC container
		factory = new XmlBeanFactory(new ClassPathResource("com/sp/cfgs/applicationContext.xml"));
		
		// getBean
	/*	b1 = factory.getBean("bike1", Bike.class);
		System.out.println(""+b1);
*/
		//getBean
		b2  = factory.getBean("bike2", Bike.class);
		System.out.println(""+b2);
	}

}
