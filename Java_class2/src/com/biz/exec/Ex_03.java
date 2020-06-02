package com.biz.exec;

import com.biz.service.MethodService;

public class Ex_03 {
	
	public static void main(String[] args) {
	
		int num1 = 30;
		
		MethodService mService = new MethodService(); // MethodService 클래스를 통해 인스턴스 생성
		
		mService.print(num1);
		mService.print(50); // 50 : 파라메터, Argumnet.
		
		
	}

}
