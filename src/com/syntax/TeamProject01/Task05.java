package com.syntax.TeamProject01;

public class Task05 {

	public static void main(String[] args) {
		/*
		 * Create an array of countries. While retrieving all values from an array print
		 * capital for each country. (use 2 different loops).
		 */

		String[] countries = { "Macedonia", "Serbia", "Bulgaria", "Turkey" };

		for (int i = 0; i < countries.length; i++) {

			switch (countries[i]) {

			case "Macedonia":
				System.out.println(countries[i] + " " + "Skopje");
				break;
			case "Serbia":
				System.out.println(countries[i] + " " + "Belgrade");
				break;
			case "Bulgaria":
				System.out.println(countries[i] + " " + "Sofia");
				break;
			case "Turkey":
				System.out.println(countries[i] + " " + "Ankara");
				break;
			}
		}

		System.out.println("-----------------------------------------");

		for (String cou : countries) {

			if (cou.equals("Macedonia")) {
				System.out.println("Skopje");
			} else if (cou.equals("Serbia")) {
				System.out.println("Belgrade");
			} else if (cou.equals("Bulgaria")) {
				System.out.println("Sofia");
			} else if (cou.equals("Turkey")) {
				System.out.println("Ankara");
			}
		}

	}

}
