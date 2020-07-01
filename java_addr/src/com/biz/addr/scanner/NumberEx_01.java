package com.biz.addr.scanner;

public class NumberEx_01 {
	public static void main (String[] args) {
		
		/*
		 * 숫자형 Wrapper class의 valueOf() method를 사용하면 숫자형 문자열을 숫자형 데이터로 변환 시킬 수 있다.
		 * 오래된 java 버전에서는 valueOf(), parse*() method간의 성능 차이가 있었으나
		 * 현재 java 1.6 이상에서는 내부 메커니즘이 같아져 성능 차이가 없다.
		 */
		
		// Integer.ValueOF() : 숫자형 문자열을 정수로 변환시키는 method
		Integer.valueOf("34"); //  정수 34
		Float.valueOf("34.3"); // 실수 34
		Double.valueOf("34.3"); // 실수 34
		Long.valueOf("333333"); 
		
		// java 1.5이전부터 사용한 method. 예전에는 성능 차이가 많이 났지만 지금은 별 차이가 안남. 
		// 더 복잡해서 외우기 힘드니까 valueOf()를 씁니당~
		Integer.parseInt("34");
		Float.parseFloat("34.3");
		Double.parseDouble("34.3");
		Long.parseLong("33333333");
		
		// 아래와 같은 경우는 모두 NumberFormatException을 일으키는 코드
		Integer.valueOf("");
		Integer.valueOf("34 "); // 숫자 앞, 뒤에 white space문제
		Integer.valueOf("A34"); // 숫자 앞, 뒤에 숫자형 이외의 문자열이 있는 경우
		Integer.valueOf("3 4"); // 숫자 중간에 space, 숫자형 이외의 문자열이 있는 경우
		Integer.valueOf("3+4"); // 하나의 문자열이 연산식처럼 보일 때
		
		
	}

}
