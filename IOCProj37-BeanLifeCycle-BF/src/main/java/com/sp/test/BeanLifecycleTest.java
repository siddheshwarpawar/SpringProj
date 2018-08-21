package com.sp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.sp.beans.Student;

public class BeanLifecycleTest {

	public static void main(String[] args) {
		//BeanFactory  factory = null;
		Student s = null;
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/sp/cfgs/applicationContext.xml");
		
		//factory = new XmlBeanFactory(new FileSystemResource("src/com/sp/cfgs/applicationContext.xml"));
	
		s = factory.getBean("s1", Student.class);
		System.out.println(s);
		((AbstractApplicationContext) factory).close();
		//System.out.println();
		
	}

}
