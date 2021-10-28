package com.syntax.class05;

import java.util.Scanner;

public class LogicalAnd {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number between 1-1000");
		int num = input.nextInt();
		if (num < 1) {
			System.out.println("Number is smaller than 0");
		} else if (num >= 1 && num <= 10) {
			System.out.println("small number");
		} else if (num > 10 && num <= 100) {
			System.out.println("medium number");
		} else if (num > 100 && num <= 1000) {
			System.out.println("Large number");
		} else if (num >= 1001) {
			System.out.println("Extra large number");
		} 
	}

}
