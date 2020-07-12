package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.list.config.Lines;
import com.biz.list.model.ScoreVO;

public class ScoreServiceV3 {
	
	private List<ScoreVO> scoreList ;
	
	public ScoreServiceV3() {
		scoreList = new ArrayList<ScoreVO>();
	}
	
	
	public void makeScore(List<ScoreVO> scoreList) {
		
		ScoreVO scoreVO;
		Random rnd = new Random();
		for(int i = 0; i < 10 ; i ++) {
			scoreVO = new ScoreVO();
			
			scoreVO.setNum(""+(i+1));
			scoreVO.setKor(rnd.nextInt(50)+51);
			scoreVO.setEng(rnd.nextInt(50)+51);
			scoreVO.setMath(rnd.nextInt(50)+51);
			
			scoreList.add(scoreVO);
		}
		
	}
	
	
	public void makeSum(List<ScoreVO> scoreList) {
		
		int sum = 0;
		int size = scoreList.size();
		for(int i = 0; i < size ; i ++) {
			
			ScoreVO scoreVO = scoreList.get(i);
			
			sum = scoreVO.getKor();
			sum += scoreVO.getEng();
			sum += scoreVO.getMath();
			
			scoreVO.setSum(sum);
		}
		
		
	}
	
	public void makeAvg(List<ScoreVO> scoreList) {
		
		int avg = 0;
		int size = scoreList.size();
		for(int i = 0; i < size ; i ++) {
			
			ScoreVO scoreVO = scoreList.get(i);
			
			avg = scoreVO.getSum()/3;
			
			scoreVO.setAvg(avg);
			
			
		}
		
	}
	
	public void scoreList(List<ScoreVO> scoreList) {
		
		this.scoreList = scoreList;
		
		System.out.println(Lines.d_Line);
		System.out.println("성적일람표V3");
		System.out.println(Lines.d_Line);
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println(Lines.s_line);
		int size = scoreList.size();
		for(int i = 0 ; i < size ; i++) {
			ScoreVO scoreVO = scoreList.get(i);
			System.out.print(scoreVO.getNum()+"\t");
			System.out.print(scoreVO.getKor()+"\t");
			System.out.print(scoreVO.getEng()+"\t");
			System.out.print(scoreVO.getMath()+"\t");
			System.out.print(scoreVO.getSum()+"\t");
			System.out.print(scoreVO.getAvg()+"\n");
			
		}
		System.out.println(Lines.d_Line);
		
		
	}
	
	public void studentSumAvg(List<ScoreVO> scoreList) {
		
		int korSum = 0;
		int engSum = 0;
		int mathSum = 0;
		int subSum = 0;
		int subAvg = 0;
		int size = scoreList.size();
		for(int i = 0 ; i < size ; i++) {
			ScoreVO scoreVO = scoreList.get(i);
			
			korSum += scoreVO.getKor();
			engSum += scoreVO.getEng();
			mathSum += scoreVO.getMath();
			
		}
		subSum = korSum + engSum + mathSum;
		subAvg = subSum /3;
		
		int korAvg = korSum/size;
		int engAvg = engSum/size;
		int mathAvg = mathSum/size;
		int sumAvg = subSum/size;
		int avgAvg = subAvg/size;
		
		System.out.printf("과목총점\t%d\t%d\t%d\t%d\t%d\n",
				korSum, engSum, mathSum, subSum, subAvg);
		System.out.printf("과목평균\t%d\t%d\t%d\t%d\t%d\n",
				korAvg, engAvg, mathAvg, sumAvg, avgAvg);
		
	}

}
