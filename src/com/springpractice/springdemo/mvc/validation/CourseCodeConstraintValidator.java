package com.springpractice.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator 
		implements ConstraintValidator<CourseCode, String> {

	
	private String[] coursePrefixes;
	
	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrefixes = theCourseCode.value();
		
	}
	
	
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext thConstraintValidatorContext) {
		
		
		boolean result = false;
		
		if(theCode != null) {
			
			// loop thru course prefixes
			
			// check if the code matches any of the prefix
			for(String tempPrefix:coursePrefixes){
				
				result = theCode.startsWith(tempPrefix);
				
				if(result) {
					break;
				}
				
			}
			 
		} 
		else {
			
			result = true;
		}
		
		return result;
	}

}
