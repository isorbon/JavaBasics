package com.syntax.TeamProject01;

public class Task01 {

	public static void main(String[] args) {
		// Create a 2D array of integer values. Print the sum of all numbers.

		int sum = 0;
		int[][] num = { { 12, 45, 36, 98, 79 }, { 32, 64, 97, 4, 96, 71, 65 }, { 64, 6, 57, 1 } };
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				sum = sum + num[i][j];
			}
		}
		System.out.println("Sum of all number is: " + sum);
		System.out.println("*********************************");
		sum = 0;
		for (int[] total : num) {
			for (int T : total) {
				sum = sum + T;
			}
		}
		System.out.print("Sum of all number is: " + sum);

	}

}
