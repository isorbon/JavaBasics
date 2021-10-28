package com.syntax.class05;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Please enter 3 numbers");
		double num1 = inp.nextDouble();
		System.out.println("Please enter 2-nd numbers");
		double num2 = inp.nextDouble();
		System.out.println("Please enter 3-rd numbers");
		double num3 = inp.nextDouble();

		double largest = 0;

		if (num1 >= num2 && num1 > num3) {
			largest = num1;
		} else if (num2 > num1 && num2 >= num3) {
			largest = num2;
		} else if (num3 >= num1 && num3 > num2) {
			largest = num3;
		}

		boolean isEven;

		if (largest % 2 == 0) {
			isEven = true;
		} else {
			isEven = false;
		}

		System.out.println(largest + " number is even " + isEven);
	}

}
