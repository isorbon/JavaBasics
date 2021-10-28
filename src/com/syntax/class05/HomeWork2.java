package com.syntax.class05;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		/*
		 * Write a program that will read three inputs of scores (quiz, mid term, and
		 * final scores) and determine the grade based on the following rules:
		 * 
		 * if the average score >=90 → grade=A if the average score >= 70 and <90 →
		 * grade=B if the average score>=50 and <70 → grade=C if the average score<50 →
		 * grade=F
		 */

		Scanner inp = new Scanner(System.in);
		System.out.println("Please, enter your Quiz score");
		int scoreQuiz = inp.nextInt();
		System.out.println("Please, enter your Mid term score");
		int scoreMid = inp.nextInt();
		System.out.println("Please, enter your Final score");
		int scoreFinal = inp.nextInt();

		int avarage = (scoreQuiz + scoreMid + scoreFinal) / 3;

		String grade;

		if (avarage >= 90) {
			grade = "A";
		} else if (avarage >= 70 && avarage < 90) {
			grade = "B";
		} else if (avarage >= 50 && avarage < 70) {
			grade = "C";
		} else if (avarage < 50) {
			grade = "F";
		} else {
			grade = "Invalid";
		}

		System.out.println("Your avarage score is " + avarage);

		System.out.println("Your grade is " + grade);

	}

}
