package com.haetsal;

public class For_01 {
	
	public static void main(String[] args) {
		
		int num =0;
		
		for(num=1; num<11; num++) {
			
			System.out.println("안녕하세요" + num);
		}
		
		num =0;
		int sum =0;
		
		for(num=1, sum=0; num<100; num++) {
			sum *= num;
			
		}
		
	}

}
