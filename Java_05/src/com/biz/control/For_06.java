package com.biz.control;

public class For_06 {

	public static void main(String[] args) {

		int num = 0;
		int sum = 0;
		
		for(num =0, sum=0; num <=10 ; num ++) {
			sum += num;
		}

		System.out.println("결과 :" + sum);
		
		//1부터 10까지 곱셈 결과 만들기
		
		int num1 = 0;
		int sum1 = 0;
		
		for(num1 = 1, sum1 = 1; num1 <=10 ; num1++) {
			
			sum1 *= num1;
		}
	
		System.out.println("곱의 결과"+ sum1);
	
		
	}
}
