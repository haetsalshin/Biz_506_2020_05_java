package com.biz.student.string;
/*
 * String 형 변수는 primitive 변수처럼 사용을 하지만
 * 근본적인 형(type) 클래스이다.
 * 따라서 String형 변수는 일반변수라기 보다는 객체(인스턴스)이다.
 * 
 * 일반변수(primitive)와 객체의 차이
 * 일반변수 : 그냥 데이터를 저장하는 메모리의 저장 공간일 뿐. 
 * 객체 : 데이터를 저장하는 용도 외에 다양한 method를 통하여 데이터를 가공, 연산 하는 일들을 수행할 수 있다.
 * 
 */
public class StringEx_01 {
	
	public static void main(String[] args) {
		
		String strNation = "Republic of Korea";
		
		/*
		 * strNation은 문자열 변수 이면서 String 클래스를 사용하여 만든 String type 객체이다.
		 * 따라서 점(.) 연산자를 통하여 다양한 method를 사용할 수 있다.
		 */
		
		// strNation에 담긴 문자열을 모두 대문자로 바꾸어서 return하는 method
		System.out.println(strNation.toUpperCase());
		System.out.println(strNation.toLowerCase()); // 모두 소문자로 바꾸기
		
		// strNation에 담긴 문자열이 korea 냐?
		System.out.println(strNation.equals("korea")); // false// 문자열이 같은지 비교하는 것
		
		// 대소문자 관계없이 비교하기
		strNation = "Korea";
		System.out.println(strNation.equalsIgnoreCase("korea")); // true
		
		
		
		// strNation문자열에 Korea라는 문자열이 들어있냐?
		strNation = "Republic of Korea";
		System.out.println(strNation.contains("Korea"));
		
		// 문자열은 별도로 객체변수에 담지않아도
		// "" 묶인 문자열은 문자열 객체로 취급되어 점(.) 연산자를 직접 사용할 수 있다.
		// only in java it is possible
		System.out.println("Korea".equals("Korea"));
		
		// 문자열을 객체변수에 담지 않고 바로 대문자로 바꾸고 싶을 때
		System.out.println("KoRea".toUpperCase());
		
		// 문자열을 대문자로 모두 바꾸어 str1변수에 담아라
		String str1 = "rePublic of KoRea".toUpperCase();
		
		
		
		
	}

}
