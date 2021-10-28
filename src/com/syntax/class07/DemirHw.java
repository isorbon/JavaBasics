package com.syntax.class07;

import java.util.Scanner;

public class DemirHw {

	public static void main(String[] args) {
		System.out.println("What do you want to buy");
		Scanner input = new Scanner(System.in);
		String item = input.next();
		
		System.out.println("What is the price of " + item + "?");
		double price = input.nextDouble();
		double balance = price;
		double installment = 0;
		while (balance > 0) {
			System.out.println("Enter how much you would like to pay in your " + installment + "th installment?");
			double payment = input.nextDouble();
			balance -= payment;
			if (balance > 0) {
				System.out.println("Your remaining balance is " + balance);
				installment++;
			} else
				System.out.println("Your change is " + (0 - balance) + ". Thank you for shopping with us!!!");
		}

	}

}
