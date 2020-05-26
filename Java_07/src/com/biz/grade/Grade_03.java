package com.biz.grade;

import java.util.Random;

public class Grade_03 {

	public static void main(String[] args) {

		int intKor = 0;
		int intEng = 0;
		int intMath = 0;

		Random rnd = new Random();
		
		intKor = rnd.nextInt(100)+1;
		intEng = rnd.nextInt(100)+1;
		intMath = rnd.nextInt(100)+1;
		
		int intSum= intKor;
		intSum += intEng;
		intSum += intMath;
		
		int intAvg = intSum / 3;
		
		System.out.println("총점 : " + intSum);
		System.out.println("평균 : " + intAvg);
		
		
		
	}

}
