package com.biz.score.exec;

import java.util.Random;

import com.biz.score.model.ScoreVO;

public class ScoreEx_01 {
	
	public static void main(String[] args) {
		
		ScoreVO[] scores = new ScoreVO[20];
		
		Random rnd = new Random();
		
		// 배열 초기화
		
		int size = scores.length;
		for(int i =0; i < size ; i++) {
			scores[i] = new ScoreVO();
		}
		// 국어, 영어, 수학 점수 생성
		for(int i =0; i < size ; i ++) {
			scores[i].setKor(rnd.nextInt((50+51)));
			scores[i].setEng(rnd.nextInt((50+51)));
			scores[i].setMath(rnd.nextInt((50+51)));
		}
		
		//평균과 총점 구하기
		int sum = 0;
		int avg = 0;
		
		for(int i = 0; i < size ; i++) {
			sum = scores[i].getKor();
			sum += scores[i].getEng();
			sum += scores[i].getMath();
		
			avg = sum/3;
			System.out.print(i+1+"\t");
			System.out.print(scores[i].getKor()+"\t");
			System.out.print(scores[i].getEng()+"\t");
			System.out.print(scores[i].getMath()+"\t");
			System.out.print(sum+"\t");
			System.out.print(avg+"\n");
			System.out.println("------------------------------------------------------");
			
			sum =0;
			avg =0;
				
		}
		
		
		
	}
	
}
