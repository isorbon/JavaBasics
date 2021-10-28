package com.syntax.class03;

public class TypeCasting {

	public static void main(String[] args) {

		// Widening Casting(Implicit/ Automatic)
		
		int num = 10; // define
		double num2 = num; // define
		System.out.println(num2);

		// Narrowing Casting(Explicit/ Manual)

		double num3 = 10; // define
		int num4; // define
		num4 = (int) num3; // assigning
		System.out.println(num4);

	}

}
