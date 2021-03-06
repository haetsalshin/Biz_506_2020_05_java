package com.biz.book.service;

public interface BookService {
	
	/*
	 * input()
	 * 어떤 정보를 키보드로 입력받기
	 * 무작정 입력 받기도 하고, 입력하는 과정에서 END라는 문자열을 입력하면
	 * 입력을 중단한다는 신호를 호출하는 곳으로 return.
	 * 
	 * input()에서
	 * 모든 항목 입력이 정상적으로 이루어지면 return true.
	 * 만약 중단하려면 END문자열을 입력하면 호출한 곳에 false return하여 더이상 입력을 하지 않겠다고 신호를 보냈다.
	 * 
	 * 호출한 곳에 true, false를 return하기 위해서 input() method의 return type을 void해서 boolean으로 변경하였다.
	 */
	public boolean inputBook();
	public void bookList();

}
