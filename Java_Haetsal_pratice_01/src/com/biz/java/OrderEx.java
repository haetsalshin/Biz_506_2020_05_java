package com.biz.java;

public class OrderEx {
	
	public static void main(String[] args) {
		
		Order orderlist = new Order();
		
		orderlist.strNum = "201803120001";
		orderlist.strId = "abc 123";
		orderlist.strDate = "2018년 3월 12일";
		orderlist.intStockNum = 304512;
		orderlist.strName = "홍길동";
		orderlist.add = "서울시 영등포구 여의도동 20번지";
		
		
		System.out.println("주문번호: "+ orderlist.strNum);
		System.out.println("주문자 아이디: "+ orderlist.strId);
		System.out.println("주문 날짜: "+ orderlist.strDate);
		System.out.println("주문자 이름: "+ orderlist.strName);
		System.out.println("주문 상품 번호: "+ orderlist.intStockNum);
		System.out.println("배송주소: "+ orderlist.add);
		
		
		
		
		
		
	}

}
