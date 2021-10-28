package com.syntax.class07;

public class NestedLoops {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + " ");
			for (int j = 2; j <= 5; j++) {
				System.out.print(i + " " + j);
			}
			
			System.out.println(" ");
		}

	}

}
