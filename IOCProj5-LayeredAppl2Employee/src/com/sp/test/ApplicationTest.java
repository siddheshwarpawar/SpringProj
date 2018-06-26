package com.sp.test;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sp.controller.EmployeeController;
import com.sp.vo.EmployeeVO;

public class ApplicationTest {

	public static void main(String[] args) {
		
		
		Scanner sc = null;
		String eno = null, ename = null, address = null, company= null, basicSalary = null;
		EmployeeVO  vo = null;
		BeanFactory factory = null;
		String result = null;
		EmployeeController controller = null;
	
		// Read input from customer
		sc = new Scanner(System.in);
		System.out.println("\t Enter Employee ID ::\n");
		eno = sc.next();
		
		System.out.println("\t Enter Employee Name ::\n");
		ename = sc.next();
		
		System.out.println("\t Enter Employee Address ::\n");
		address = sc.next();
		
		System.out.println("\t Enter Employee Company ::\n");
		company= sc.next();
		
		System.out.println("\t Enter Employee basicSalary ::\n");
		basicSalary = sc.next();
		
		// Store input into EmployeeVO object
		vo = new EmployeeVO();
		vo.setEno(eno);
		vo.setEname(ename);
		vo.setAddress(address);
		vo.setCompany(company);
		vo.setBasicSalary(basicSalary);
		
		// Create IOC container
	//	Resource res = new FileSystemResource("com/sp/cfgs/applicationContext.xml");
		//factory = new XmlBeanFactory(res);
	factory=new XmlBeanFactory(new ClassPathResource("com/sp/cfgs/applicationContext.xml"));

		controller = factory.getBean("empController", EmployeeController.class);
		
		
		
		
		try {
			// Invoke method
			result = controller.processEmployee(vo);
			System.out.println("----------------------------------------------------Employee  Details-----------------------------------------------------------------");
			System.out.println("\t Name   ::"+vo.getEname());
			System.out.println("\t Company  ::"+vo.getCompany());
			System.out.println("\t Address ::"+vo.getAddress());
			System.out.println("\n Salary Details ::"+result);
		} catch (Exception e) {
			System.out.println("Internal Problem..Try Again ???-->"+e.getMessage());
		}
	}

}
