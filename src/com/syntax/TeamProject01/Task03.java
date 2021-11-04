package com.syntax.TeamProject01;

public class Task03 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array of integers. Develop a program which will calculate the sum
		 * of even and odd numbers for that array.
		 */

		int[][] number = { { 100, 111, 13, 34, 55 }, { 21, 8, 66, 67, 72 } };
		int evenSum = 0;
		int oddSum = 0;
		for (int[] num : number) {
			for (int n : num) {
				if (n % 2 == 0) {
					evenSum += n;
				} else {
					oddSum = oddSum + n;
				}
			}
		}
		System.out.println("The sum of even numbers is: " + evenSum);
		System.out.println("The sum of odd numbers is: " + oddSum);

	}

}
