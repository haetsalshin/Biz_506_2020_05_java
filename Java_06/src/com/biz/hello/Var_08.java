package com.biz.hello;

public class Var_08 {
	
	public static void main(String[] args) {
		
		int sum=0;
		for(int i= 2 ; i<=100; i++) {
			int j=0;
			for(j =2 ; j < i; j++) {
				if((i%j)==0) {
					break;
				}
			} 
			if(i == j) {
				System.out.println(i);
				sum += i;				
			}

		}
		System.out.println("=====================");
		System.out.println("소수의 합 :" + sum);
	}
	

}
