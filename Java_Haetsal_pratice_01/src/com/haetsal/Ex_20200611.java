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
			
		
		// 피보나치 수열 계산하기 1 1 2 3 5 8 
		
		int fiboFibo[] = new int[10];
		System.out.println("==================================================================");
		System.out.println("피보나치수열");
		System.out.println("------------------------------------------------------------------");
		
		
		
		for(int i = 1; i <fiboFibo.length; i++) {
		if(i < 3) {
			fiboFibo[i] = 1;
			System.out.printf("%s\t",fiboFibo[i]);
			}else {
			fiboFibo[i] = fiboFibo[i-2]+fiboFibo[i-1];
			System.out.printf("%s\t",fiboFibo[i]);
			}
		}
		System.out.println();
		System.out.println("============================================");
		
		
		// if중첩문 이용해서 1~9단 만들어보기
		int calc[] = new int[10];
		
		System.out.println("============================================");
		System.out.println("구구단");
		System.out.println("---------------------------------------------");
		for(int i = 1; i < calc.length;i++) {
			for(int j =1; j < 10; j ++) {
				System.out.printf("%d 단 구구단: %s X %s = %s \n",i,i,j,i*j);
				
			}
			System.out.println("---------------------------------------------");
		}
		
				
				
	}

}
