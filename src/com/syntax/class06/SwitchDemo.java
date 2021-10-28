package com.syntax.class06;

public class SwitchDemo {

	public static void main(String[] args) {
		
		/*
		 * Rules:
		 * values in case MUST be same datatype as a VARIABLE in switch
		*/
		
		char gender = 'f';
		String description;
		
		switch (gender) {
		case 'm':
			description = "Male";
			break;
		case 'f':
			description = "Female";
			break;
		default:
			description = "Unknown";
		}
		
		System.out.println(gender + " means " + description);
	}

}
