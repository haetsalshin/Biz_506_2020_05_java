package com.biz.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.domain.ScoreVO;

public class ScoreServiceImplV2 implements ScoreService {
	
	// protoected로 변경했다!
	protected List<ScoreVO> scoreList;
	protected Scanner scan;


	public ScoreServiceImplV2() {
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
	}
	
	
	@Override
	public boolean inputScore() {
		

		ScoreVO scorevo = new ScoreVO();
		
		System.out.print(">> 이름(중단:END) : ");
		String num = scan.nextLine();
		if(num.equals("END")) {
			return false;
		}
		System.out.println("입력값 : " + num );
	
		
		System.out.print("국어점수 : " );
		String strKor = scan.nextLine();
		
		int kor = 0;
		try {
			kor = Integer.valueOf(strKor);
		} catch (Exception e) {
			System.out.println("국어점수는 숫자만 입력가능 합니다.");
			System.out.println("따라서 0점으로 임시 입력합니다.");
		}
		
		System.out.print("영어점수 : " );
		String strEng = scan.nextLine();
		
		int eng = 0;
		try {
			eng = Integer.valueOf(strEng);
		} catch (Exception e) {
			System.out.println("영어점수는 숫자만 입력가능 합니다.");
			System.out.println("따라서 0점으로 임시 입력합니다.");
		}
		
		
		
		System.out.print("수학점수 : " );
		String strMath = scan.nextLine();
		
		int math = 0;
		try {
			math = Integer.valueOf(strMath);
		} catch (Exception e) {
			System.out.println("수학점수는 숫자만 입력가능 합니다.");
			System.out.println("따라서 0점으로 임시 입력합니다.");
		}
		
		
		
		scorevo.setNum(num);
		scorevo.setKor(kor);
		scorevo.setEng(eng);
		scorevo.setMath(math);
		
		scoreList.add(scorevo);
		
		return true;
	}
	@Override
	public void calcSum() {

		ScoreVO scorevo = new ScoreVO();
		
		int sum = 0;
		int size = scoreList.size();
		for(int i = 0 ; i < size ; i ++) {
			scorevo = scoreList.get(i);
			sum = scorevo.getKor();
			sum += scorevo.getEng();
			sum += scorevo.getMath();
			/*
			 * scorevo.setSum() method에 총점을 전달하므로써
			 * scoreList에 저장된 요소의 총점 변수에 값을 저장하는 효과를 낸다.
			 * 별도로 저장을 해주거나 하는 절차가 필요가 없다.
			 */
			scorevo.setSum(sum);

		}
		// scoreList.add(scorevo); 굳이 이렇게 따로 저장을 안해줘도 get(i)에서 값을 읽어서 이미 scoreve에 저장을 하므로 
		// 또 안써줘도 된다.
		
		
		
	}

	@Override
	public void calcAvg() {
		ScoreVO scorevo = new ScoreVO();
		
		int avg = 0;
		int size = scoreList.size();
		for(int i = 0; i < size ; i ++) {
			scorevo = scoreList.get(i);
			avg = (scorevo.getSum()/3);
			
			scorevo.setAvg(avg);
		}
		
		
	}

	@Override
	public void scoreList() {
		
		
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("성적 일람표");
		System.out.println("==============================================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t");
		System.out.println("--------------------------------------------------------------");
		
		int size = scoreList.size();
		for(int i = 0 ; i < size ; i ++) {
			ScoreVO scorevo = scoreList.get(i);
			System.out.print(scorevo.getNum()+"\t");
			System.out.print(scorevo.getKor()+"\t");
			System.out.print(scorevo.getEng()+"\t");
			System.out.print(scorevo.getMath()+"\t");
			System.out.print(scorevo.getSum()+"\t");
			System.out.print(scorevo.getAvg()+"\n");
		}
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		
	}

}
