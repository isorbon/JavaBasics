package com.syntax.class08;

public class HomeWork04 {

	public static void main(String[] args) {
		/*
		 *  Complete clock assignment
		 */

		for (int i = 0; i < 24; i++) {
			for (int j = 0; j < 60; j++) {
				if (i < 10 && j < 10) {
					System.out.println("0" + i + ":" + "0" + j);
				} else if (i >= 10 && j < 10) {
					System.out.println(i + ":" + "0" + j);
				} else if (i < 10 && j >= 10) {
					System.out.println("0" + i + ":" + j);
				} else {
					System.out.println(i + ":" + j);
				}
			}
		}
	}

}
