package com.biz.classes.service;

import com.biz.classes.model.ScoreVO;

/*
 * method의 중복정의
 * method overloading
 * method의 매개변수가 다르면 같은 이름의 method를 한 클래스 내에서 중복정의 하여 사용할 수 있다.
 * 
 * java 이전의 언어에서는
 * 클래스를 모듈이라는 이름으로 불렀는데
 * 1개의 모듈, 1개의 파일 내에서는 같은 이름의 method(함수)를 정의 할 수 없었다.
 * java에서는 method에 매개변수 개수가 다르면 같은 이름의 method를 사용 할 수 있다.
 * 호출하는 곳에서 매개변수 전달을 다르게 수행하면 자동으로 method가 연결되어 코드가 수행된다.
 * 
 * 
 * 또한 method의 배개변수 개수가 같으경우라도
 * 매개변수의 type이 다르면 이름이 같은 method를 정의 할 수 있다.
 */
public class ScoreService {
	
	public int sum() { // 매개변수 0
		return 0;
	}
	
	// Score클래스를 매개변수로 받는 method
	public int sum(ScoreVO score) {
		
		int sum = score.getIntKor();
		sum += score.getIntEng();
		sum += score.getIntMath();
		sum += score.getIntMusic();
		sum += score.getIntArt();
		sum += score.getIntSci();
		
		score.setIntSum(sum);
		score.setIntAvg(sum/6);
		return sum;
	}

	public int sum(int kor, int eng, int math, int music, int art, int sci) {
		int sum = kor + eng + math + music + art + sci;
		return sum;
		
		
	}
	
	public float sum(float kor, float eng, float math) {
		float sum = kor + eng + math;
		return sum;
	}
	
	public int sum(int kor, int eng, int math) { // 매개변수 3
		int sum = kor + eng + math;
		return sum;
	}
	
	public int sum (int kor, int eng) { // 매개변수 2
		return kor + eng;
	}
	
	public float sum(int kor, float eng) {
		return kor + eng;
	}
	
	public float sum(float kor, int eng) {
		return kor + eng;
	}
	
	// 만약  ClassEx_08 의 25번 라인에 그냥 score.sum()을 호출하면 매개변수 0을 호출하고
	// score.sum(intKor, intEng) 매개변수 2개짜리를 호출하고
	// score.sum(intKor, intEng, intMath) 매개변수 3개짜리를 호출하고
	// 매개변수 갯수에 따라서 자동으로 선택된다.
	
	
}
