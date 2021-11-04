package com.syntax.TeamProject01;

import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		/*
		 * Write a Java Program to print the first 10 numbers of Fibonacci series.
		 */
		
		System.out.println("First 2 elements of Fibonacci sequence are F[0]=0 & F[1]=1.");
		System.out.println("Enter a number >= 2 for the size of the Fibonacci Sequence you would like to generate");
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		if (size <= 1) {
			System.out.print("You need to enter a number greater than 1.");
		} else {
			int F[] = new int[size];
			F[0] = 0;
			F[1] = 1;
			for (int i = 2; i < size; i++) {
				F[i] = F[i - 1] + F[i - 2];
			}
			System.out.print("Fibonacci Sequence F[" + size + "]: ");
			for (int j = 0; j <= size - 2; j++) {
				System.out.print(F[j] + ", ");
			}
			System.out.print(F[size - 1]);
		}

	}

}
