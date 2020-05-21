package com.haetsal;

import java.util.Random;

public class VarBoolean_01 {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int num1 = rnd.nextInt(120) + 1;
		
		if(num1<66) {
			
			System.out.println("위 사람은 " +num1 + "세로 청년입니다.");
			
		}
		if(!(num1<66)) {
			
			System.out.println("위 사람은 " +num1 + "세로 청년이 아닙니다.");
			
		}		
		
		
	}

}
