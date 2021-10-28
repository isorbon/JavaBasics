package com.syntax.class04;

import java.util.Scanner;

public class MyPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp = new Scanner(System.in);
		System.out.println("Enter you number");
		
		int n = inp.nextInt();

		if (n % 2 == 0) {
			System.out.println("Not Weird");
		} else {
			System.out.println("Weird");
		}
		
		System.out.println("****************************");
		System.out.println("Enter you number 2");
		
		int n2 = inp.nextInt();

		if (n2 % 2 == 0 || n2 > 2 || n2 < 5) {
			System.out.println("Not Weird");
		} else {
			System.out.println("Weird");
		}
	}

}
