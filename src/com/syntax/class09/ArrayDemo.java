package com.syntax.class09;

public class ArrayDemo {
	public static void main(String[] args) {
		
		int[] num = {100, 200, 300, 400, 500};
		
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		for(int n:num) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		String[] color = {"red", "yellow", "green"};
		
		for(String col:color) {
			System.out.print(col + " ");
		}

	}
}
