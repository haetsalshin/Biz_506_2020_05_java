package com.biz.test;

/*
 * 구구단 7단을 출력하는 코드를 작성
 */
public class GuGuEx {
	
	public static void main(String[] args) {
		int i=7;
		int j;
		System.out.println("====================");
		System.out.println("구구단 7단");
		System.out.println("--------------------");
			for(j = 1; j < 10; j++) {
				
				System.out.printf("%s * %s = %s\n", i,j,i*j);
				
			}
			System.out.println("====================");
				
		
	}

}
