package com.syntax.class04;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {

		/*
		 * Create a Java program to capture 2 numbers from a user and define which
		 * number is the largest.
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Please, enter a number");
		int num1 = input.nextInt();
		System.out.println("Please, enter 2-nd number");
		int num2 = input.nextInt();

		if (num1 > num2) {
			System.out.println("The 1-st number larger than 2-nd one");
		} else {
			System.out.println("The 2-nd number larger than 1-st one");
		}

	}

}
