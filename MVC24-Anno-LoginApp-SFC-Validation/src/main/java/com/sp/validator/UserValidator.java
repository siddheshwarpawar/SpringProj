package com.sp.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.sp.command.UserCommand;

@Component("userValidator")
public class UserValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		// Class Assignable 
		return clazz.isAssignableFrom(UserCommand.class);
	}

	@Override
	public void validate(Object command, Errors errors) {
		// Validation Logic
		UserCommand userCommand = (UserCommand) command;
		if(userCommand.getUname().equalsIgnoreCase("") ||
			userCommand.getUname()==null || 
			userCommand.getUname().length()==0) {
			errors.reject("uname", "Username is compulsry");
			
		}
		if(userCommand.getPass().equals("")|| userCommand.getPass().length()==0 || userCommand.getPass()==null) {
			errors.reject("pass","password  is required");
		}
		
	}

}
