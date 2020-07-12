package com.biz.list.exec;

import java.util.ArrayList;
import java.util.List;

import com.biz.list.model.ScoreVO;
import com.biz.list.service.ScoreServiceV3;

public class ScoreEx_04 {
	
	public static void main(String[] args) {
		
		
		ScoreServiceV3 sS = new ScoreServiceV3();
		
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		
		
		sS.makeScore(scoreList);
		sS.makeSum(scoreList);
		sS.makeAvg(scoreList);
		sS.scoreList(scoreList);
		sS.studentSumAvg(scoreList);
		
	}

}
