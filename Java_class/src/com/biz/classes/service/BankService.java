package com.biz.classes.service;

import com.biz.classes.model.BankVO;

public class BankService {
	
	public void bankList(BankVO[] bankList) {
		
		LineService lineService = new LineService();
		String d_line = lineService.do_line(50);
		String s_line = lineService.single(50);
		
		System.out.println(d_line);
		System.out.println("은행출금내역");
		System.out.println(s_line);
		System.out.println("계좌번호\t 날짜\t 입금\t 출금\t 잔액");
		
		
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
