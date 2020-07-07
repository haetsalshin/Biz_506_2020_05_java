package com.biz.student.string;

public class StringEx_03 {
	public static void main(String[] args) {
		
		String strNation = "Republic of Korea";
		
		// 아무것도 채워지지 않은 문자열 배열 선언만 하기
		String[] strNations;
		
		// null 문자열 : ""
		// 문자열을 알파벳 단위로 나누어라
		strNations = strNation.split("");
		for(String s : strNations) {
			System.out.print(s + "\t");
			// R	e	p	u	b	l	i	c	 	o	f	 	K	o	r	e	a
		}
		System.out.println();
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		
		// 문자열을 빈칸(space)를 단위로 나누어라.
		strNations = strNation.split(" ");
		for(String s : strNations) {
			System.out.print(s + "\t");
			// Republic	of	Korea	
		}
		System.out.println();
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		
		
		String student = "00001:공승일:3:6:국어국문:경상북도 영천시 시청로16";
		String[] students = student.split(":");
		
		System.out.println("학번 : " + students[0]);
		System.out.println("이름 : " + students[1]);
		System.out.println("학년 : " + students[2]);
		System.out.println("반 : " + students[3]);
		System.out.println("학과 : " + students[4]);
		System.out.println("주소 : " + students[5]);
		/*
		 * 학번 : 00001
			이름 : 공승일
			학년 : 3
			반 : 6
			학과 : 국어국문
			주소 : 경상북도 영천시 시청로16
		 */
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		
		String score = "1,100,74,75,249,83";
		String[] scores = score.split(",");
		
		System.out.println("학번 : " + scores[0]);
		System.out.println("국어 : " + scores[1]);
		System.out.println("영어 : " + scores[2]);
		System.out.println("수학 : " + scores[3]);
		System.out.println("총점 : " + scores[4]);
		System.out.println("평균 : " + scores[5]);
		
		/*
		 * 학번 : 1
			국어 : 100
			영어 : 74
			수학 : 75
			총점 : 249
			평균 : 83
		 */
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");		
		
		int intKor = Integer.valueOf(scores[1]);
		int intEng = Integer.valueOf(scores[2]);
		int intMath = Integer.valueOf(scores[3]);
		
		int intSum = Integer.valueOf(scores[4]);
		int intAvg = Integer.valueOf(scores[5]);
		
		/*
		 * 단위(모듈) test ?!
		 * score.csv 파일을 읽어서 코드를 검증하고 모든 결과가 일치로 나타나는지 판단을 하는 것
		 * 
		 * 이 때 사용된 score.csv파일의 데이터를 testCase라 한다.
		 */
		if(intSum == intKor + intEng + intMath) {
			System.out.println("계산결과 일치!!");
		}else {
			System.out.println("계산결과 오류!!");
		}
		
	}

}
