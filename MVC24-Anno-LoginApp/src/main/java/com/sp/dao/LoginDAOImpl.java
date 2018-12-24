package com.sp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sp.bo.UserBO;

@Repository
public class LoginDAOImpl implements LoginDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private final String LOGIN_QUERY = "SELECT COUNT(*) FROM USERLIST1 WHERE UNAME=? AND PASS=?";
	@Override
	public int validate(UserBO bo) {
		//use jdbcTemplate to check valid user 
		int count = jdbcTemplate.queryForObject(LOGIN_QUERY, Integer.class, bo.getUname(), bo.getPass());

		return count;
	}

}
