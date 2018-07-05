package com.sp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.sp.beans.Student;

public class ApplicationTest {

	public static void main(String[] args) {
		Resource res = null;
		BeanFactory factory = null;
		
		// Locate the xml 
		res = new FileSystemResource("src/com/sp/cfgs/applicationContext.xml");
		
		// Create IOC container
		factory = new XmlBeanFactory(res);
		
		//get Bean
		Student student  = (Student) factory.getBean("student");
		student.displayInfo();
	}

}
