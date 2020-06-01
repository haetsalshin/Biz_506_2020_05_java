package com.biz.classes;

import com.biz.classes.model.BankVO;

public class ClassEx_11 {

	public static void main(String[] args) {
		
		BankVO bankList[] = new BankVO[5];
		
		
		
		bankList[0] = new BankVO();
		bankList[1] = new BankVO();
		bankList[2] = new BankVO();
		bankList[3] = new BankVO();
		bankList[4] = new BankVO();
		
		bankList[0].setStrNum("001");
		bankList[1].setStrNum("002");
		bankList[2].setStrNum("003");
		bankList[3].setStrNum("004");
		bankList[4].setStrNum("005");
	
		bankList[0].setStrDate("2020-06-01");
		bankList[1].setStrDate("2020-06-01");
		bankList[2].setStrDate("2020-06-01");
		bankList[3].setStrDate("2020-06-01");
		bankList[4].setStrDate("2020-06-01");
		
		bankList[0].setIntInput(5000);
		bankList[2].setIntInput(5000);
		
		bankList[1].setIntOutput(1000);
		bankList[3].setIntOutput(1000);
		bankList[4].setIntOutput(1000);
		
		
	
		
		System.out.println("계좌번호\t 날짜\t 입금\t 출금\t 잔액\n");
		
			
		
		
	}
	

}
