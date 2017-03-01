package com.assignment.email_validator;

//rule 3 - address contains only one @
//rule 4 - address contains a . after @
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
		
		//rule 3
		if (email.indexOf('@') == email.lastIndexOf('@') && email.indexOf('@') != -1)
			result++;
		
		//rule 4
		if (email.indexOf('@') < email.lastIndexOf('.') && email.indexOf('@') != -1)
			result++;
		
		return result;
	}
}
