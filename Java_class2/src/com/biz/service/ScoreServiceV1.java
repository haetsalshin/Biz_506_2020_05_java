package com.biz.service;

import com.biz.model.ScoreVO;

public class ScoreServiceV1 {

	public void scoreList(ScoreVO[] score) {

		LineService lineService = new LineService();
		int lineLength = 50;
		
		String d_line = lineService.do_line(lineLength);
		String s_line = lineService.single(lineLength);
	
		System.out.println(d_line);
		System.out.println("\t\t성적일람표");
		System.out.println(s_line);
		System.out.println("이름\t 국어\t 영어\t 수학\t 총점\t 평균");
		System.out.println(s_line);
	
	
		for(int i = 0; i < score.length ; i++) {
			
			// for(){} 내에서 선언된 sum, avg변수는
			// for(){} 명령문이 종료되면 이후에 참조할 수 없다.
			int sum =0;
			int avg =0;
			
			sum = (score[i].getKor() + score[i].getEng() +score[i].getMath());
			avg = sum / 3 ;
			System.out.printf("%s\t %d\t %d\t %d\t %d\t %d\n",
					score[i].getName(),
					score[i].getKor(),
					score[i].getEng(),
					score[i].getMath(),
					sum,
					avg
			);			
		}
		System.out.println(d_line);
	}


}
