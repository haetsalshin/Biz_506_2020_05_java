package com.biz.classes;

import com.biz.classes.model.BankVO;
import com.biz.classes.service.BankService;

public class ClassEx_12 {
	
		public static void main(String[] args) {
		
			BankVO bankList[] = new BankVO[5];
		
			for(int i = 0 ; i < bankList.length ; i++) {
				bankList[i].setStrNum("001");
			}
		
			bankList[0].setStrDate("2020-05-01");
			bankList[1].setStrDate("2020-05-02");
			bankList[2].setStrDate("2020-05-03");
			bankList[3].setStrDate("2020-05-04");
			bankList[4].setStrDate("2020-05-05");
	
			bankList[0].setIntInput(5000);
			bankList[2].setIntInput(5000);
		
			bankList[1].setIntOutput(1000);
			bankList[3].setIntOutput(1000);
			bankList[4].setIntOutput(1000);
		
			bankList[0].setIntValance(5000);
			bankList[1].setIntValance(4000);
			bankList[2].setIntValance(9000);
			bankList[3].setIntValance(8000);
			bankList[4].setIntValance(7000);
		}
		
		BankService bankService = new BankService();
		

	
}
