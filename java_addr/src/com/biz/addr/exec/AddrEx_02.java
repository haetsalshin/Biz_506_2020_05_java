package com.biz.addr.exec;

import com.biz.addr.service.AddrService02;

public class AddrEx_02 {
	
	public static void main(String[] args) {
		
	
		AddrService02 addrService = new AddrService02();
	
		// inputAddr() method를 for 를 이용해서 5번 호출하면서
		// 5명의 주소를 입력하기
		for(int i = 0; i < 5 ; i ++) {
			
			System.out.println("===================================");
			System.out.println(i+"번째 주소록");
			System.out.println("-----------------------------------");
			addrService.inputAddr();
			
		
		
		
		
		}
	
	}
}
