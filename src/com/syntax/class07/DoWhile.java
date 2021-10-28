package com.syntax.class07;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		// CODE USING WHILE LOOP
		int a = 1;

		while (a <= 3) {
			System.out.println("Hi");

			a++;
		}

		// CODE USING DO WHILE LOOP
		int b = 1;

		do {
			System.out.println("Hello");
			b++;
		} while (b <= 3);

		// Guess Number with do while
		int i = 78;
		Scanner inp = new Scanner(System.in);
		int num;

		do {
			System.out.println("Guess a secret number");
			num = inp.nextInt();

		} while (num != i);

		System.out.println("You got it !!!");

		
	}

}
