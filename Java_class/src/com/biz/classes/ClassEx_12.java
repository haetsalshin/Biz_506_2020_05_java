package com.biz.classes;

import com.biz.classes.model.BankVO;
import com.biz.classes.service.BankService;
import com.biz.classes.service.BankServiceV2;

public class ClassEx_12 {
	
		public static void main(String[] args) {
		
			BankVO bankList[] = new BankVO[5];
		
			for(int i = 0 ; i < bankList.length ; i++) {
				bankList[i] = new BankVO();
				bankList[i].setStrNum("001");
				String date = "2020-05-0" + (i+1);
				bankList[i].setStrDate(date);
			}
	
			bankList[0].setIntInput(5000);
			bankList[2].setIntInput(5000);
		
			bankList[1].setIntOutput(1000);
			bankList[3].setIntOutput(1000);
			bankList[4].setIntOutput(1000);
			
			
			// 기본형 변수들...
			// primitive variable
			int num=0; // integer 형 변수 num를 선언하고 0으로 clear 했다.
			long num1 = 0L; // long 형 변수 num1를 선언하고 0으로 clear 했다.
			float num2 = 0.0f;
			double num3 = 0.0;
			boolean bYes = false;
			char char1 = 'c'; // character  형 변수 char1를 선언하고 문자 C를 저장
			
			// String(문자열)형 변수는 변수처럼 사용하지만 실제로는 
			// 일반 변수와 달리  String 클래스로 만든 String 형 인스턴스라고 해야한다.
			String strName = "홍길동"; 
			// String strName = new String("홍길동");
			String strNation = new String(); //  원래는이렇게 클래스를 만들어서 인스턴스를 생성해야 함.
			
		
			// BankServiceV2 클래스를 사용해서
			// bankService 라는 변수를 선언
			// bankService 변수를 "객체(object)", "인스턴스(Instance)"
			// 라고 한다.
			BankServiceV2 bankService = new BankServiceV2();
			// bankService인스턴스를 통해서
			// bankList() method를 호출하면
			// BankServiceV2 클래스 내에 정의 된 bankList() method 내의 코드들이 순서대로 실헹된다.
			
			bankService.bankList(bankList);
			
			
			bankList[0].setIntValance(5000);
			bankList[1].setIntValance(4000);
			bankList[2].setIntValance(9000);
			bankList[3].setIntValance(8000);
			bankList[4].setIntValance(7000);
			
			
		BankService bankService1 = new BankService();
		bankService1.bankList(bankList);
		
		
		
		
		}
		
		
	
}
