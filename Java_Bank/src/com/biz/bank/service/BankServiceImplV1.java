package com.biz.bank.service;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.bank.domain.AccountVO;

public class BankServiceImplV1 implements BankService {

	protected List<AccountVO> accoutList;
	protected Scanner scan;
	protected int initmoney;
	protected int inputAccount;
	protected int outputAccount;
	protected int allAcount;

	public BankServiceImplV1() {

	}

	@Override
	public boolean inputBalance() {
		accoutList = new ArrayList<AccountVO>();
		scan = new Scanner(System.in);
		AccountVO aVO = new AccountVO();
		initmoney = 100000;
		System.out.printf("입금하고 싶은 금액을 입력하세요 >> ");
		String strInput = scan.nextLine();
		
		int intInput = 0;
		try {
			intInput = Integer.valueOf(strInput);
			initmoney += intInput;
			
		} catch (Exception e) {
			System.out.println("금액은 숫자만 입력할 수 있습니다. 다시 입력해주세요.");
			return true;
		}
		
		if (intInput < 0) {
			System.out.println("금액은 0원이상만 입금할 수 있습니다. 다시 입력해주세요");
			return true;
		}
		inputAccount = initmoney;
		allAcount = inputAccount;

		
		aVO.setInput(intInput);
		
		System.out.printf("오늘 날짜를 입력하세요 >> ");
		String date = scan.nextLine();
		aVO.setDate(date);
		
		System.out.printf("계좌 번호를 입력하세요 >> ");
		String account = scan.nextLine();
		aVO.setNum(account);
		
		accoutList.add(aVO);
		
		return true;
	}

	@Override
	public boolean outputBalance() {
		accoutList = new ArrayList<AccountVO>();
		scan = new Scanner(System.in);
		
		AccountVO aVO = new AccountVO();
		System.out.printf("출금하고 싶은 금액을 입력하세요>> ");
		String strOutput = scan.nextLine();
		int intOutput = 0;

		try {
			intOutput = Integer.valueOf(strOutput);
	
		} catch (Exception e) {
			System.out.println("금액은 숫자만 입력할 수 있습니다. 다시 입력해주세요.");
			return true;
		}
		inputAccount -=intOutput;
		
		if (inputAccount < intOutput) {
			System.out.println("잔액 이상의 금액은 출금할 수 없습니다.");
			return true;
		}
		if (intOutput < 0) {
			System.out.println("금액은 0원이상만 입금할 수 있습니다. 다시 입력해주세요");
			return true;
		}
		outputAccount = inputAccount;
		allAcount = outputAccount;
		aVO.setOutput(intOutput);
		
		System.out.printf("오늘 날짜를 입력하세요 >> ");
		String date = scan.nextLine();
		aVO.setDate(date);
		
		System.out.printf("계좌 번호를 입력하세요 >> ");
		String account = scan.nextLine();
		aVO.setNum(account);

		return true;
	}

	@Override
	public void listBalance() {
		
		

		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒▒ 계좌 잔액 내역");
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("날짜\t계좌번호\t입금액\t출금액\t잔액");
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		for(AccountVO aVO : accoutList) {
			System.out.print(aVO.getDate() + "\t");
			System.out.print(aVO.getNum() + "\t");
			System.out.print(aVO.getInput() + "\t");
			System.out.print(aVO.getOutput() + "\t");
			System.out.println(allAcount);
		}
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		
	}

}
