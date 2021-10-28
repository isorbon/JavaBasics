package com.syntax.class05;

import java.util.Scanner;

public class ClassTask {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Please enter your heights in inches");
		int height = inp.nextInt();

		if (height < 60) {
			System.out.println("Short");
		} else if (height > 60 && height < 72) {
			System.out.println("Medium");
		} else if (height > 72) {
			System.out.println("Tall");
		} else {
			System.out.println("wrong");
		}
	}

}
