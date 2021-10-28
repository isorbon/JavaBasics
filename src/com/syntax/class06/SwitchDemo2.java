package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo2 {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		System.out.println("Please, enter your country");
		String country = inp.next();
		String food;
		
		switch(country) {
		case "USA":
			food = "Burger";
			food = "ho";
			break;
		case "Ukraine":
			food = "Borsh";
			break;
		case "Tajikistan":
			food = "Mantu";
			break;
		case "Kazakhstan":
			food = "Beshbarmak";
			break;
		default:
			food = "Unknown";
			break;
		}
		
		if(!food.equals("Unknown")) {
		System.out.println("In " + country + " a favourite food is " + food);
		} else {
			System.out.println("Please try another country");
		}
	}

}
