package com.biz.service;

import com.biz.model.AddressVO;
import com.biz.model.ScoreVO;

public class AddrServiceV1 {
	
	public void addrList(AddressVO[] address) { // Ex_02 보면 AddressVO[]배열 클래스의 address 인스턴스를 생성하여
		                                        // 썼기 때문에 형식을 똑같이 만들어 줘야 한다.
		
		LineService lineService = new LineService();
		String d_line = lineService.do_line(70);
		String s_line = lineService.single(70);
		
		System.out.println(d_line);
		System.out.println("\t \t \t주소록");
		System.out.println(s_line);
		System.out.println("이름\t\t 전화\t\t 나이\t\t 주소");
		System.out.println(s_line);
		
		for(int i= 0 ; i< address.length; i++  ) {
			System.out.printf("%s \t\t%s \t %d \t\t%s\n",address[i].getName(),address[i].getTel(),
					address[i].getAge(),address[i].getAddr());

		}
		System.out.println(d_line);
	}
	
}
