package com.syntax.class07;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// Guess Number with while
		int secret = 78;
		Scanner input = new Scanner(System.in);
		int numUser;

		System.out.println("Guess a secret number");
		numUser = input.nextInt();

		while (numUser != secret) {
			System.out.println("Guess a secret number");
			numUser = input.nextInt();
		}
		System.out.println("You got it !!!");

	}

}
