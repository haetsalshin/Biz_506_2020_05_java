package com.biz.address.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.address.config.Lines;
import com.biz.address.domain.AddrVO;

public class AddressServiceImplV1 implements AddressService {

	protected List<AddrVO> addrList;
	
	public AddressServiceImplV1() {
		addrList = new ArrayList<AddrVO>();
		
	}
	
	
	
	@Override
	public boolean inputAddr() {
		
		AddrVO addrVO = new AddrVO();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 (END:종료) >> ");
		String strName = scan.nextLine();
		if(strName.equals("END")) {
			return false;
		}
		
		addrVO.setName(strName);
		
		System.out.print("전화번호 (010-1111-1111) >> ");
		String strTel = scan.nextLine();
		
		addrVO.setTel(strTel);
		
		
		System.out.print("주소  >> ");
		String strAddr = scan.nextLine();
		
		addrVO.setAddr(strAddr);
		
		System.out.printf("나이 >> ");
		String strAge = scan.nextLine();
		int intAge = 0;
		try {
			intAge = Integer.valueOf(strAge);
		} catch (Exception e) {
			System.out.println("나이는 숫자만 입력 가능합니다. 다시 입력해주세요.");
			return true;
		}
		
		addrVO.setAge(intAge);
		
		System.out.printf("관계 >> ");
		String strNet = scan.nextLine();
		
		addrVO.setNet(strNet);
		
		
		addrList.add(addrVO);
		
		
		return true;
	}

	@Override
	public void addrList() {
		
		//String[] title = {"이름","전화번호","주소","나이","관계"};
		
		System.out.println(Lines.d_line);
		System.out.println("주소록");
		System.out.println(Lines.d_line);
		System.out.println("이름\t전화번호\t\t주소\t나이\t관계");
		System.out.println(Lines.s_line);
		int size = addrList.size();
		for(int i = 0; i < size ; i++) {
			AddrVO aVO = addrList.get(i);
			
			System.out.printf(aVO.getName()+"\t");
			System.out.printf(aVO.getTel()+"\t\t");
			System.out.printf(aVO.getAddr()+"\t");
			System.out.printf(aVO.getAge()+"\t");
			System.out.printf(aVO.getNet()+"\n");
		
		}
		
		System.out.println(Lines.d_line);
		
	}

}
