package com.syntax.class05;

import java.util.Scanner;

public class ClassTask2 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Please enter a number of day");
		int weekday = inp.nextInt();
		
		if(weekday >= 1 && weekday <= 5) {
			System.out.println("It is a weekday");
		}else if(weekday >= 6 && weekday <= 7) {
			System.out.println("It is a weekday");
		}else {
			System.out.println("Invalid day");
		}

	}

}
