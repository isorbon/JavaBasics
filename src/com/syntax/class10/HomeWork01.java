package com.syntax.class10;

public class HomeWork01 {

	public static void main(String[] args) {
		/*
		 * Retrieving 1 element from 2D Array 
		 * Create a 2D array where you will store the following values: 
		 * Mr, Mrs, Ms, Miss and Smith, Jordan, Jackson, Obama. After
		 * storing values print the following String: Mrs Smith, Mr Obama, Ms Jackson,
		 * Miss Jordan.
		 */
		
		String[][] name = {
				{"Mr", "Mrs", "Ms", "Miss"},
				{"Smith", "Jordan", "Jackson", "Obama"}
		};
		System.out.println(
				(name[0][1]+" "+name[1][0])+", "+
				(name[0][0]+" "+name[1][3])+", "+
				(name[0][2]+" "+name[1][2])+", "+
				(name[0][3]+" "+name[1][1])
				);

	}

}
