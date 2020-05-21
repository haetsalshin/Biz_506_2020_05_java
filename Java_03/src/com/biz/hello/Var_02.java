package com.biz.hello;

import java.util.Random;

public class Var_02 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int num1 = rnd.nextInt(100) +1;
		int num2 = rnd.nextInt(100) +1;
		
		int numP = num1 + num2;
		int numM = num1 - num2;
		int numT = num1 * num2;
		int numD = num1 / num2;
		
		if((numP % 2)== 0) {
			System.out.println("덧셈 결과는 " +numP + " 짝수입니다");
		}
		if(!((numP % 2) == 0)) {
			System.out.println("덧셈 결과는 " +numP + " 홀수입니다");
		}
		if((numM % 2)== 0) {
			System.out.println("뺄셈 결과는 " +numM + " 짝수입니다");
		}
		if(!((numM % 2) == 0)) {
			System.out.println("뺄셈 결과는 " +numM + " 홀수입니다");
		}
		if((numT % 2) == 0) {
			System.out.println("곱셈 결과는 " +numT + " 짝수입니다");
		}
		if(!((numT % 2) == 0)) {
			System.out.println("곱셈 결과는 " +numT + " 홀수입니다");
		}
		if((numD % 2) == 0) {
			System.out.println("나눗셈 결과는 " +numD + " 짝수입니다");
		}
		if(!((numD % 2) == 0)) {
			System.out.println("나눗셈 결과는 " +numD + " 홀수입니다");
		}
			
	
		if(num1 >= num2 )
	}
	
}
