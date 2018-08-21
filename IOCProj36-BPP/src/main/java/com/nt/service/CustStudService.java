package com.nt.service;

import com.nt.bo.CustomerBO;
import com.nt.bo.StudentBO;
import com.nt.dao.CustStudDAO;

public abstract class CustStudService {

	public CustStudDAO csDao;
	
	public void setCsDao(CustStudDAO csDao) {
		this.csDao = csDao;
	}
	
	public CustStudService() {
		System.out.println("CustStudService.CustStudService()::0 - parameter constructor");
	}
	
	public abstract StudentBO getStudentBO();
 	public abstract CustomerBO getCustomerBO();
 	
 	public void processStudent(int id, String name, String course) {
 		System.out.println("CustStudService.processStudent()");
 		StudentBO stBo = getStudentBO();
 		stBo.setId(id);
 		stBo.setName(name);
 		stBo.setCourse(course);
 		
 		// Use DAO
 		csDao.insertData(stBo);
 	}
 	public void processCustomer(int id, String name, float billAmt) {
 		System.out.println("CustStudService.processCustomer()");
 		CustomerBO custBo = getCustomerBO();
 	
 		custBo.setId(id);
 		custBo.setName(name);
 		custBo.setBillAmt(billAmt);
 	
 		csDao.insertData(custBo);

 	}

}
