package com.biz.word.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.biz.word.domain.WordVO;
import com.biz.word.statics.SplitPosition;

public class WordGameServiceImplV1 implements WordGameService {

	protected List<WordVO> wordList;
	protected Scanner scan;
	protected BufferedReader buffer;
	protected int game;
	protected int count;
	
	public WordGameServiceImplV1() {
		
	}
	@Override
	public void loadWord() {
		
		String wordFile = "src/com/biz/word/exec/word.txt";
		wordList = new ArrayList<WordVO>();
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(wordFile);
			
			buffer = new BufferedReader(fileReader);
			String reader = "";

			
			while(true) {
				reader = buffer.readLine();
				if(reader == null) {
					break;
				}
				String[] words = reader.split(":");
				WordVO wordVO = new WordVO();
				
				wordVO.setKor(words[SplitPosition.WORD_KOR]);
				wordVO.setEng(words[SplitPosition.WORD_ENG]);
				
				wordList.add(wordVO);
				
			}
			
			
		buffer.close();
		fileReader.close();
			
	
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void playGame() {
		
		scan = new Scanner(System.in);
		
		WordVO wVO = new WordVO();
		Random rnd = new Random();
		int size = wordList.size();
		count = 0;
		game = 0;
		while(true) {
			int index = rnd.nextInt(size);
			System.out.println("다음에 해당하는 영어 단어는? (종료:END) >> ");
			System.out.print(wordList.get(index).getKor() + " >> ");
			String strEng = scan.nextLine();
			game++;
			if(strEng.equals("END")) {
				break;
				
			}
			
			if(strEng.equalsIgnoreCase(wordList.get(index).getEng())) {
				System.out.println("정답입니다 :>");
				count++;
			}else {
				System.out.println("오답입니다 :<");
				System.out.println("정답 : "+wordList.get(index).getEng());
			}
			
		}
	}

	@Override
	public void gameOver() {
		System.out.println("GAME OVER");
		System.out.printf("RESULT >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> %d 중에 %d 개 정답",game,count);
				
		
	}
	

}
