package com.syntax.class06;

public class HomeWork_6_While {

	public static void main(String[] args) {
		// Print only odd numbers from 100 to 1

		int b = 100;
		while (b >= 1) {
			if (b % 2 != 0) {
				System.out.print(b + " ");
			}
			b--;
		}

	}

}
