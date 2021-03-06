package com.biz.list.service;

import java.util.List;

import com.biz.list.model.ScoreVO;

public class ScoreServiceV1 {
	/*
	 * ScoreEx_02 에서 만든 scoreList를 매개변수로 받아서
	 * 성적 리스트를 출력한다.
	 */
public void scoreList(List<ScoreVO> scores) {
		
		System.out.println("==============================================");
		System.out.println("성적리스트");
		System.out.println("----------------------------------------------");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
	
		int scoreSize = scores.size();
		for(int i = 0 ; i < scoreSize ; i++) {
			ScoreVO sVO = scores.get(i);
			System.out.print( sVO.getNum()+ "\t");
			System.out.print( sVO.getKor() + "\t" );
			System.out.print( sVO.getEng() + "\t" );
			System.out.print( sVO.getMath() + "\t" );
			System.out.print( sVO.getStSum() + "\t" );
			System.out.print( sVO.getStAvg() + "\n" );
			
			
			
		}
		System.out.println("==============================================");
	}
	

	
	
	

}

