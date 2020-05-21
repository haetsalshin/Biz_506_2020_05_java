package com.haetsal;

import java.util.Random;

public class VarBoolean_02 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int num1 = rnd.nextInt(500);
		int num2 = rnd.nextInt(500);
		int num3 = rnd.nextInt(500);
		int num4 = rnd.nextInt(500);
		
		int numP = num1 +num2 +num3+ num4;
				
		if(numP <1300) {
			System.out.println("해당 세대의 수입은 " +numP + "원으로 현재 프로그램에 신청가능합니다.");
			
		}
		if(!(numP <1300)) {
			System.out.println("해당 세대의 수입은 " +numP + "원으로 현재 프로그램에 신청 불가능합니다.");
		}
		
	}

}
