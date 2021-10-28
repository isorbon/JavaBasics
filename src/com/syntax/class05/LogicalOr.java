package com.syntax.class05;

import java.util.Scanner;

public class LogicalOr {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Do you have a Credit Card?");
		String answer = input.next();
		
		if (answer.equals /* equalsIgnoreCase */("yes") || answer.equalsIgnoreCase("yep") || answer.equals("yeah")) {
			System.out.println("Please, tell me the balance");	
		}else {
			System.out.println("Do you want to get a Credit Card?");
		}

	}

}
