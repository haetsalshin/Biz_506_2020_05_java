package com.biz.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.list.model.ScoreVO;
import com.biz.list.service.ScoreServiceV2;

public class ScoreEx_03 {
	
	public static void main(String[] args) {
		
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		Random rnd= new Random();
		ScoreVO scoreVO = null ;
		

		for(int i = 0 ; i < 10 ; i++) {
			scoreVO = new ScoreVO();
			
			scoreVO.setNum(""+i);
			scoreVO.setKor(rnd.nextInt(50)+51);
			scoreVO.setEng(rnd.nextInt(50)+51);
			scoreVO.setMath(rnd.nextInt(50)+51);
			
			scoreList.add(scoreVO);
		}
		
		
		
		ScoreServiceV2 sService = new ScoreServiceV2();
		sService.stSum(scoreList);
		sService.stAvg(scoreList);
		sService.scoreList(scoreList);
		sService.studentSum(scoreList);
		
	}

}
