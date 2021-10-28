package com.syntax.class07;

public class Tasks_3 {

	public static void main(String[] args) {
		// Print numbers from 1 to 100 in 1 line with space
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}
		System.out.println("----------");
		// Print numbers from 100 to 1
		for (int i = 100; i >= 1; i--) {
			System.out.print(i + " ");
		}
		System.out.println("----------");
		// Print even numbers from 20 to 1 (1 way)
		for (int i = 20; i >= 1; i -= 2) {
			System.out.print(i + " ");
		}
		System.out.println("----------");
		// Print even numbers from 20 to 1 (2 way)
		for (int i = 20; i >= 1; i--) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("----------");
		// Print odd numbers between 20 and 50 (1 way)
		for (int i = 20; i <= 50; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("----------");
		// Print odd numbers between 20 and 50 (2 way)
		for (int i = 21; i <= 50; i += 2) {
			System.out.print(i + " ");
		}

	}

}
