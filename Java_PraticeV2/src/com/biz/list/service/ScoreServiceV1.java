package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.list.config.Lines;
import com.biz.list.model.ScoreVO;

public class ScoreServiceV1 {
	
	

	private List<ScoreVO> scoreList;

	public ScoreServiceV1() {
		
	}
	
	
	public void ScoreList(List<ScoreVO> scoreList) {
		
		
		
		System.out.println(Lines.d_Line);
		System.out.println("성적알람표");
		System.out.println(Lines.d_Line);
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println(Lines.s_line);
		for( ScoreVO sVO : scoreList) {
			System.out.printf(sVO.getNum()+"\t");
			System.out.printf(sVO.getKor()+"\t");
			System.out.printf(sVO.getEng()+"\t");
			System.out.printf(sVO.getMath()+"\t");
			System.out.printf(sVO.getSum()+"\t");
			System.out.printf(sVO.getAvg()+"\n");
			
			
		}
		System.out.println(Lines.d_Line);
		
		
	}
	

}
