package com.syntax.class04;

import java.util.Scanner;

public class HomeWork6 {

	public static void main(String[] args) {
		/*
		 * Write a program to ask user to enter numbers of worked years and annual
		 * salary. If user worked for more or equals to 5 years than user is eligible
		 * for the bonus, otherwise he is not. Once user is eligible and salary is
		 * larger than 50000 than bonus = 5000, otherwise bonus=3000.
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Please, enter your worked years");
		int workYears = input.nextInt();

		System.out.println("Please, enter your annual salary");
		int annualSalary = input.nextInt();

		if (workYears >= 5) {
			System.out.println("You are eligible for the Bonus!");
			if (annualSalary > 50000) {
				System.out.println("Your Bonus is 5000");
			} else {
				System.out.println("Your Bonus is 3000");
			}
		} else {
			System.out.println("Unfortunately, you are not eligible for the bonus");
		}

	}

}
