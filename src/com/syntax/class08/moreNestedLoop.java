package com.syntax.class08;

public class moreNestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				for(int x=0; x<3; x++) {
					for(int y=0; y<3; y++) {
						System.out.println(i + " " + j + " " + x + " " + y);
					}
				}
			}
		}
	}

}
