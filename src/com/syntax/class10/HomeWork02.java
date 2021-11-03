package com.syntax.class10;

public class HomeWork02 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array in which first array will consist of 4 grades and second
		 * array will contain grades. Then your program should print grade of the
		 * students that has A and B grade
		 */
	
		String[][] grade = {
				{"Smith", "Jordan", "Jackson", "Obama"},
				{"A grade", "B grade"}
		};
		
		System.out.println(grade[0][1]+" - "+grade[1][0]);
		System.out.println(grade[0][0]+" - "+grade[1][1]);
		System.out.println(grade[0][2]+" - "+grade[1][1]);
		System.out.println(grade[0][3]+" - "+grade[1][0]);
		
	}

}
