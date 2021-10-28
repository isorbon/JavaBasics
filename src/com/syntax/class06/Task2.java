package com.syntax.class06;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Please, enter your Grade");
		char grade = inp.next().charAt(0);
		String explanation;

		switch (grade) {
		case 'A':
			explanation = "Excellent";
			break;
		case 'B':
			explanation = "Good";
			break;
		case 'C':
			explanation = "Average";
			break;
		case 'D':
			explanation = "Bad";
			break;
		default:
			explanation = "Not Acceptable";
			break;
		}

		if (!explanation.equals("Not Acceptable")) {
			System.out.println(grade + "-" + explanation);
		} else {
			System.out.println("Please enter another Grade");
		}

	}

}
