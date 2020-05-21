package com.biz.hello;

public class VarBoolean_02 {
	
	public static void main(String[] args) {
		
		int num1 = 2;
		int num2 = 1;
		
		int numP = num1 + num2;
		int numM = num1 - num2;		
		int numT = num1 * num2;
		int numD = num1 / num2;
		
		//참 거짓에 대하여 판단
		boolean bVar1 = (numP % 2 ) ==0;
		boolean bVar2 = (numM % 2 ) ==0;
		boolean bVar3 = (numT % 2 ) ==0;		
		boolean bVar4 = (numD % 2 ) ==0;
		
		//if
		if(bVar1){
			System.out.println(numP +"은 짝수입니다.");
		}
		
		if(!bVar1){
			System.out.println(numP + "은 홀수입니다.");
		}
		
		if(bVar2){
			System.out.println(num1 + "-" + num2+ "=" +(num1 - num2)+"은 짝수입니다.");
		}
		
		if(!bVar2){
			System.out.println(num1 + "-" + num2+ "=" +(num1 - num2) + "은 홀수입니다.");
		}
		
		if(bVar3){
			System.out.println(num1 + "*" + num2+ "=" +(num1 * num2)+"은 짝수입니다.");
		}
		
		if(!bVar3){
			System.out.println(num1 + "*" + num2+ "=" +(num1 * num2)+  "은 홀수입니다.");
		}
		
		if(bVar4){
			System.out.println(num1 + "/" + num2+ "=" +(num1 / num2)+"은 짝수입니다.");
		}
		
		if(!bVar4){
			System.out.println(num1 + "/" + num2+ "=" + (num1 / num2)+ "은 홀수입니다.");
		}
		
	}
}
