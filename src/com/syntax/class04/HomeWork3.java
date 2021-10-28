package com.syntax.class04;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		/*
		 * You are DMV representative and you need to ask customer their age. If they
		 * are 18 and older you will issue a driver license to them, otherwise you will
		 * offer them to get a learners permit.
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("How old are you?");
		int age = input.nextInt();

		if (age >= 18) {
			System.out.println("You can get a driver license");
		} else {
			System.out.println("You need to get a learners permit");
		}

	}

}
