package com.biz.hello;

import java.util.Random;

public class Var_12 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		for( int i =0 ; i <100 ; i++) {
			int num = rnd.nextInt(100)+1;
		
		}
		// for() { } 반복문 내에서 선언된 변수는
		// for() { } 를 벗어나는 순간 모두 소멸 된다.
		// 따라서 num변수는 for(){ }이 끝난 다음에 읽기, 쓰기가 불가능 하다.
		// 이러한 성질을 우리는 변수의 Scope라고 한다.
		// system.out.println(num);
	}

}
