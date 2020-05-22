package com.biz.hello;

public class Var_04 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		int num = 7;
		
		sum = sum + ++num ; // num : 7
		sum = sum + ++num ; // num : 8
		sum = sum + ++num ;
		sum = sum + ++num ;
		sum = sum + ++num ;
		sum = sum + ++num ;
		sum = sum + ++num ;
		sum = sum + ++num ;
		sum = sum + ++num ;
		sum = sum + ++num ;
		
		System.out.printf("7부터 %d 까지의 덧셈 : %d\n", num, sum);
		
		
	}

}
