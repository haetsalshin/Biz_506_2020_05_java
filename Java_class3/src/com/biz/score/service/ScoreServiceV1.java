package com.biz.score.service;

import com.biz.score.vo.ScoreVO;

public class ScoreServiceV1 {
	/*
	 * scores 인스턴스 배열을 필드변수로 선언한 이유
	 * Ex 클래스에서 Service클래스에서
	 * 총점 계산, 평균계산, 리스트 출력을 요청할 텐데
	 * 요청을 할 때마다 scores 인스턴스 배열을 매개변수로 전달 할 수 있지만
	 * 한번만 변수로 전달해서 Service클래스가 scores인스턴스를 보관하도록 하고 
	 * 나머지 요청하는 method에서는 변수를 받는 부분을 제거하기 위함이다.
	 * 
	 * Ex클래스에서 요청들을 할 때마다 scores 배열을 매개변수로 전달을 하면
	 * 요청과 요청사이에서 다른 코드에 의해 scores배열 값이 변형 되어 결과가 엉뚱하게
	 * 나타나는 것을 방지하는 목적도 있다.
	 * 
	 */
	private ScoreVO[] scores; // 필드변수 선언. 모양만 있지 주소가 없음.
	/*
	 * ScoresServiceV1 클래스를 사용해서
	 * 어떤 연산을 수행하려고 할 때
	 * 반드시 setScore() method를 통해서 scores값을 매개변수로 주입을 해주어야 한다.
	 * 그렇지 않으면 scores 인스턴스 필드변수가 
	 * 아직 준비가 안 된 상태이기 때문에
	 * 이후에 호출되는 method() 들에서
	 * NullPointerException이 발생을 한다.
	 */
	
	public void setScores(ScoreVO[] scores) {
		this.scores = scores; // 필드변수 setting 하고
	}
	/*
	 * 필드변수로 scores 선언 되어 있기 때문에
	 * 학생 총점과 평균을 계산한 후
	 * 어디에 저장해야 할지를 고민하지 않아도 된다.
	 */
	
	// 총합 메서드 만들기
	public void scoreSum () {
		for(int i =0; i < scores.length ; i++) {
			int sum = this.scores[i].getIntKor();
			sum += this.scores[i].getIntEng();
			sum += this.scores[i].getIntMath();
			sum += this.scores[i].getIntMusic();
			
			this.scores[i].setIntSum( sum);
		}
	}	
	
	// 평균 메서드 만들기
	public void ScoreAvg() {
		for(int i = 0; i <scores.length; i++) {
			int sum = this.scores[i].getIntSum();
			
			this.scores[i].setIntAvg(sum / 4);
		}
	}
	
	LineService lineService = new LineService();
	String d_Line = lineService.do_line(52);
	String s_Line = lineService.single(52);
	
	//  ScoreList() 출력하는 메서드 만들기
	public void ScoreList() {
		System.out.println(d_Line);
		System.out.println("성적 일람표");
		System.out.println(s_Line);
		System.out.println("학번\t 국어\t 영어\t 수학\t 음악\t 총점\t 평균");
		
		
		// 점수 리스트를 표시할 때는 for반복문을 이용해서 사용
		// this. : '현재 이 클래스에 선언된' 이라는 뜻
		for(int i = 0;  i < this.scores.length ; i++) {
				System.out.printf("%s\t %d\t %d\t %d\t %d\t %d\t %d\n",
						
						scores[i].getStrNum(), // String
						scores[i].getIntKor(), // int
						scores[i].getIntEng(), // int
						scores[i].getIntMath(), // int
						scores[i].getIntMusic(), //int
						scores[i].getIntSum(), // int
						scores[i].getIntAvg() //int
						);
		}
		
		// 과목별 총점 만들기
		
		int subKorSum=0;
		int subEngSum=0;
		int subMathSum=0;
		int subMusicSum=0;
		int subSum=0;
		int subAvg=0;
			
		for(int i =0; i < this.scores.length ; i++) {
				subKorSum += scores[i].getIntKor();
				subEngSum += scores[i].getIntEng();
				subMathSum += scores[i].getIntMath();
				subMusicSum += scores[i].getIntMusic();
				subSum += scores[i].getIntSum(); // 총점의 총점
				subAvg += scores[i].getIntAvg(); // 평균의 총점
			}
		
	
		System.out.println(d_Line);
		System.out.printf("총점 \t %d\t %d\t %d\t %d \t%d \t%d \n",
					 subKorSum,subEngSum,subMathSum,subMusicSum,subSum, subAvg
			);
		System.out.printf("평균 \t %d\t %d\t %d\t %d \t%d \t%d \n",
					 subKorSum/scores.length,subEngSum/scores.length,subMathSum/scores.length,subMusicSum/scores.length,subSum/scores.length,
					 subAvg/scores.length
			);
		System.out.println(d_Line);
		
	}

}
