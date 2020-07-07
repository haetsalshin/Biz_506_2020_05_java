package com.biz.word.exec;

import com.biz.word.service.WordGameService;
import com.biz.word.service.WordGameServiceImplV2;

public class WordEx_02 {
	
	public static void main(String[] args) {
		
		WordGameService wordGameService = new WordGameServiceImplV2();
		
		wordGameService.loadWord();
		wordGameService.playGame();
		wordGameService.gameOver();
		
		
		
	}

}
