package com.biz.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListEx_02 {
	
	public static void main(String[] args) {
		
		// size() 가 0인 intList가 새로 생성된다.
		List<Integer> intList = new ArrayList<Integer>();
		Random rnd = new Random();
		
		// int num = rnd.nextInt(); // 이렇게 하면 for문에 들어가면 똑같은 값을 100개 만드는 꼴이기 때문에 이렇게 하면 안된다.
		// 데이터를 생성하는 부분
		for(int i= 0 ; i <100 ; i++) {
			
			// 1~100 까지의 난수(임의 숫자)를 발생하여
			int num = rnd.nextInt(100)+1;
			
			// intList에 추가하기
			intList.add(num);
			
		}
		// size()가 100 이 되고 정수값이 100개 추가된 intList가 된다.
		int sum = 0;
		for(int i = 0 ; i < 100 ; i ++) {
			// i번째 위치의 값을 읽어서 sum 변수에 누적하라
			sum += intList.get(i); 
			// intlist[ i ] 배열에 들어가는 i값(첨자)이나 intList의 i(index)에 들어가는 값은 같다.
			
		}
		System.out.println("합계:"+sum);
		
	}

}
