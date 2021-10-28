package com.syntax.class04;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("What is your name?");
		
		String name = input.next();
		System.out.println("How old are you?");
		
		int age = input.nextInt();
		System.out.println("Your name is " + name + " and you are " + age + " years old");
		
		
	}

}
