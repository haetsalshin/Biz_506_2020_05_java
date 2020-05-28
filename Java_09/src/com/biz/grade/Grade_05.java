package com.biz.grade;

import java.util.Random;

import com.biz.score.Student;

public class Grade_05 {
	
	public static void main(String[] args) {
		
	
		int sum=0;
		for(int i = 0; i <1000000 ; i++) {
			sum=100;
		}
		System.out.println(sum);
		// for 반복문 이전에 이미 sum객체를 선언을 했기 때문에 for문이 끝나도 객체sum 값은 출력이 된다.
		// 또한 for반복문에서 i가 10에서 1000000번까지 늘어나도 sum 객체 값은 100으로 할당 되기 때문에
		// for 반복문이 끝나도 최종적으로 선언 된 값 100이 출력된다.
		
		for(int i =0 ; i < 10 ; i++) {
			System.out.println(sum);
		}
		
		Student student = new Student();
		
		// Student 클래스에 선언 된 make() 메서드를 호출하기
		student.make(); 
		String strN = student.getName();
		/*
		 * public class Student {
		 * 		String strName = "홍길동";
		 * 		public void make() {
		 * 			strName = "이몽룡";
		 * 		}
		 *    ?? strName => 이몽룡
		 * 
		 * 		public String getName(){
		 * 			return strName;
		 * 		}
		 * }
		 * ?? strName =? 알 수 없다.
		 */
		System.out.println(strN);
		
		Random rnd = new Random();
		rnd.nextInt();
		
		
		
		
		
		
	}
	

}
