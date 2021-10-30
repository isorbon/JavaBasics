package com.syntax.class07;

public class NestedLoops {

	public static void main(String[] args) {
		for (int i = 0; i <= 3; i++) {

			for (int j = 0; j <= 3; j++) {
				if (i == 1 || i == 2) {
					if (j == 1 || j == 2) {
						System.out.print(" ");
					} else {
						System.out.print("$");
					}
				} else {
					System.out.print("$");
				}
			}
			System.out.println();
		}

	}

}
