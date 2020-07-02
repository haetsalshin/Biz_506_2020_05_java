package com.biz.service;
/*
 * 성적을 입력받아서 scoreList에 저장하가ㅗ
 * 성적리스트를 출력하는 부분 정의
 */

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.domain.ScoreVO;

public class ScoreService01 {
	// 성적리스트를 저장하기 위한 객체
	private List<ScoreVO> scoreList;
	// 키보드를 사용해서 값들을 입력받기 위한 객체
	Scanner scan;	
	
	// scoreList, scan 객체를 선언한 사용할 수 있도록
	// 생성자에서 두 객체를 초기화 한다
	// 이 과정을 생략하면 NullpointerException이 발생하기 쉽다.
	
	public ScoreService01() {
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
	}
	
	// 한 학생의 성적을 입력받아서 scoreList에 추가하는 method.
	// 변경 : 학생의 성적을 입력받는 과정에서 학번에 END라는 문자열을 입력 하게 되면
	// 		  성적입력을 중단 하도록 변경
	
	public boolean inputScore() {
		
		
		System.out.print("학번 (입력종료:END) >>  ");
		
		String strNum = scan.nextLine();
		System.out.println("입력값 : "+ strNum);
		
		if(strNum.equals("END")) {
			return false;
		}
		
		
		System.out.print("국어 >> ");
		String strKor = scan.nextLine();
		
		int intKor =0;
		try {
			intKor =  Integer.valueOf(strKor);
		} catch (Exception e) {
			System.out.println("숫자만 입력할 수 있습니다.");
			System.out.println("입력이 잘못되어 0으로 임시 입력 합니다.");
		}
		// intKor는 0인 상태로 유지가 된다.
		
		
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
			intMath = Integer.valueOf(strMath);
		} catch (Exception e) {
			System.out.println("숫자만 입력할 수 있습니다.");
			System.out.println("입력이 잘못되어 0으로 임시 입력 합니다.");
		}
		
		ScoreVO score = new ScoreVO();		
		
		score.setStrNum(strNum);
		score.setIntKor(intKor);
		score.setIntEng(intEng);
		score.setIntMath(intMath);
		
		// 총점 계산
		int sum = intKor + intEng + intMath;
		
		// 평균계산을 float형으로 소수점까지 계산하기 위하여
		// 먼저 sum(총점)을 float형으로 변환하고
		// 나눗셈을 수행해서 결과를 도출한다.
		float avg =(float) sum /3;
		
		score.setIntSum(sum);
		score.setFloatAvg(avg);
		
		// 한 학생의 성적 입력받아 vo에 담기 완료
		
		// 한학생의 성적을 list추가
		scoreList.add(score);
		
		return true;
		
	} // inputScore end
	
	
	public void scoreList() {
		
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("성적 리스트");
		System.out.println("=====================================================================");
		System.out.println("학번\t 국어\t 영어 \t 수학 \t 총점 \t 평균");
		System.out.println("---------------------------------------------------------------------");
		
		// scoreList의 개수가 몇개인지 파악하여 변수에 저장.
		int scoreSize = scoreList.size();
		DecimalFormat dot = new DecimalFormat(".##");
		for(int i = 0 ;i < scoreSize ; i ++) {
			// list 에서 scoreVO를 추출한다.
			ScoreVO vo = scoreList.get(i);
			System.out.print(vo.getStrNum()+"\t");
			System.out.print(vo.getIntKor()+"\t");
			System.out.print(vo.getIntEng()+"\t");
			System.out.print(vo.getIntMath()+"\t");
			System.out.print(vo.getIntSum()+"\t");
			System.out.print(dot.format(vo.getFloatAvg())+"\n");


			
		}
		
	System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
	}
	

}
