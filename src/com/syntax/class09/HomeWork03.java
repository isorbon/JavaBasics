package com.syntax.class09;

public class HomeWork03 {

	public static void main(String[] args) {
		/*
		 * Create an array to store double values and then print those in reverse order
		 */
		
		double[] num = new double[6];
		
		num[0] = 12.11;
		num[1] = 15.21;
		num[2] = 16.04;
		num[3] = 17.22;
		num[4] = 18.33;
		num[5] = 19.03;
		
		for(int i=num.length-1; i>=0; i--) {
			System.out.println(num[i] + " ");
		}
		

	}

}
