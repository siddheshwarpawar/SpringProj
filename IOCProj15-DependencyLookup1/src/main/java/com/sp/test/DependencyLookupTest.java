package com.sp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sp.beans.Viechle;

public class DependencyLookupTest {

	public static void main(String[] args) {

		BeanFactory factory = null;
		Viechle v = null;
		// create IOC container
		factory = new XmlBeanFactory(new ClassPathResource("com/sp/cfgs/applicationContext.xml"));
		
		v = factory.getBean( "bid" ,Viechle.class);
		// after getting the object now invoke the methods
		v.move();
	}

}
