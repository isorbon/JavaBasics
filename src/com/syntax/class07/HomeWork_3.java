package com.syntax.class07;

import java.util.Scanner;

public class HomeWork_3 {

	public static void main(String[] args) {
		int priceItem = 10;
		int payUser = 0;
		int accumulation = 0;

		Scanner inp = new Scanner(System.in);
		System.out.println("What do you want to buy?");
		String item = inp.next();
		System.out.println("The " + item + " costs $" + priceItem);
		System.out.println("Please, pay for the item");
		do {
			accumulation += inp.nextInt();

			if (accumulation < priceItem) {
				System.out.println(
						"You still need to pay $" + (priceItem - accumulation) + 
						". Please, enter the remainder.");
			} else if (accumulation > priceItem) {
				System.out.println("Your change is $" + (accumulation - priceItem));
				break;
			}

		} while (accumulation != priceItem);

		System.out.println("Thank you for shopping!");
	}

}
