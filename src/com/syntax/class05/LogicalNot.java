package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {

		boolean day = false;
		
		if(!day) {
			System.out.println("Good day");
		}
		
		boolean selected = false;
		if(!selected) {
			System.out.println("do click");
		}
		
		String userName = "Test";
		String password = "Password";
		if (!userName.equals(password)) {
			System.out.println("I'm accepting your password");
		}
	}

}
