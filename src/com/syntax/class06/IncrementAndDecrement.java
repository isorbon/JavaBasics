package com.syntax.class06;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		/*
		 int i=1;
		  while(i<=20) { 
		  System.out.println("bla-bla"); 
		  i++; 
		  }
		  
		  int y=50; 
		  while(y>=1) { 
		  System.out.println("bla2"); 
		  y--; 
		  }
		 */
		int b = 2;
		while (b <= 10) {
			System.out.println(b);
			b += 2;
		}
		int a = 1;
		while (a <= 10) {
			if (a % 2 == 0) {
				System.out.println(a);
			}
			a++;
		}

	}

}
