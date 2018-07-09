package com.sp.beans;

import java.util.List;

public class EnggCourse {
	
	//  Instance Field
	private List<String> subjects;
	// Setter  method
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	// toString method
	@Override
	public String toString() {
		return "EnggCourse [subjects=" + subjects + "]";
	}
	
	
}// class
