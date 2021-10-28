package com.syntax.class05;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		/*
		 * Write a program for user to enter his/hers birth month. Based on the month
		 * define the season. Example: if user is born in June, July or August → season
		 * =“Summer”. At the end of the program we should see output as “You were born
		 * is season ______“.
		 */

		Scanner inp = new Scanner(System.in);
		System.out.println("Please, enter your birth month");
		String month = inp.next();
		String season;

		if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("Jenuary")
				|| month.equalsIgnoreCase("February")) {
			season = "Winter";
		} else if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April")
				|| month.equalsIgnoreCase("May")) {
			season = "Spring";
		} else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July")
				|| month.equalsIgnoreCase("August")) {
			season = "Summer";
		} else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October")
				|| month.equalsIgnoreCase("November")) {
			season = "Autumn";
		} else {
			season = "Invalid";
		}
		
		if (!season.equals("Invalid")) {
		System.out.println("You were born is season " + season);
		}
	}

}
