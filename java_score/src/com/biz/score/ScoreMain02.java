package com.biz.score;

import com.biz.service.ScoreService02;

public class ScoreMain02 {
	
	public static void main(String[] args) {
		
		ScoreService02 scoreService = new ScoreService02();
		
		while(true) {
			
			
			if(!scoreService.inputScore()) {
				break;
			}
			
		}
		scoreService.inputScore();
		System.out.println("입력 완료");
		scoreService.scoreList();
	}

}
