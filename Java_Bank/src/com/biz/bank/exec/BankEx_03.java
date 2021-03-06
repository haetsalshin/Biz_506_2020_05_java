package com.biz.bank.exec;

import java.util.Scanner;

import com.biz.bank.service.BankService;
import com.biz.bank.service.BankServiceImplV3;

public class BankEx_03 {
	
	public static void main(String[] args) {
		
		BankService bService = new BankServiceImplV3();
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("===============================================================");
			System.out.println("빛고을 뱅크 계정계 시스템 V3");
			System.out.println("===============================================================");
			System.out.println("1. 입금처리");
			System.out.println("2. 출금처리");
			System.out.println("3. 입출금 내역 출력");
			System.out.println("-1. 업무종료");
			System.out.println("===============================================================");
			System.out.print("업무 선택 >> ");
			
			String strMenu = scan.nextLine();
			int intMenu = 0;
			try {
				intMenu = Integer.valueOf(strMenu);
			} catch (Exception e) {
				System.out.println("메뉴선택은 숫자로만 입력하세요");
				continue;
			}
			
			
			if(intMenu == -1) {
				break;
			}else if(intMenu == 1) {
				//입금 업무 처리
				bService.inputBalance();			
			}else if(intMenu == 2) {
				// 출금업무처리
				bService.outputBalance();
			}else if(intMenu == 3) {
				// 입출금 내역 출력
				bService.listBalance();
			}else {
				System.out.println("선택된 업무가 없습니다");
			}
			
		}
		
		
	}

		

}
