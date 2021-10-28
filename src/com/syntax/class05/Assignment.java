package com.syntax.class05;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		System.out.println("Please enter cuurent time");
		int time = inp.nextInt();
		
		if (time >= 1 && time <= 11) {
			System.out.println("Morning");
		}else if (time >= 12 && time <= 15) {
			System.out.println("Afternoon");
		}else if(time >=16 && time <= 20) {
			System.out.println("Evening");
		}else if(time >= 21 && time <= 24) {
			System.out.println("Night");
		}else {
			System.out.println("No valid time entered");
		}
		
		System.out.println("**************************");
		
		String timeDay;
		
		if (time >= 1 && time <= 11) {
			timeDay="Morning";
		}else if (time >= 12 && time <= 15) {
			timeDay="Afternoon";
		}else if(time >=16 && time <= 20) {
			timeDay="Evening";
		}else if(time >= 21 && time <= 24) {
			timeDay="Night";
		}else {
			timeDay = "Invalid";
		}
		
		System.out.println("The time is " + timeDay);
		
	}

}
