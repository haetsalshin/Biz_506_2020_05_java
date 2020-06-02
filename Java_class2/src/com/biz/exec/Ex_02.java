package com.biz.exec;

import com.biz.model.AddressVO;
import com.biz.service.AddrServiceV1;

public class Ex_02 {
	
	public static void main(String[] args) {
		
		AddressVO address[]  = new AddressVO[5];
	
		for(int i = 0 ; i <address.length ; i++) {
		address[i] = new AddressVO();
		}

		address[0].setName("성춘향");
		address[1].setName("이몽룡");
		address[2].setName("홍길동");
		address[3].setName("임꺽정");
		address[4].setName("춘향이");
		
		address[0].setAddr("광주광역시");
		address[1].setAddr("서울특별시");
		address[2].setAddr("뉴욕");
		address[3].setAddr("프랑크푸르트");
		address[4].setAddr("파리");
		
		address[0].setTel("010-000");
		address[1].setTel("010-010");
		address[2].setTel("010-020");
		address[3].setTel("010-030");
		address[4].setTel("010-040");
		
		address[0].setAge(30);
		address[1].setAge(20);
		address[2].setAge(25);
		address[3].setAge(40);
		address[4].setAge(60);

		AddrServiceV1 addrService = new AddrServiceV1();
		// 배열을 매개변수를 통해 method에게 전달할 때는 이름만 붙여주면 된다.
		addrService.addrList(address);
		
		
	}
}
