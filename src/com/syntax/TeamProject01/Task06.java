package com.syntax.TeamProject01;

public class Task06 {

	public static void main(String[] args) {
		/*
		 * Write a program to swap 2 numbers without a temporary variable? 
		 */

		int a = 10;
		int b = 20;
		a = b + a;
		b = a - b;
		a = a - b;

		System.out.print("int a =" + a + " and int b = " + b);

	}

}
