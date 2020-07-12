package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.list.config.Lines;
import com.biz.list.model.ScoreVO;

public class ScoreServiceV2 {
	
	List<ScoreVO> scoreList ;
	


	public void stSum(List<ScoreVO> scoreList) {
		
		this.scoreList = scoreList;
		
		
		int scoreSize = scoreList.size();

		for(int i =0; i < scoreSize ; i++ 	) {
			ScoreVO scoreVO = scoreList.get(i);
			
			int sum = scoreVO.getKor();
			sum += scoreVO.getEng();
			sum += scoreVO.getMath();
			scoreVO.setSum(sum);

			
		}

	}
	
	public void stAvg(List<ScoreVO> scoreList) {
		
		
		int scoreSize = scoreList.size();

		for(int i = 0; i < scoreSize ; i ++) {
			
			ScoreVO scoreVO = scoreList.get(i);
			int sum = scoreVO.getSum();
			scoreVO.setAvg(sum/3);
			
		}
		
	}
	public void scoreList(List<ScoreVO> scoreList) {
		
		System.out.println("==============================================");
		System.out.println("성적리스트");
		System.out.println("----------------------------------------------");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		
		int scoreSize = scoreList.size();
		for(int i = 0 ; i < scoreSize ; i++) {
			ScoreVO sVO = scoreList.get(i);
			System.out.print( sVO.getNum()+ "\t");
			System.out.print( sVO.getKor() + "\t" );
			System.out.print( sVO.getEng() + "\t" );
			System.out.print( sVO.getMath() + "\t" );
			System.out.print( sVO.getSum() + "\t" );
			System.out.print( sVO.getAvg() + "\n" );
			
			
			
		}
		System.out.println("==============================================");
	}
	
	
	
	// 학생별 총점 및 평균 method만들기 
	// stSum 이름 바꾸기!
	
	public void studentSum(List<ScoreVO> scoreList) {
		
		int korSum =0;
		int engSum =0;
		int mathSum =0 ;
		int scoreSize = scoreList.size();
		for(int i =0; i < scoreSize ; i++) {
			ScoreVO subSum = scoreList.get(i);
			korSum += subSum.getKor();
			engSum += subSum.getEng();
			mathSum += subSum.getMath();
		}
		int korAvg =0;
		int engAvg = 0;
		int mathAvg = 0;
		
		korAvg = korSum / scoreSize;
		engAvg = korSum / scoreSize;
		mathAvg = korSum / scoreSize;
		
		System.out.printf("총점\t %d\t %d\t %d\t %d\t %d\n",
				korSum, engSum, mathSum, korSum + engSum+mathSum, (korSum + engSum+mathSum)/scoreSize
				);
		System.out.println("----------------------------------------------");
		int SumSum = korSum/scoreSize + engSum/scoreSize + mathSum/scoreSize;
		System.out.printf("평균\t %d\t %d\t %d\t %d\t %d\n",
				korSum/scoreSize, engSum/scoreSize, mathSum/scoreSize,SumSum, SumSum/3
				);
		
		
	}
	
	
	
	
}
