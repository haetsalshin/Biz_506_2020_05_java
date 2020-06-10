package com.haetsal;

public class Ex_20200611 {
	public static void main(String[] args) {
		
		int a = 30;
		int b = 15;
		int c = 20;
		
		if( a > b) { // a = 30, b = 15
			int temp=0;

			temp = a; // temp = 30;
			a = b; // a = 15;
			b = temp; // b = temp = 30;
			
		}if( b > c) {
			
			int temp = 0;
			temp = b ;
			b = c ;
			c = temp;

			System.out.println(a + "<"+ b + "<"+ c);
		}
		
	}

}
