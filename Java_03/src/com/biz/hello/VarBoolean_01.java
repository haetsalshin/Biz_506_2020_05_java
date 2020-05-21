package com.biz.hello;

public class VarBoolean_01 {
	
	public static void main(String[] args) {
		
		int num1 = 33;				
		boolean bVar1 = (num1 % 2 ) == 0;		
		if(bVar1) {
			
			System.out.println(num1+ "은 짝수입니다." );
		}		
		if(!bVar1) {			
			System.out.println(num1+ "은 홀수입니다." );
		}
	}

	
}
