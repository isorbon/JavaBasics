package com.syntax.class09;

public class HomeWork04 {
	public static void main(String[] args) {
		/*
		 * Create an array on integers and calculate the sum of all elements in an array
		 */
		
		int[] num = {2, 35, 6, 18, 9, 46, 33, 71};
		int sum = 0;
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + " ");
			sum += num[i];
		}
		System.out.println("\nThe sum of all array's elements is = " + sum);
	}
}
