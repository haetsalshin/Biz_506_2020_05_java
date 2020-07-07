package com.biz.word.exec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto {
	
	public static void main(String[] args) {
		
		List<Integer> intList =new ArrayList<Integer>();
		for(int i = 0 ; i <45 ; i++) {
			
			intList.add(i+1);
		}
		System.out.println("행운을 드립니다 !!! ");
		Collections.shuffle(intList);
		for(int i = 0 ; i < 6 ; i ++) {
			System.out.print(intList.get(i) + "\t");
		}
		System.out.println("\n꼭 부자되세요 (일단 나부터ㅠ)");
		
	}

}
