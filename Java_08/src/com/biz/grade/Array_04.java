package com.biz.grade;

public class Array_04 {
	
	public static void main(String[] args) {
		
		
		
		for(int i =2; i <101; i++) {
			System.out.printf("%d \t\t %d \t\t %d \t\t %d \t\t %d\n",i-1,i++,i++,i++,i++);
		}
		
		
		for(int i = 1; i <= 100 ; i ++) {
			System.out.printf("%d \t",i);
			if( i % 5 == 0) {
				System.out.println("");
			}
		} 
		
	}

}
