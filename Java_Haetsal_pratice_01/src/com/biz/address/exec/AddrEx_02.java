package com.biz.address.exec;

import java.util.ArrayList;
import java.util.List;

import com.biz.address.model.AddressVO;

public class AddrEx_02 {
	
	public static void main(String[] args) {
		
		
		List<AddressVO> addrList;
		addrList = new ArrayList<AddressVO>();
		
		
		
	
		addrList[0].setName("성종");
		addrList[0].setAddr("부산광역시");
		addrList[0].setAge(30);
		
		addrList[1].setName("성춘향");
		addrList[1].setAddr("광주광역시");
		addrList[1].setAge(20);
		
		addrList[2].setName("홍길동");
		addrList[2].setAddr("서울특별시");
		addrList[2].setAge(15);
		
		addrList[2].setName("변사또");
		addrList[2].setAddr("남원시");
		addrList[2].setAge(22);
		
		addrList[3].setName("세종대왕");
		addrList[3].setAddr("전주시");
		addrList[3].setAge(60);
		
		addrList[4].setName("논개");
		addrList[4].setAddr("인제군");
		addrList[4].setAge(45);
		

		
		int size = addrList.length;
		
		System.out.println("==================================================");
		System.out.println("주소록");
		System.out.println("==================================================");
		System.out.println("이름\t주소\t나이");
		System.out.println("--------------------------------------------------");
		for(int i = 0; i <size; i++) {
			System.out.print(addrList[i].getName()+"\t");
			System.out.print(addrList[i].getAddr()+"\t");
			System.out.print(addrList[i].getAge()+"\n");
			
		}
		System.out.println("==================================================");
	}

}

