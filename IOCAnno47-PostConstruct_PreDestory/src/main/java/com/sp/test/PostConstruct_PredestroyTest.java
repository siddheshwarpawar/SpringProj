package com.sp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sp.beans.VoterChecking;

public class PostConstruct_PredestroyTest {

	public static void main(String[] args) {
		System.out.println("PostConstruct_PredestroyTest.main()");
		VoterChecking voter = null ; 
		ApplicationContext ctx = null;
		
		ctx = new ClassPathXmlApplicationContext("com/sp/cfgs/applicationContext.xml");
		
		voter = ctx.getBean("vc", VoterChecking.class);
		
		System.out.println(voter.genrateResult());

		((AbstractApplicationContext) ctx).close();
	}

}
