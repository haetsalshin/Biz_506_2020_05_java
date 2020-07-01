package com.biz.score;

public class Ex_01 {
	
	public static void main(String[] args) {
		
		ScoreService01 scoreService = new ScoreService01();
		
		while(true) {
			
			
			if(!scoreService.inputScore()) {
				break;
			}
			
		}
		scoreService.inputScore();
		scoreService.scoreList();
	}

}
