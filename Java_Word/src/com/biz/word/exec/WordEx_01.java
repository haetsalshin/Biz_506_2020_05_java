package com.biz.word.exec;

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

public class WordEx_01 {
	
	public static void main(String[] args) {
		
		String wordFile = "src/com/biz/word/exec/word.txt";
		List<WordVO> wordList= new ArrayList<WordVO>();
		
		// 파일을 오픈하기 위한 객체
		FileReader fileReader = null;
		
		// fileReader와 연동하여 파일을 읽어올 때 효율적으로 가져오기 위한 helper class
		BufferedReader buffer = null;
		
		// fileReader를 사용하여 wordFile을 읽기 용도로 open
		// 운영체제와 통신을 하여 파일을 open하여 갑자기 문제가 발생하여 파일을 opne할 수 없는 경우가 
		// 발생 할 가능성이 매우 높으므로 이 코드는 반드시 try-catch문으로 묶어서 예외처리를 해주어야 한다.
		try {
			fileReader = new FileReader(wordFile);
			
			// buffer는 파일을 읽어서 임시 버퍼영역에 보관한다.
			buffer = new BufferedReader(fileReader);
			
			// buffer.readLine() method를 호출하여
			// buffer로부터 한줄씩 데이터를 읽어온다.
			// 이 때 데이터의 라인 수가 몇 개 인지 알 수 없으므로
			// while반복문으로 무한 반복 실행하여 계속 라인을 한줄씩 읽도록 수행한다.
			
			
			String reader = "";
			while(true) {
				// 반드시 try- catch를 수행해 주어야 한다.
				// 이미 try로 묶인 코드 내부이므로
				// 별도로 try를 설정하지 않고 catch추가하여 처리한다.
				
				reader = buffer.readLine(); 
				if(reader == null) {
					break;
				}
				// 읽어들인 데이터를 콜론(:)을 기준으로
				// 문자열 분해를 하여 words배열에 담아라
				String[] words = reader.split(":");
				WordVO wVO = new WordVO();
				

				
				wVO.setEng(words[SplitPosition.WORD_ENG]); // words[0]
				wVO.setKor(words[SplitPosition.WORD_KOR]); // words[1] 데이터가 많아지면 0번지가 누구고 1번지에 누가 있는겨.. 
				// 그래서 static변수로 WORD_ENG 로 변수 설정해두면 아~ 영어점수! 이렇게 쉽게 알 수 있다.
				
				wordList.add(wVO);
				
			}
			buffer.close(); // 위에 if로 while문 안닫어주면 buffer도 끝낼 수가 없기 때문에 빨간 밑줄이 쳐진다.
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Random rnd = new  Random();
		int size = wordList.size();
		Scanner scan = new Scanner(System.in);
		
		int count = 0;
		int game = 0;
		while(true) {
			int index = rnd.nextInt(size); // 0~ (wordList개수 --1 ) 중의 한 수
			System.out.println("다음에 해당하는 영어 단어는?(END:종료) ");
			System.out.print(wordList.get(index).getKor() + " >> " );
			String strEng = scan.nextLine();
			
			if(strEng.equals("END")) {
				break;
			}
			game++;
			if(strEng.equalsIgnoreCase(wordList.get(index).getEng())) {
				System.out.println("맞았습니다. 축하합니다!! :)");
				count++;
			}else {
				System.out.println("아쉽네요....");
				System.out.println("정답은 : "+ wordList.get(index).getEng());
			}
		}
		System.out.println("GAME OVER!!");
		System.out.printf("%d 게임중 %d 번 정답 맞춤!!",count, game);
		
		
		
	}

}
