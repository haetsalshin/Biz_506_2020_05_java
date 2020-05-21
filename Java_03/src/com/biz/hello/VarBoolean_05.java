package com.biz.hello;

import java.util.Random;

public class VarBoolean_05 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int num1 = rnd.nextInt(100);
		boolean bVar = (num1 % 2) ==0;
		
		if(bVar) {
			System.out.println(num1 + "은 짝수");
		}
		if(!bVar) {
			System.out.println(num1 + "은 홀수");
		}		
		
		
		Random rnd1 = new Random();
		int num2 = rnd1.nextInt(100);
		int num3 = rnd1.nextInt(100);
		
		int numP = num2 + num3;
		int numM = num2 - num3;
		
		boolean bVarP= (numP % 2) ==0;
		boolean bVarM= (numM % 2) ==0;
		
		if(bVarP) {
			System.out.println(numP + "는 짝수입니다.");
		}
		if(!bVarP) {
			System.out.println(numP + "는 홀수입니다.");
			
		}	
		if(bVarM) {
			System.out.println(numM + "는 짝수입니다.");
		}
		if(!bVarM) {
			System.out.println(numM + "는 홀수입니다.");
			
		}	
		
	}
}
