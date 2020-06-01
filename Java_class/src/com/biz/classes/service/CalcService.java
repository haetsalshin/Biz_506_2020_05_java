package com.biz.classes.service;

/*
 * 전통적인 java이전의 프로그래밍 방식에서 주로 사용한 코드
 * method()를 함수(Function())이라고 했다.
 * 클래스에 멤버변수 보다는 어떤 기능을 수행하는 method 위주로만
 * 작성되는 코드
 */
public class CalcService {
	
	// add() method
	// 2개의 숫자를 매개변수로 받아서 
	// 덧셈을 수행 한 후 다시 되돌려주는 기능
	public int add(int num1, int num2) {
		
		int sum = num1 + num2;
		return sum;
		
	}
	public int even(int num1, int num2) {
		
		int sum =0;
		for (int i = num1; i <= num2 ; i++){
			if(i % 2 ==0) {
				sum += i;
			}
			
		}
		return sum;
	}
	
	public int prime(int num1, int num2) {
		int sum = 0;
		
		for ( int i = num1 ; i < num2; i++) {
			int index = 0;
			for( index = i; index < num2 ; index++) {
				
				if(index % 2 ==0) {
					break;
				}
			}
			if(index == num2) {
				sum += i;
			}
			
			
		}
		return sum;
		
	}
	
	
	
	

}
