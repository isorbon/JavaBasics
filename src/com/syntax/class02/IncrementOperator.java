package com.syntax.class02;

public class IncrementOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		System.out.println(num);
		
		num=num+1;
		num=num+num;
		System.out.println(num);		
		System.out.println("**************");
		
		num++; //increments the value by one
		System.out.println(num);
		System.out.println("**************");
		
		num+=1;
		System.out.println(num);
		System.out.println("**************");
		
		num=10;
		num-=3;
		System.out.println(num);
		System.out.println("**************");
		
		num = 10;
		num *= 3;
		System.out.println(num);
		System.out.println("**************");
		
		num = 10;
		num /= 5;
		System.out.println(num);
		System.out.println("**************");
		
		num = 10;
		num %= 5;
		System.out.println(num);
		System.out.println("**************");
		
		int number=10;
		number++;
		System.out.println(number);
		
	}

}
