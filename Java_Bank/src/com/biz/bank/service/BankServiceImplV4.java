package com.biz.bank.service;

import java.io.File;

/*
 *  V3를 상속 받음으로 해서
 *  inputBalance(), outPutBalance()와 loadBalance(), saveBalance() 메서드를 사용 가능
 *  
 */   
public class BankServiceImplV4 extends BankServiceImplV3{
	
	private String accNum = "";
	private String basePackage ="";
	
	// 사용자로부터 계좌번호를 입력받는 역할을 수행한다.
	public boolean account() {
		
		basePackage = "src/com/biz/bank/exec/data";
		
		System.out.print("계좌번호 입력( 정수값 5자리 이내 )");
		accNum = scan.nextLine();
		try {
			// Balance-00001.txt
			accNum = String.format("BALANCE-%05d.txt",Integer.valueOf(accNum));
		} catch (Exception e) {
			System.out.println("계좌번호는 정수 다섯자리 이내 값만 가능합니다.");
			return false;
		}

		System.out.println("계좌번호"+accNum);
		
		// 현재 basepackage(src/com/biz/bank/exec/data) 문자열과 계좌번호 파일 문자열을 연결하여
		// src/com/biz/bank/exec/data/BALANCE-00001.txt 라는 파일 객체로 생성
		// 그 객체가 생성한 파일이름을 추출하여 bFileName 필드변수에 저장해 놓는다.
		//File file = new File(basePackage, accNum);
		
		this.bFileName= basePackage + File.separator +accNum;
		
		System.out.println("계좌 파일 :" + bFileName);
		this.loadBalance(); // 새로 입력된 계좌번호에 해당하는 정보 로딩
		
		return true;
	}
}
