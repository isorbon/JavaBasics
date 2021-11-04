package com.syntax.TeamProject01;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		/*
		 * Create an array of double values using scanner and calculate the sum of all
		 * stored elements in that array.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter how many elements you like to store inside your array");
		int numOfElem = scan.nextInt();

		System.out.println("Please enter your elements");
		double[] elements = new double[numOfElem];

		double sum = 0;
		for (int i = 0; i < elements.length; i++) {
			elements[i] = scan.nextDouble();
			sum += elements[i];
		}
		System.out.println("The sum of all elements in the array is " + sum);

	}

}
