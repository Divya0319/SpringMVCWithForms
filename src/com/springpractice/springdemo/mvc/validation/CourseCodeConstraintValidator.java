package com.springpractice.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator 
		implements ConstraintValidator<CourseCode, String> {

	
	private String coursePrefix;
	
	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrefix = theCourseCode.value();
		
	}
	
	
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext thConstraintValidatorContext) {
		
		
		boolean result;
		
		if(theCode != null) {
			 result = theCode.startsWith(coursePrefix);
			 return result;
		} 
		else {
			
			result = true;
		}
		
		return result;
	}

}
