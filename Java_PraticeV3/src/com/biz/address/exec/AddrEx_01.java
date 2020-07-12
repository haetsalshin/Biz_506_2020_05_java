package com.biz.address.exec;

import com.biz.address.service.AddressService;
import com.biz.address.service.AddressServiceImplV1;

public class AddrEx_01 {
	
	public static void main(String[] args) {
		
		AddressService aService = new AddressServiceImplV1();
		
		while(true) {
			if(!aService.inputAddr()){
				break;
			}
		}
		
		aService.addrList();
		
		
		
	}

}
