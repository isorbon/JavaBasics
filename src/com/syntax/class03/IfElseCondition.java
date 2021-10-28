package com.syntax.class03;

public class IfElseCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temp = 50;

		if (temp >= 60) {
			System.out.println("I am going to beach");
		} else {
			System.out.println("I will go for a walk");
		}

		System.out.println("****************");
		
		String userName = "Aysha";
		if (userName.equals("Gorge")) {
			System.out.println("Hi Gorge");
		} else {
			System.out.println("I don't know");
		}
		
		System.out.println("****************");
		
		if (userName != "Gorge") {
			// for String only == and != are allowed
			// but not recommended to use
			System.out.println("Hi Gorge");
		} else {
			System.out.println("I don't know");
		}
		
		System.out.println("****************");
		
		
		
		
		
	}

}
