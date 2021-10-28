package com.syntax.class02;

public class ArithmeticCode {

	public static void main(String[] args) {
		// Some of Arithmetic examples

		int a = 35;
		int b = 5;

		int sum = a + b;
		System.out.println("The result is " + sum);
		System.out.println("Summa of " + a + " and " + b + " is = " + sum);

		double c = 25.99;
		double d = 13.78;
		double divResult = c / d;
		System.out.println("\nThe result is " + divResult);
		System.out.println("Division of " + c + " and " + d + " is = " + divResult);

		float e = 52.43f;
		float f = 13.99f;
		float floatResult = e * f;
		System.out.println("\nThe result is " + floatResult);
		System.out.println("Multiplication of " + e + " and " + f + " is = " + floatResult);

		int x = 465;
		int y = 59;

		long mathMultiply = (x + a) * (y - b);
		System.out.println("\nMultiplication in brackets is = " + mathMultiply);

		int mathDivision = (a - x) / (b + y);
		System.out.println("\nDivision in brackets is = " + mathDivision);

		int mathDivisionMix = (a - y + b) * x;
		System.out.println("\nDivision in brackets is = " + mathDivisionMix);
		System.out.println("\n(" + a + "-" + y + "+" + b + ")" + x + " = " + mathDivisionMix);

		int modOp = a % y;
		System.out.println("\nRemainder is = " + modOp);

		int modOp2 = (a % y) * b + x;
		System.out.println("\nRemainder is = " + modOp2);

		String word1 = "Hello, ";
		String word2 = "World!";

		System.out.println(word1 + word2 + " " + a + b);
		System.out.println(word1 + word2 + " " + (a + b));
		System.out.println(word1 + word2 + " " + sum);

	}

}
