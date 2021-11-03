package com.syntax.class10;

public class HomeWork03 {

	public static void main(String[] args) {
		/*
		 * Retrieving all elements from 2D array Create 2D array of cars : american,
		 * german, korean, italian. Then retrieve all values from that array using 2
		 * different loops
		 */
		
		String[][] cars = {
				{"Chevrolet", "Ford", "Lincoln", "Hummer", "Cadillac", "Chrysler", "Dodge"}, //american
				{"BMW", "Mercedes-Benz", "Audi", "Volkswagen", "Porsche"}, //german
				{"Kia", "Hyundai", "Genesis", "SsangYong", "Daewoo"}, //korean
				{"Ferrari", "Lamborghini", "Fiat", "Alfa Romeo", "Maserati"} //italian
		};
		
		// get all elements using regular for loop
		for(int i=0; i<cars.length; i++){
			for(int j=0; j<cars[i].length; j++) {
				System.out.print(cars[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------");
		
		// get all elements using for each loop
		for(String[] car:cars) {
			for(String c:car) {
				System.out.print(c + " ");
			}System.out.println();
		}
		
		
		

	}
}
