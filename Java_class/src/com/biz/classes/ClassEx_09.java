package com.biz.classes;

import com.biz.classes.model.ScoreVO;
import com.biz.classes.service.ScoreService;

public class ClassEx_09 {
	public static void main(String[] args) {
		
		int intKor = 90;
		int intEng = 80;
		int intMath = 70;
		int intMusic = 90;
		int intArt = 99;
		int intSci = 100;
		
		/*
		 *  method의 매개변수 전달
		 *  전달하고자 하는 매개변수가 몇개 안 될 때는
		 *  매개변수를 잘못전달하여 발생하는 문제가 별로 없다.
		 *  하지만 매개변수의 개수가 많아지면 값이 뒤바뀔 수 있다.(뮤직을 두번 쓴다던가)
		 *  경우에 다라 누락되거나 중복 등 잘못 전달 될 수 있다.
		 * 
		 *  이럴 때 매개변수를 담을 클래스를 만들고 
		 *  인스턴스를 생성한 후 인서튼서의 멤버 변수에 값을 담은 다음
		 *  인스턴스를 매개변수로 전달하면 1개의 매개변수만으로도 코드를 해결 할 수 있다.
		 * 
		 *  클래스를 만들고 인스턴스를 생성하는 절차가 번거롭기는 하지만
		 *  그만큼 오류가 발생할 확률이 낮은 코드 작성이 가능하다.
		 * 
		 */
		ScoreService scoreService = new ScoreService();
		int sum =scoreService.sum(intKor, intEng, intMath, intMusic, intArt, intSci);
		
		ScoreVO score = new ScoreVO();
		score.setIntKor(intKor);
		score.setIntEng(intEng);
		score.setIntMath(intMath);
		score.setIntArt(intArt);
		score.setIntMusic(intMusic);
		score.setIntSci(intSci);
		
		scoreService.sum(score);
		System.out.println("총점 : " + sum);
		
		
		
	}

}
