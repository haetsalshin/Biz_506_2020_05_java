package com.biz.score;

import com.biz.service.ScoreService;
import com.biz.service.ScoreServiceImPlV3;

public class ScoreEx_03 {
	public static void main(String[] args) {
		
		// sService객체 선언
		ScoreService sService = new ScoreServiceImPlV3() ;
		while(true) {
			if(!sService.inputScore()) {
				break;
			}
		}
		sService.calcSum();
		sService.calcAvg();
		sService.scoreList();
		
	}

}
