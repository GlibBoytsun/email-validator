package com.assignment.email_validator;

public class EmailValidator {
	public static int Validate(String email)
	{
		int result = 0;
		
		//rule 1
		if (email.contains("@"))
			result++;
		
		//rule 2
		if (email.contains("."))
			result++;
		
		return result;
	}
}
