package com.biz.Score.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.Score.domain.ScoreVO;
import com.biz.address.config.Lines;

public class ScoreServiceImplV1 implements ScoreService {

	protected List<ScoreVO> scoreList;
	protected String fileName ;
	
	public ScoreServiceImplV1() {
		scoreList = new ArrayList<ScoreVO>();
		fileName ="src/com/biz/Score/exec/score.txt";
	}
	
	
	@Override
	public boolean inputScore() {
		Scanner scan = new Scanner(System.in);
		
		ScoreVO scoreVO = new ScoreVO();
		
		System.out.print("학번 (END :종료) >>");
		String strNum = scan.nextLine();
		int intNum = 0;
		
		if(strNum.equals("END")) {
			return false;
		}
		
		try {
			intNum = Integer.valueOf(strNum);
		} catch (Exception e) {
			System.out.println("학번은 숫자만 입력가능합니다.");
			return true;
		}
		strNum = String.format("%05d", intNum);
		
		for(ScoreVO sVO : scoreList) {
			
			if(sVO.getNum().equals(strNum)) {
				System.out.println("학생 정보가 이미 존재해 입력할 수 없습니다.");
				return true;
			}else {
				scoreVO.setNum(strNum);
			}
		}
		
		
		
		
		
		
		System.out.print("국어 >> ");
		String strKor = scan.nextLine();
		int intKor = 0;
		try {
			intKor = Integer.valueOf(strKor);
		} catch (Exception e) {
			System.out.println("점수는 숫자만 입력가능합니다.");
			return true;
		}
		scoreVO.setKor(intKor);
		
		System.out.print("영어>> ");
		String strEng = scan.nextLine();
		int intEng = 0;
		try {
			intEng = Integer.valueOf(strEng);
		} catch (Exception e) {
			System.out.println("점수는 숫자만 입력가능합니다.");
			return true;
		}
		scoreVO.setEng(intEng);
		
		System.out.print("수학 >> ");
		String strMath = scan.nextLine();
		int intMath = 0;
		try {
			intMath = Integer.valueOf(strMath);
		} catch (Exception e) {
			System.out.println("점수는 숫자만 입력가능합니다.");
			return true;
		}
		scoreVO.setMath(intMath);
		
		scoreList.add(scoreVO);
		return true;
	}

	@Override
	public void calcSum() {
		
		int sum = 0;
		for(ScoreVO scoreVO : scoreList) {
			
			sum = scoreVO.getKor();
			sum += scoreVO.getEng();
			sum += scoreVO.getMath();
			
			scoreVO.setSum(sum);
			
		}
		
	}

	@Override
	public void calcAvg() {
		
		int avg = 0;
		for(ScoreVO scoreVO : scoreList) {
			
			avg = scoreVO.getSum()/3;
			
			scoreVO.setAvg(avg);
			
		}

	}

	@Override
	public void scoreList() {
		
		System.out.println(Lines.d_line);
		System.out.println("성적알람표");
		System.out.println(Lines.d_line);
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println(Lines.s_line);
		for(ScoreVO sVO : scoreList) {
			
			System.out.print(sVO.getNum()+"\t");
			System.out.print(sVO.getKor()+"\t");
			System.out.print(sVO.getEng()+"\t");
			System.out.print(sVO.getMath()+"\t");
			System.out.print(sVO.getSum()+"\t");
			System.out.print(sVO.getAvg()+"\n");
			
			
		}
		System.out.println(Lines.d_line);
		

	}

	@Override
	public void scoreLoad() {
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(fileName);
			buffer= new BufferedReader(fileReader);
			
			String reader = "";
			while(true) {
				reader = buffer.readLine();
				if(reader == null) {
					break;
				}
				String[] scores = reader.split(":");
				ScoreVO scoreVO = new ScoreVO();
				
				scoreVO.setNum(scores[0]);
				scoreVO.setKor(Integer.valueOf(scores[1]));
				scoreVO.setEng(Integer.valueOf(scores[2]));
				scoreVO.setMath(Integer.valueOf(scores[3]));

				scoreList.add(scoreVO);
			}
			
	
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("성적 파일 열기 오류! 새로 만들겠습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("성적 파일 읽기 오류!");
		}
		
		

	}

	@Override
	public void scoreSave() {
		
		FileWriter fileWriter = null;
		PrintWriter pWriter = null;
		
		try {
			fileWriter = new FileWriter(fileName);
			pWriter = new PrintWriter(fileWriter);
			
			for(ScoreVO scoreVO : scoreList) {
				
				
				pWriter.printf("%s:", scoreVO.getNum());
				pWriter.printf("%d:", scoreVO.getKor());
				pWriter.printf("%d:", scoreVO.getEng());
				pWriter.printf("%d\n", scoreVO.getMath());
				
				
				
				
			}
			pWriter.flush();
			pWriter.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("파일을 열 수 없습니다.");
		}
		

	}

}
