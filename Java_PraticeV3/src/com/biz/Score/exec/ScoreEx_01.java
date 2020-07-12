package com.biz.Score.exec;

import com.biz.Score.service.ScoreService;
import com.biz.Score.service.ScoreServiceImplV1;

public class ScoreEx_01 {
	
	public static void main(String[] args) {
		
		
		ScoreService sService = new ScoreServiceImplV1();
		sService.scoreLoad();
		while(true) {
			if(!sService.inputScore()) {
				break;
			}
		}
		sService.calcSum();
		sService.calcAvg();
		sService.scoreList();
		sService.scoreSave();
		
	}

}
