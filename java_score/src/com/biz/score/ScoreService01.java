package com.biz.score;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScoreService01 {
	
	private List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
	Scanner scan = new Scanner(System.in);
	
	public ScoreService01() {
		
	}
	
	public boolean inputScore() {
		
		ScoreVO score = new ScoreVO();

		
		System.out.print("이름 >> (중지:END) ");
		
		String strNum = scan.nextLine();
		
		if(strNum.equals("END"))
		
		
		System.out.print("국어 >> ");
		String strKor = scan.nextLine();
		
		int intKor =0;
		try {
			intKor =  Integer.valueOf(strKor);
		} catch (Exception e) {
			System.out.println("숫자만 입력할 수 있습니다.");
			System.out.println("입력이 잘못되어 0으로 임시 입력 합니다.");
		}
		
		System.out.print("영어 >> ");
		String strEng = scan.nextLine();
		int intEng = 0;
		try {
			intEng  = Integer.valueOf(strEng);
		} catch (Exception e) {
			System.out.println("숫자만 입력할 수 있습니다.");
			System.out.println("입력이 잘못되어 0으로 임시 입력 합니다.");
		}
		
		System.out.print("수학 >> ");
		String strMath = scan.nextLine();
		
		int intMath = 0;
		try {
			intEng = Integer.valueOf(strMath);
		} catch (Exception e) {
			System.out.println("숫자만 입력할 수 있습니다.");
			System.out.println("입력이 잘못되어 0으로 임시 입력 합니다.");
		}
		
		score.setStrNum(strNum);
		score.setIntKor(intKor);
		score.setIntEng(intEng);
		score.setIntMath(intMath);
		
		
		scoreList.add(score);
		
		return true;
		
	}
	
	
	public void scoreList() {
		
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("성적리스트");
		System.out.println("======================================================================");
		System.out.println("학번\t 국어\t 영어 \t 수학 \t 총점 \t 평균\t ");
		
		int scoreSize = scoreList.size();
		for(int i = 0 ;i < scoreSize ; i ++) {
			
			ScoreVO vo = scoreList.get(i);
			System.out.println("이름 : " + vo.getStrNum());
			System.out.println("국어점수 :" + vo.getIntKor());
			System.out.println("영어점수 :" + vo.getIntEng());
			System.out.println("수학점수 : "+ vo.getIntMath());
			
		}
		
		
	}
	

}
