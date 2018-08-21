package com.sp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sp.beans.TravelAgent;

public class AutoWireTest {

	
	public static void main(String[] args) {

		// instance 
		BeanFactory factory  = null;
		TravelAgent ta = null;
		
		// create IOC container
		factory = new XmlBeanFactory( new ClassPathResource("com/sp/cfgs/applicationContext.xml"));
		
		// call the getBean(-) to create the object
//		ta = factory.getBean("ta", TravelAgent.class);
//			System.out.println(ta);
//		
//			System.out.println("__________________________Constructor_____________________________________________");
//			ta  = factory.getBean("ta1", TravelAgent.class);
//			System.out.println(ta);
//
//	
//			System.out.println("________________________________byType___________________________________");
//			ta  = factory.getBean("ta2", TravelAgent.class);
//			System.out.println(ta);
//			
//			System.out.println("________________________________default_______________________________________");
//			ta  = factory.getBean("ta3", TravelAgent.class);
//			System.out.println(ta);
//			
//			System.out.println("________________________________no_______________________________________");
//			ta  = factory.getBean("ta4", TravelAgent.class);
//			System.out.println(ta);
//			
			System.out.println("__________________________________byName_____________________________________");
			ta  = factory.getBean("places", TravelAgent.class);
			System.out.println(ta);
		
	}

}
