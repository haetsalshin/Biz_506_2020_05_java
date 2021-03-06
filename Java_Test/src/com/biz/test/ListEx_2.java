package com.biz.test;

import java.util.ArrayList;
import java.util.List;

public class ListEx_2 {

	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<Integer>();
		for(int i = 0; i < 100; i ++) {
			
			// 0 ~ 1 미만의 실수를 생성하는 static method 
			// * 100을 하면 0부터 99.9999...의 난수를 생성
			// +1을 하면 1 ~100.9999의 난수가 생성
			// 결과를 (int)형으로 강제 형변환하고
			// 다시 Integer형으로 강제 Boxing하여 num변수 에 저장
			Integer num = Integer.valueOf( (int)( Math.random() *100 )+1);
			
			
			intList.add(num);
		}
		System.out.println(intList);
		
		int sum = 0;
		for(Integer num : intList) {
			sum += num;
		}
		System.out.println(sum);
		
		sum =0;
		int size = intList.size();
		for(int i =0; i < size; i++) {
			int num1 = intList.get(i);
			sum += num1;
		}
		System.out.println(sum);
	}
	
}
