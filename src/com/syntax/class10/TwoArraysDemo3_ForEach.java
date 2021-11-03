package com.syntax.class10;

public class TwoArraysDemo3_ForEach {

	public static void main(String[] args) {
		// 2d array is array of arrays
		
		String[][] groceries = { 
				{ "banana", "apple", "mango" }, 
				{ "potato", "tomato" },
				{ "milk", "cheese", "ayran", "yogurt" } 
		};
		
		//for each loop 
		
		for(String[] grocery:groceries) {
			
			for(String gro:grocery) {
				System.out.print(gro + " ");
			}
			System.err.println();
		}
		
	}

}
