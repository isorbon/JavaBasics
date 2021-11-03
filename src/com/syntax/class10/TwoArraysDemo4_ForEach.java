package com.syntax.class10;

public class TwoArraysDemo4_ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] numbers = { { 100, 200, 300 }, { 9, 8, 7 }, };
		
		System.out.println("Size of 2D array = " + numbers.length);

		System.out.println(numbers[1][1]); // 8

		// get all elements using regular for loop
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
		}
		System.out.println();

		// get all elements using for each loop

		for (int[] num : numbers) {
			for (int n : num) {
				System.out.print(n + " ");
			}
		}
		System.out.println();

	}

}
