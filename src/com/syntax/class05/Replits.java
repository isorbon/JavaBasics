package com.syntax.class05;

import java.util.Scanner;

public class Replits {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Do you need a loan?");
		boolean answer = inp.nextBoolean();
		String eligibility = null;

		if (answer) {
			System.out.println("What is your credit score?");
			int score = inp.nextInt();

			if (score <= 600) {
				eligibility = "Not eligible";
			} else if (score >= 600 && score <= 700) {
				eligibility = "Maybe eligible";
			} else if (score >= 701 && score <= 800) {
				eligibility = "Eligible";
			} else if (score >= 801) {
				eligibility = "Definitely eligible";
			}

			System.out.println("The eligibility is " + eligibility);

		} else {
			System.out.println("Unknown");
		}

	}

}
