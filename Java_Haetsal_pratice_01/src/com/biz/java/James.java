package com.biz.java;

public class James {
	
	public static void main(String[] args) {
		
		JamesVO james = new JamesVO();
		
		james.isMarreid = true;
		james.intSun = 3;
		
		System.out.println("제임스는 결혼을 했는가? "+james.isMarreid);
		System.out.println("제임스의 자식은 몇명인가? "+james.intSun);
		
		
	}
	

}
