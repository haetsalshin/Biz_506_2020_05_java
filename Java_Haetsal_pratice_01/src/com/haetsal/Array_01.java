package com.haetsal;

public class Array_01 {
	
	public static void main(String[] args) {
		
		
		int intCount =0;
		for(int i ='가'; i<='힣' ; i++) {
			System.out.printf(" %c : %d", i,i);
			if( (++intCount % 10 ) == 0) {
				System.out.println("");
			}
			
			
		}
		System.out.println("한글숫자개수 : " + intCount);
		
		char charA = 'A';
		char charB = 'b';
		
		System.out.println(charA);
		System.out.println(charB);
		
		int intCharA = charA;
		int intCharB = charB;
		
		System.out.println(intCharA);
		System.out.println(intCharB);
		
		int intNum[] = new int[20];
		
		
	}

}
