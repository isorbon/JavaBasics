package com.syntax.class04;

import java.util.Scanner;

public class HomeWork4 {

	public static void main(String[] args) {
		/*
		 * Create a Java program that will ask user to input city and temperature. Your
		 * program should convert Fahrenheit into celsius and print “The temperature is
		 * the city __ is __”
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("What is you City?");
		String city = input.nextLine();

		System.out.println("What is the temperature in your city?");
		int temFahrenheit = input.nextInt();

		int tempCelsius = ((temFahrenheit - 32) * 5) / 9;

		System.out.println("The temperature is the city " + city + " is " + tempCelsius + " C.");
	}

}
