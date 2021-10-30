package com.syntax.class08;

import java.util.Scanner;

public class HomeWork02 {

	public static void main(String[] args) {
		/*
		 * Create a program that will keep asking user to apply for a credit card. As
		 * soon you get “yes” from a user program should stop asking.
		 */
		Scanner inp = new Scanner(System.in);

		System.out.println("Apply for a credit card");
		String ans = inp.next();

		while (!ans.equalsIgnoreCase("yes")) {

			System.out.println("Apply for a credit card");
			ans = inp.next();
		}
		System.out.println("Thanks!");

	}

}
