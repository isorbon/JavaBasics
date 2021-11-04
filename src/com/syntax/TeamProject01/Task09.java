package com.syntax.TeamProject01;

public class Task09 {

	public static void main(String[] args) {
		/*
		 * Maximum and minimum number in the array?
		 */
		
		int[] n = { 5, 100, 1, 67, 30, 17, 19, 55, 60 };
		
		int minValue = n[0];
		int maxValue = n[0];
		for (int j = 0; j < n.length; j++) {
			if (n[j] < minValue) {
				minValue = n[j];
			} else if (n[j] > maxValue) {
				maxValue = n[j];
			}
		}
		System.out.println("Minimum value is " + minValue);
		System.out.println("Maximum Value is " + maxValue);

	}

}
