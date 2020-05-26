package com.biz.grade;

import java.util.Random;

public class Grade_12 {

	public static void main(String[] args) {

		int[] intNum = new int[10];

		Random rnd = new Random();

		int intSum = 0;
		for (int i = 0; i < 10; i++) {
			intNum[i] = rnd.nextInt(50) + 51;

		}
		for (int i = 0; i < 10; i++) {
			if ((intNum[i] % 2) == 0) {
				intSum += intNum[i];
			}
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(intNum[i]);
		}
		System.out.println("10개 임의 수 중 짝수의 합은 " + intSum);

	}

}
