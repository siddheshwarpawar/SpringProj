package com.sp.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.bo.UserBO;
import com.sp.dao.LoginDAO;
import com.sp.dto.UserDTO;
@Service("service")
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	public LoginDAO dao;
	
	@Override
	public String checkValidUser(UserDTO userDTO) {
		//Convert dto to bo
		UserBO userBO = new UserBO();
		BeanUtils.copyProperties(userDTO, userBO);
		
		//Use dao
		int count = dao.validate(userBO);
		
		// Business Logic
		if(count!=0) 
			return "Authenticated User";
		else
			return "Unauthorized User";	
	}
}
