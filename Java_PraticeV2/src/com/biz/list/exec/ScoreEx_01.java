package com.biz.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.list.config.Lines;
import com.biz.list.model.ScoreVO;

public class ScoreEx_01 {
	
	public static void main(String[] args) {
		
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		Random rnd= new Random();
		
		ScoreVO scoreVO;
		int sum = 0;
		int avg = 0;
		
		for(int i = 0 ; i < 10 ; i++) {
			// VO 인스턴스를 초기화, 다시 생성하라
			scoreVO = new ScoreVO(); 
			
			// (필드변수) 값을 세팅하고
			scoreVO.setNum(""+(i+1));
			scoreVO.setKor(rnd.nextInt(50)+51);
			scoreVO.setEng(rnd.nextInt(50)+51);
			scoreVO.setMath(rnd.nextInt(50)+51);
			
			sum = scoreVO.getKor();
			sum+= scoreVO.getEng();
			sum+= scoreVO.getMath();
			scoreVO.setSum(sum);
			
			avg = scoreVO.getSum()/3;
			
			scoreVO.setAvg(avg);
			
			// 리스트에 추가
			scoreList.add(scoreVO); 
			
		}
		
	
		System.out.println(Lines.d_Line);
		System.out.println("성적알람표");
		System.out.println(Lines.d_Line);
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println(Lines.s_line);
		for(ScoreVO sVO : scoreList) {
			System.out.print(sVO.getNum()+"\t");
			System.out.printf(sVO.getKor()+"\t");
			System.out.printf(sVO.getEng()+"\t");
			System.out.printf(sVO.getMath()+"\t");
			System.out.printf(sVO.getSum()+"\t");
			System.out.printf(sVO.getAvg()+"\n");
		
		}
		System.out.println(Lines.d_Line);
	}

}
