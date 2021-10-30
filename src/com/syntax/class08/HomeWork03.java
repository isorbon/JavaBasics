package com.syntax.class08;

import java.util.Scanner;

public class HomeWork03 {

	public static void main(String[] args) {
		/*
		 * Write a program that reads a range of integers (start and end point),
		 * provided by a user and then from that range prints the sum of the even and
		 * odd integers.
		 */
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter the Start integer of range: ");
		int start = inp.nextInt();
		System.out.print("Enter the End integer of range: ");
		int end = inp.nextInt();
		int evenSum = 0;
		int oddSum = 0;

		for (int i = start; i <= end; i++) {
			if (i % 2 == 0) {
				evenSum += i;
			} else {
				oddSum += i;
			}
		}
		System.out.println("Even numbers:");
		for (int i = start; i <= end; i ++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("\nOdd numbers:");
		for (int i = start; i <= end; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("\nThe sum of Even integers is = " + evenSum);
		System.out.println("The sum of Odd integers is = " + oddSum);

	}

}
