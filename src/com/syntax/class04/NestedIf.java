package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean diploma = true;
		double gpa = 4;

		if (diploma) {
			System.out.println("Congratulations");

			if (gpa >= 3.5) {
				System.out.println("You are eligible for scholarship");
			} else {
				System.out.println("You should have studied harder");
			}
		} else {
			System.out.println("You should get a degree");
		}

		System.out.println("**************************");

		double rate = 2.5;
		int price = 355000;

		if (rate > 4.5) {
			System.out.println("You cannot buy a house");
		} else {
			System.out.println("You can buy a house");

			if (price > 200000) {
				System.out.println("take a loan");
			} else {
				System.out.println("pay cash");
			}

		}

		System.out.println("**************************");

		int donor = 22;
		int weight = 120;

		if (donor >= 18) {
			System.out.println("You are eligible to donate your blood");

			if (weight > 110) {
				System.out.println("Your wieght is eligible");
			} else {
				System.out.println("Un fortunatell, your wieght is not eligible. We cannot accept such a patient");
			}
		} else {
			System.out.println("You are not eligible to donate your blood");
		}

	}

}
