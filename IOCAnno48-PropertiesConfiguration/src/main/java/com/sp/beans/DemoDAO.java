package com.sp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class DemoDAO {

	@Value("${Demo.driver}")
	private String driverName;
	@Value("${Demo.url}")
	private String url;
	@Value("${Demo.username}")
	private String userName;
	@Value("${Demo.password}")
	private String password;
	
	
	@Override
	public String toString() {
		return "DemoDAO [driverName=" + driverName + ", url=" + url + ", userName=" + userName + ", password="
				+ password + "]";
	}
	
}
