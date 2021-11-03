package com.syntax.class10;

public class TwoArraysDemo2 {

	public static void main(String[] args) {
		// let's create an 2D array of groceries

		String[][] groceries = { 
				{ "banana", "apple", "mango" }, 
				{ "potato", "tomato" },
				{ "milk", "cheese", "ayran", "yogurt" } 
				};

		System.out.println(groceries.length); // 3
		System.out.println(groceries[2][3]); // yogurt

		// I want to find how many elements my 1 array has
		System.out.println("# of elemants inside 1 array = " + groceries[0].length);
		System.out.println("# of elemants inside 2 array = " + groceries[1].length);
		System.out.println("# of elemants inside 3 array = " + groceries[2].length);

		//how do we get all elements from 2 array??
		int total=0;
		
		for (int i = 0; i < groceries.length; i++) {
			for (int j = 0; j < groceries[i].length; j++) {
				System.out.print(groceries[i][j] + " ");
				total++;
			}
			System.out.println();
		}
		System.out.println("#" + total);
		System.out.println("---------------");
	}

}
