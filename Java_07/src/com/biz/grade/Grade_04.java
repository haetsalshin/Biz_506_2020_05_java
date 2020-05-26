package com.biz.grade;

import java.util.Random;

public class Grade_04 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		float floatKor =0.0f;
		float floatEng =0.0f;
		float floatMath =0.0f;
		
		floatKor = rnd.nextInt(50)+51;
		floatEng = rnd.nextInt(50)+51;
		floatMath = rnd.nextInt(50)+51;
	
		float floatSum = floatKor + floatEng + floatMath;
		float floatAvg = floatSum / 3;
		
		System.out.println("총점 : "+ floatSum);
		System.out.println("평균 : "+ floatAvg);
		
		
		
		
	}
	
	

}
