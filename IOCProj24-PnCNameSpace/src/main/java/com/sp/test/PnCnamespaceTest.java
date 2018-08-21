package com.sp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sp.beans.Department_D;
import com.sp.beans.Employee_T;

public class PnCnamespaceTest {

	public static void main(String[] args) {
		Employee_T emp = null;
		BeanFactory factory = null;
		Department_D dept = null;
		
		// Create IOC container 
		factory = new XmlBeanFactory(new ClassPathResource("com/sp/cfgs/applicationContext.xml"));
		//getBean
		
		//dependent class
		dept = factory.getBean("dept", Department_D.class);
		
		System.out.println(dept);
	
		//target class
			emp = factory.getBean("emp", Employee_T.class);
		
		System.out.println(emp);
	
	
	
	}
}
