package com.sp.dao;

import com.sp.bo.UserBO;

public interface LoginDAO {
	
	public int validate(UserBO bo);
}
