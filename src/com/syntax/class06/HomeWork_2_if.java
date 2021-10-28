package com.syntax.class06;

import java.util.Scanner;

public class HomeWork_2_if {

	public static void main(String[] args) {
		/*
		 * HW: Using scanner class create calculator. Allow user to enter 2 numbers and
		 * operator(+,-,*,/). Based on operator provide the result to user. Please
		 * complete this assignment in 2 ways: using if statement and switch case.
		 */
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		double n1 = inp.nextDouble();
		System.out.print("Enter number 2: ");
		double n2 = inp.nextDouble();
		System.out.print("Enter an operator (+; -; *; /): ");
		String operator = inp.next();

		if(operator.equals("+")) {
			System.out.println("The result = " + (n1 + n2));
		}else if(operator.equals("-")) {
			System.out.println("The result = " + (n1 - n2));
		}else if(operator.equals("*")) {
			System.out.println("The result = " + (n1 * n2));
		}else if(operator.equals("/")) {
			System.out.println("The result = " + (n1 / n2));
		}else {
			System.out.println("Invalid operand. Please try another operand.");
		}
			
	}

}
