package com.biz.word.exec;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionEx_01 {
	
	public static void main(String[] args) {
		
		String nation = "KOREA";
		String[] nations = nation.split(""); // 알파벳 단위로 분해
		
		// Arrays.asList(배열) : 배열을 List형 데이터로 변환
		List<String> words = Arrays.asList(nations); // 배열을 리스트로 변환하는 명령어
		
		// Collections 클래스의 기능을 몇가지 사용하기 위해서
		// 배열을 List형 데이터로 변환했다.
		

		// String, Integer, Long, Float, Character, Boolean  과 같은 Wrapper클래스를 포함하는
		// List 데이터를 오름차순 정렬하는 매우 간단한 method이다.
		// collections의 sort() method는 내부 알고리즘이 Quick Sort이므로
		// 사용하는데 아무런 제약이 없이 사용 해도 된다.
		Collections.sort(words); // List에 있는 값들을 오름차순으로 정렬하는 것.
		System.out.println(words);
		
		// List에 포함된 item들을 뒤죽박죽하게 섞는 기능을 수행한다.
		Collections.shuffle(words);
		System.out.println(words);
		
		
		
		
		
	}

}
