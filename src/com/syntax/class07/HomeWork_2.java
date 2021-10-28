package com.syntax.class07;

public class HomeWork_2 {

	public static void main(String[] args) {
		// Calculate sum of all Odd numbers from range 1 to 100

		int odd = 0;
		System.out.println("Odd numbers:");
		for (int i = 1; i <= 100; i += 2) {
			System.out.print(i + " ");
			odd += i;
		}
		System.out.println("\nThe sum is = " + odd);

	}

}
