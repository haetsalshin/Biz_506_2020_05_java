package com.biz.student.string;

public class StringEx_02 {
	public static void main(String[] args) {
		
		String strNation = "Republic of Korea";
		
		// strNation.substring(9,11) : " 이후부터의 글자를 0번으로 시작해서 9번부터 11번째가 되기 전까지 (10번째) 글자를 보여줘라.
		// strNation 에 담긴 문자열에서 9 <= x < 11범위까지의 문자열을 담아서 subNation에 담아라
		String subNation = strNation.substring(9,11);
		System.out.println(subNation); // of
		
		// 문자열 개수가 몇개냐?
		int strLength = strNation.length(); 
		System.out.println(strLength); // 17
		
		// strNation 문자열을 1글자씩 잘라서 콘솔에 보이기
		for(int i = 0 ; i < strLength ; i ++) {
			String s = strNation.substring(i,i+1);
			//System.out.println(s);
		}
		
		// 문자열을 한글자씩 분해하여 문자 배열로 변환하여 charNations에 저장하라.
		char[] charNations = strNation.toCharArray();
		for(int i = 0 ; i < charNations.length ; i ++) {
			System.out.print(charNations[i]+"\t");
			//R	e	p	u	b	l	i	c	 	o	f	 	K	o	r	e	a
		}
		System.out.println();
		
		// 문자열을 한글자씩 분해하여 문자열 배열로 변환하여 strNation에 저장하라.
		String[] StrNations = strNation.split("");
		for(int i =0; i < StrNations.length ; i ++) {
			System.out.print(StrNations[i] + "\t");
			//R	e	p	u	b	l	i	c	 	o	f	 	K	o	r	e	a
		}
		
	}

}
