package com.biz.address.exec;

import com.biz.address.model.AddressVO;
import com.biz.address.service.AddrService1;

public class AddrEx_03 {
	
	public static void main(String[] args) {
		
		AddrService1 adService = new AddrService1();
		AddressVO addressVO =  new AddressVO();
		adService.addrList(addressVO);
		
		
		
	}

}
