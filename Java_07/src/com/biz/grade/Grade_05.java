package com.biz.grade;

import java.util.Random;

public class Grade_05 {
	public static void main(String[] args) {
		Random rnd = new Random();
		
		int intAvg = 0;
		int intSum=0;
		int i =0;
		for( i =1 ; i<11 ; i++) {
			int num = rnd.nextInt(50)+51;
			System.out.println(i +"번째 학생의 국어점수는 "+num);
			
			intSum += num;
			intAvg = intSum / i;
		}
		
		System.out.println("10명 국어점수 총점 :" + intSum);
		System.out.println("10명 국어점수 평균 :" + intAvg);
		
		System.out.println("===============================");
		
		int stu01 = 0;
		int stu02 = 0;
		int stu03 = 0;
		int stu04 = 0;
		int stu05 = 0;
		int stu06 = 0;
		int stu07 = 0;
		int stu08 = 0;
		int stu09 = 0;
		int stu010 = 0;
		
		stu01 = rnd.nextInt(50)+51;
		stu02 = rnd.nextInt(50)+51;
		stu03 = rnd.nextInt(50)+51;
		stu04 = rnd.nextInt(50)+51;
		stu05 = rnd.nextInt(50)+51;
		stu06 = rnd.nextInt(50)+51;
		stu07 = rnd.nextInt(50)+51;
		stu08 = rnd.nextInt(50)+51;
		stu09 = rnd.nextInt(50)+51;
		stu010 = rnd.nextInt(50)+51;
		
		System.out.println(stu01);
		System.out.println(stu02);
		System.out.println(stu03);
		System.out.println(stu04);
		System.out.println(stu05);
		System.out.println(stu06);
		System.out.println(stu07);
		System.out.println(stu08);
		System.out.println(stu09);
		System.out.println(stu010);
		
		int intSum01 = stu01 + stu02 +stu03+ stu04+ stu05+ stu06+ stu07+ stu08+ stu09+ stu010;
		int intAvg01 = intSum01 / 10;
		
		System.out.println("10명 학생의 총점은 : "+ intSum01);
		System.out.println("10명 학생의 평균은 : "+ intAvg01);
		
		
	}
	

}
