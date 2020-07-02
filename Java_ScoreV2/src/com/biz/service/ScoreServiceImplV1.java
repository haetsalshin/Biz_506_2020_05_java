package com.biz.service;

import java.util.List;
import java.util.Scanner;

import com.biz.domain.ScoreVO;

/*
 * ScoreService*** 클래스를 정의할 때
 * 반드시 ScoreService interface를 참조(implements)하도록 규칙을 정해 놓는다.
 * ScoreService interface를 참조하는 클래스는 ScoreService interface에 디지인 된
 * method를 모두 implemet해서 작성되어야 하는 규칙이 작동 하게 된다.
 * 따라서 모든 method의 이름이 통일 되는 효과를 얻게 된다.
 * 
 * interface(ScoreService)를 implements하여 작성된 클래스는
 * interface에 정의된 method의 규칙을 그대로 준수하여 작성해야 할 의무가 있는 클래스이다.
 * 모양은 interface의 모양을 그대로 가지고 있으며 
 * 하는 일은 실제 클래스의 method에 구현되어 있다.
 */
public class ScoreServiceImplV1 implements ScoreService {
	
	
	
	@Override
	public boolean inputScore() {
		// TODO Auto-generated method stub
		return false;
	}
	

	@Override
	public void calcSum() {
		
	}

	@Override
	public void calcAvg() {
		
	}

	@Override
	public void scoreList() {
		
	}
	
	

}
