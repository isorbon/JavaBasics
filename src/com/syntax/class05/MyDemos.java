package com.syntax.class05;

import java.util.Scanner;

public class MyDemos {

	public static void main(String[] args) {
		/*
		 * Scanner inp = new Scanner(System.in); System.out.println("Enter 2 numbers");
		 * int num1 = inp.nextInt(); int num2 = inp.nextInt();
		 * 
		 * boolean isEqual; if(num1 == num2){ isEqual = true; } else{ isEqual = false; }
		 * 
		 * System.out.println(isEqual);
		 * 
		 * System.out.println("The largest number is " + Math.max(num1, num2)); String
		 * name = "Sorbon "; String lname = "Imomnazar";
		 * System.out.println(name.concat(lname));
		 * System.out.println(name.indexOf("S"));
		 */
		
		 float fl = 5.3f;
		   if (fl == 5.3) {
		      System.out.println("Both are equal");
		   } else {
		      System.out.println("Both are not equal");
		   }
		
		boolean a, b, c;
	     a = b = c = true;

	          if( !a || ( b && c ) ) {
	             System.out.println("If executed");
	          } else {
	             System.out.println("else executed");
	          }
		
		
	}

}
