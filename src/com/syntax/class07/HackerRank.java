package com.syntax.class07;

import java.util.Scanner;

public class HackerRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		
		int sum = A.toLowerCase().length() + B.toLowerCase().length();
		
		System.out.println(sum);
		
		if(A.compareTo(B) > B.compareTo(A)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		String upA = A.substring(0,1).toUpperCase() + A.substring(1);
		String upB = B.substring(0,1).toUpperCase() + B.substring(1);
		System.out.println(upA + " " + upB);
	}

}
