package com.biz.list.service;

import java.util.List;

import com.biz.list.model.ScoreVO;

public class ScoreServiceV2 {
	
	
	// 학생별 총점 및 평균 method만들기 
	// stSum 이름 바꾸기!
	
	public void stSum(List<ScoreVO> scoreList) {
		
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
