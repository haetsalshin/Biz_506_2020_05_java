package com.biz.domain;

public class ScoreVO {
	
	private String strNum = "";
	private int intKor = 0;
	private int intEng = 0;
	private int intMath = 0;
	private int intSum = 0;
	private float floatAvg = 0;
	/*
	 * 성적처리 과정에서 1학생의 성적을 담는 object변수
	 * value object 클래스 라고 한다.
	 * VO, DTO 클래스들을 domain 클래스 라고 한다.
	 * 
	 * 필드 변수를 private로 설정하고 
	 * 필드변수에 접근(값을 저장, 읽기) getter, setter를 선언
	 * 
	 * 이러한 방식으로 클래스를 정의하는 것을 정보은닉, 캡슐화
	 */
	public ScoreVO(String strNum, int intKor, int intEng, int intMath, int intSum, float floatAvg) {
		super();
		this.strNum = strNum;
		this.intKor = intKor;
		this.intEng = intEng;
		this.intMath = intMath;
		this.intSum = intSum;
		this.floatAvg = floatAvg;
	}
	public ScoreVO() {
		// TODO Auto-generated constructor stub
	}
	public String getStrNum() {
		return strNum;
	}
	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}
	public int getIntKor() {
		return intKor;
	}

	// 정보의 유효성 검사
	// 현재 국어점수 필드에 저장하려고 하는 값이 유효한 값인가를 검사
	// 성적은 0~100까지가 기본값인데
	// 만약에 성적을 0 미만, 100초과 된 값을 저장하려고 하면
	// 거부하도록 stKor()을 변경하겠다
	public boolean setIntKor(int intKor) {
		if(intKor < 0 || intKor >100 ) {
			return false;
		}
		this.intKor = intKor;
		return true;
	}
	public int getIntEng() {
		return intEng;
	}
	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}
	public int getIntMath() {
		return intMath;
	}
	public void setIntMath(int intMath) {
		this.intMath = intMath;
	}
	public int getIntSum() {
		return intSum;
	}
	public void setIntSum(int intSum) {
		this.intSum = intSum;
	}
	public float getFloatAvg() {
		return floatAvg;
	}
	public void setFloatAvg(float floatAvg) {
		this.floatAvg = floatAvg;
	}
	
	


}
