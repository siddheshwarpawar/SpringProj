package com.nt.dao;

import com.nt.bo.CustomerBO;
import com.nt.bo.StudentBO;

public class CustStudDAO {


	/**
	 *  0 -  Parameter constructor
	 */
	public CustStudDAO() {
		System.out.println("CustStudDAO.CustStudDAO() :: 0 - Parameter constructor");
	}
	
	
	public void insertData(StudentBO bo) {
		System.out.println("Student data is ::");
		System.out.print(bo.getId() +" - "+ bo.getName() +"-"+bo.getCourse()+" - "+bo.getDoj());
	}
	

	public void insertData(CustomerBO bo) {
		System.out.println("Customer data is::");
		System.out.println(bo.getId()+ "-"+ bo.getName()+ "-"+bo.getBillAmt()+ "-"+bo.getDoj() );
	}
	
}
