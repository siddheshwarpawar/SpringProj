package com.sp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sp.beans.EnggCourse;

public class CollectionMergingTest {

	public static void main(String[] args) {
		
		EnggCourse ec = null;
		BeanFactory factory = null;
		// Create BeanFactory Container
		factory = new XmlBeanFactory(new ClassPathResource("com/sp/cfgs/applicationContext.xml"));
		
		//  
		ec = factory.getBean("sy", EnggCourse.class);
		System.out.println(ec);
	}

}
