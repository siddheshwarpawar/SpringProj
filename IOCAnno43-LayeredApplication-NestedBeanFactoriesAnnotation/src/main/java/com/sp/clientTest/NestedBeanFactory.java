package com.sp.clientTest;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.sp.controller.MainController;
import com.sp.vo.EmployeeVO;

public class NestedBeanFactory {

	public static void main(String[] args) {
		
		ApplicationContext pCtx = null , cCtx  = null;
//		BeanFactory parentFactory=null;
//		BeanFactory childFactory=null;
		MainController controller=null;
		List<EmployeeVO> listVO=null;
		
		// Create IOC Container (parent )
		
		//parentFactory=new XmlBeanFactory(new ClassPathResource("com/sp/cfgs/business-beans.xml"));
		pCtx = new ClassPathXmlApplicationContext("com/sp/cfgs/business-beans.xml");
		
		// Create IOC Container (child )
		//childFactory = new XmlBeanFactory(new ClassPathResource("com/sp/cfgs/persistence-beans.xml"),parentFactory);
		cCtx = new ClassPathXmlApplicationContext(new String[] {"com/sp/cfgs/persistence-beans.xml"}, pCtx);
		// Get controller bean object
		controller=cCtx.getBean("controller",MainController.class);
		
		
		try{
		//invoke b.methods..
		listVO=controller.getEmpByDesg(new String[]{"developer","project leader", "programmer"});
		//display listVO
		for(EmployeeVO vo:listVO){
			System.out.println(vo.getEno()+" "+vo.getEname()+" "+vo.getDesg()+" "+vo.getSalary());
		}
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Intenal Problem---->"+e.getMessage());
		}

}
}