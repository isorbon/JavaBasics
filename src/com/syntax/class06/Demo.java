package com.syntax.class06;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp = new Scanner(System.in);

		int i = 1;

		while (i <= 5) {
			System.out.println("Enter your name and age");

			String name = inp.next();
			int age = inp.nextInt();

			System.out.println("Your name is " + name + " and you are " + age + " years old");
			
			i++;
		}
		
	}

}
