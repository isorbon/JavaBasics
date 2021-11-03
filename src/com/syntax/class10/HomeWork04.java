package com.syntax.class10;

public class HomeWork04 {

	public static void main(String[] args) {
		/*
		 * Using 2D array create a grocery list. Inside you should have an array of
		 * veggies, fruits, dairy and sweets. Retrieve all values from that array using
		 * 2 different loops
		 */
		
		String[][] grocery = {
				{"broccoli", "cabbage", "asparagus", "potato", "tomatoes", "carrot"}, //veggies
				{"apples", "oranges", "watermelon", "bananas", "mangoes"}, //fruits
				{"milk", "butter", "cheese", "yogurt"}, //dairy
				{"charlotte", "candies", "eclairs", "biscuits", "waffles"} //sweets
		};
		
		// get all elements using regular for loop
		for(int i=0; i<grocery.length; i++) {
			for(int j=0; j<grocery[i].length; j++) {
				System.out.print(grocery[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------");
		
		// get all elements using for each loop
		for(String[] groc:grocery){
			for(String g:groc) {
				System.out.print(g + " ");
			}
			System.out.println();
		}
	}

}
