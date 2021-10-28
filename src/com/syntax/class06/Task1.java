package com.syntax.class06;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Please, enter your country");
		String country = inp.next();
		String lang;

		switch (country.toUpperCase()) {
		case "USA":
		case "ENGLAND":
		case "AUSTRALIA":
			lang = "English";
			break;
		case "UKRAINE":
			lang = "Ukrainian";
			break;
		case "TAJIKISTAN":
			lang = "Tajik";
			break;
		case "KAZAKHSTAN":
			lang = "Kazakh";
			break;
		default:
			lang = "Unknown";
			break;
		}
 
		if (!lang.equals("Unknown")) {
			System.out.println("In " + country.toUpperCase() + " speaks " + lang + " language");
		} else {
			System.out.println("Please try another country");
		}
	}

}
