package com.biz.score;

public class ScoreVO {
	
	private String strNum = "";
	private int intKor = 0;
	private int intEng = 0;
	private int intMath = 0;
	private int intSum = 0;
	private int intAvg = 0;
	
	public ScoreVO() {
	}
	
	public ScoreVO(String strNum, int intKor, int intEng, int intMath, int intSum, int intAvg) {
		super();
		this.strNum = strNum;
		this.intKor = intKor;
		this.intEng = intEng;
		this.intMath = intMath;
		this.intSum = intSum;
		this.intAvg = intAvg;
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

	public void setIntKor(int intKor) {
		this.intKor = intKor;
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

	public int getIntAvg() {
		return intAvg;
	}

	public void setIntAvg(int intAvg) {
		this.intAvg = intAvg;
	}
	
	

}
