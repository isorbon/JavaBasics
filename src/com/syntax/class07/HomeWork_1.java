package com.syntax.class07;

public class HomeWork_1 {

	public static void main(String[] args) {
		// Calculate sum of all Even numbers from range 1 to 100

		int even = 0;
		
		System.out.println("Even numbers:");
		for (int i = 2; i <= 100; i += 2) {
			System.out.print(i + " ");
			even += i;
		}
		System.out.println("\nThe sum is = " + even);

	}

}
