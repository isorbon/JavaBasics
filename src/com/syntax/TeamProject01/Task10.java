package com.syntax.TeamProject01;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array?

		Scanner inp = new Scanner(System.in);
		int size, temp;
		System.out.print("Please enter the Array's size: ");
		size = inp.nextInt();

		int[] num = new int[size];

		System.out.println("Please enter the Array's numbers:");
		for (int i = 0; i < size; i++) {
			num[i] = inp.nextInt();
		}

		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (num[i] < num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.println("The Second largest number is = " + num[1]);

	}

}
