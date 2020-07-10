package com.biz.address.exec;

import com.biz.address.model.AddressVO;

public class AddrEx_01 {
	
	
	public static void main(String[] args) {
		
		AddressVO address1 = new AddressVO();
		AddressVO address2 = new AddressVO();
		AddressVO address3 = new AddressVO();
		
		address1.setName("홍길동");
		address1.setAddr("광주광역시");
		address1.setAge(20);
		
		address2.setName("성춘향");
		address2.setAddr("서울특별시");
		address2.setAge(30);
		
		address3.setName("신햇살");
		address3.setAddr("서울특별시");
		address3.setAge(29);
		
		
		
		System.out.println("======================================");
		System.out.println("address1");
		System.out.println("이름:"+address1.getName());
		System.out.println("주소:"+address1.getAddr());
		System.out.println("나이:"+address1.getAge());
		System.out.println("======================================");
		System.out.println("address2");
		System.out.println("이름:"+address2.getName());
		System.out.println("주소:"+address2.getAddr());
		System.out.println("나이:"+address2.getAge());
		System.out.println("======================================");
		System.out.println("address3");
		System.out.println("이름:"+address3.getName());
		System.out.println("주소:"+address3.getAddr());
		System.out.println("나이:"+address3.getAge());
		System.out.println("======================================");
		
		
		
		
	}

}
