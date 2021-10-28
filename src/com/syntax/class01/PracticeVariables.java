package com.syntax.class01;

public class PracticeVariables {

	public static void main(String[] args) {
		// representing and storing whole numbers
		byte bmin = -128; // range from -128 till 127
		byte bmax = 127;

		short shmin = -32768; // range from -32768 to 32767
		short shmax = 32767;

		int imin = -2147483648;
		int imax = 2147483647;

		long longg = 982365651213543210l;

		// representing and storing decimal numbers
		float dec1 = 10.269f;
		double dec2 = 268.215487656;

		// representing and storing single numbers
		char letter = 'G';
		char number = '2';
		char character = '$';

		// representing and storing boolean values (yes or no)
		boolean truth = true; // yes
		boolean lie = false; // no

		// Printing of variables
		System.out.println(" Whole numbers:");
		System.out.println("byte min=" + bmin);
		System.out.println("byte max=" + bmax);
		
		System.out.println("short min=" + shmin);
		System.out.println("short max=" + shmax);
		
		System.out.println("int min=" + imin);
		System.out.println("int max=" + imax);

		System.out.println("long=" + longg);
		
		System.out.println("\n Decimal numbers:");
		System.out.println("float=" + dec1);
		System.out.println("double=" + dec2);
		
		System.out.println("\n Single numbers:");
		System.out.println("char letter=" + letter);
		System.out.println("char number=" + number);
		System.out.println("char character=" + character);
		
		System.out.println("\n Boolean values:");
		System.out.println("boolean truth=" + truth);
		System.out.println("boolean lie=" + lie);

	}

}
