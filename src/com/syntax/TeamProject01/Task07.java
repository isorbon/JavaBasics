package com.syntax.TeamProject01;

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {

		// Write a java program to check whether a given number is prime or not?

		int input;
		boolean isPrime = true;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number:");
		int num = scan.nextInt();
		for (int i = 2; i <= num / 2; i++) {
			input = num % i;
			if (input == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println(num + " is a Prime Number");
		} else {
			System.out.println(num + " is not a Prime Number");
		}
	}

}
