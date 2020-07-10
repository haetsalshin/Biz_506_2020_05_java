package com.biz.address.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.address.model.AddressVO;

public class AddrService1 {
	
	List<AddressVO> addressList;
	
	public AddrService1() {
		addressList = new ArrayList<AddressVO>();
	}
	
	public void addrList(AddressVO addressVO) {
		
		System.out.println("===================================================");
		System.out.println("이름\t\t주소\t\t나이");
		System.out.println("---------------------------------------------------");
		for(int i = 0; i < addressList.size() ; i ++) {
			System.out.print(addressList.get(i).getName());
			System.out.print(addressList.get(i).getAddr());
			System.out.print(addressList.get(i).getAge());
		}
			
		System.out.println("===================================================");
		
	}

}
