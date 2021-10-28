package com.syntax.class05;

import java.util.Scanner;

public class ClassTask3 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Please enter 3 numbers");
		int num1 = inp.nextInt();
		System.out.println("Please enter 2-nd numbers");
		int num2 = inp.nextInt();
		System.out.println("Please enter 3-rd numbers");
		int num3 = inp.nextInt();
		
		if(num1 == num2 && num1==num3) {
			System.out.println("Numbers are equal");
		}else {
			if(num1 > num2 && num1 > num3) {
				System.out.println("The 1-st number is larger");
			}else if(num2 > num1 && num2 > num3) {
				System.out.println("The 2-nd number is larger");
			}else if(num3 > num1 && num3 > num2) {
				System.out.println("The 3-rd number is larger");
			}
		}
		

	}

}
