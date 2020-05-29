package com.biz.grade;

import java.util.Random;
/*
 * 학생 20명 5과목의 성적처리
 */
public class Grade_01 {
	
	public static void main(String[] args) {
		
		int stdCount = 10; // 나중에 20명 이었다가 만약 30명으로 바꾸고 싶을 시에 이 변수 값만 바꾸면 되기 때문에
		                   //이렇게 새롭게 변수 설정해서 해도 좋다
		
		//stdCount 만큼의 배열을 생성
		//과목수 만큼 생성
		int intKorScore[] = new int[stdCount];
		int intEngScore[] = new int[stdCount];
		int intMathScore[] = new int[stdCount];
		int intMusicScore[] = new int[stdCount];
		int intArtScore[] = new int[stdCount];
		
		// 임의의 점수를 만들기 위한 도구 생성
		Random rnd = new Random();
		
		// 중간 i 를 20 대신에 stdCount 변수명을 넣어서 설정 할 수도 있다.
		// 학생들의 점수를 임의 생성하여 배열에 저장
		for(int i = 0; i < stdCount ; i++) {
			intKorScore[i]=rnd.nextInt(100)+1;
			intEngScore[i]=rnd.nextInt(100)+1;
			intMathScore[i]=rnd.nextInt(100)+1;
			intMusicScore[i]=rnd.nextInt(100)+1;
			intArtScore[i]=rnd.nextInt(100)+1;
		}
		
		// 학생별 총점 과 평균 계산
		// 학생별 평균울 계산하여 저장할 배열 추가 생성
		int [] stdSum = new int[ stdCount];
		int [] stdAvg = new int[ stdCount];
		
		// 각 학생의 총점, 평균을 계산하여 stdSum, stdAvg에 저장
		for(int i = 0; i < stdCount; i++) {
			stdSum[i] = intKorScore[i];
			stdSum[i] += intEngScore[i];
			stdSum[i] += intMathScore[i];
			stdSum[i] += intMusicScore[i];
			stdSum[i] += intArtScore[i];
			
			stdAvg[i] = stdSum[i] / 5;
		}
		
		// 과목별 총점, 평균 계산
		int intKorSum=0;
		int intEngSum=0;
		int intMathSum=0;
		int intMusicSum=0;
		int intArtSum=0;
		
		// 20명 학생의 과목별 총점을 계산
		for(int i = 0 ; i < stdCount ; i++) {
			intKorSum += intKorScore[i];
			intEngSum += intEngScore[i];
			intMathSum += intMathScore[i];
			intMusicSum += intMusicScore[i];
			intArtSum += intArtScore[i];
		}
		
		System.out.println("===============================================================");
		System.out.println(" \t \t \t학생 성적 일람표");
		System.out.println("---------------------------------------------------------------");
		System.out.println("순번\t 국어\t 영어\t 수학\t 음악\t 미술\t 총점\t 평균\t");
		System.out.println("---------------------------------------------------------------");
		
		for(int i =0 ; i < stdCount ; i++) {
		System.out.printf("%d\t %d\t %d\t %d\t %d\t %d\t %d\t %d\t \n", i+1, intKorScore[i], intEngScore[i], intMathScore[i], intMusicScore[i], intArtScore[i]
				, stdSum[i], stdAvg[i] );
		}
		System.out.println("---------------------------------------------------------------");
		
		// printf에서 format기호
		// %d : (decimal)정수, 집진수 등을 표현하는 기호
		// %s : (String) 문자열을 표현하는 기호
		// %c : (Character) 문자를 표현하는 기호
		// \t ; tab(8칸) 만큼 빈칸을 만들어라
		// \n : enter를 누른것처럼 줄바꿈을 하여라
		int intSumAll = intKorSum + intEngSum + intMathSum + intMusicSum + intArtSum;
		System.out.printf("총점\t" + "%d\t %d\t %d\t %d\t %d\t %d\t %d\n", intKorSum, intEngSum, intMathSum, intMusicSum, intArtSum,
					intSumAll, intSumAll/5);
		
		int intSumAllAll = intKorSum/stdCount + intEngSum/stdCount+ intMathSum/stdCount+ intMusicSum/stdCount +intArtSum/stdCount;
		System.out.println("---------------------------------------------------------------");
		System.out.printf("평균\t"+ "%d\t %d\t %d\t %d\t %d\t %d\t %d\t\n", intKorSum/stdCount, intEngSum/stdCount, intMathSum/stdCount, intMusicSum/stdCount , intArtSum/stdCount,
				intSumAllAll, intSumAllAll/5);
		System.out.println("===============================================================");
		
	}
}
