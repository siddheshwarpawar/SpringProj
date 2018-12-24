package com.sp.service;

import java.util.Calendar;

import org.springframework.stereotype.Service;

@Service("wish")
public class WishServiceImpl implements WishService{

	@Override
	public String genrateWishMessage() {
		Calendar cal = null;
		cal = Calendar.getInstance();
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		
		if(hour < 12) {
			return "Good morning";
		}
		else if (hour < 16) {
			return "Good AfterNoon";
		}
		else if (hour < 21) {
			return "Good Evening";
		}
		else {
			return "Good Night..";
		}
	
	}

}
