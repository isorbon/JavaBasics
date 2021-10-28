package com.syntax.class05;

import java.util.Scanner;

public class LogicalOrDemo {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Please enter today's day");
		String day = inp.next();
		
		if(day.equalsIgnoreCase("monday") || day.equalsIgnoreCase("friday")){
			System.out.println("No Class");
		}else if(day.equalsIgnoreCase("tuesday") || day.equalsIgnoreCase("wednsday")){
			System.out.println("Manual Class");
		}else if(day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("sunday")){
			System.out.println("Java  Class");
		}else {
			System.out.println("We have no class that day");
		}
	}

}
