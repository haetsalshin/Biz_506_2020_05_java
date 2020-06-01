package com.biz.classes.service;

import com.biz.classes.model.BankVO;

public class BankService {
	
	public void bankList(BankVO[] bankList) {
		
		
		for(int i = 0; i < bankList.length; i++) {
			
			System.out.printf("%s\t %s\t %d\t %d\t %d\n",
					bankList[i].getStrNum(),
					bankList[i].getStrDate(),
					bankList[i].getIntInput(),
					bankList[i].getIntOutput(),
					bankList[i].getIntValance()
					);
			
			
		}
		
	}
	public void bankInfo(BankVO[] bank ) {
		for(int i = 0; i < bank.length; i++) {
		System.out.printf("계좌번호 : \n", bank[i].getStrNum());
		System.out.printf("날짜 : \n" ,bank[i].getStrDate() );
		System.out.printf("입금 : \n" ,bank[i].getIntInput());
		System.out.printf("출금 : \n" ,bank[i].getIntOutput());
		System.out.printf("잔액 : \n" ,bank[i].getIntValance());
		
		}
	}
	

}
