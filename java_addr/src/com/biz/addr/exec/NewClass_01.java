package com.biz.addr.exec;
/*
 * 아무런 코드도 없는 클래스 하나 생성하면
 * 클래스 내부에는 기본 생성자라고 하는 특별한 method가 자동으로 선언된다.
 * 
 */
public class NewClass_01 {
	
	// 기본 생성자
	/*
	 * 클래스를 사용하여 객체(인스턴스)를 선언하고
	 * 초기화를 할 때 생성자(new newClass_01() )라는 method를 호출하게 되는데
	 * 자바에서 클래스를 만들게 되면 모든 클래스에는 자신의 이름과 같은 method가
	 * 자동으로 생성된다.
	 * 객체를 초기화 할 때 이 생성자를 호출하여 초기화를 수행하는 것이다.
	 * 
	 * 생성자를 임의로 작성하고자 할 때는 
	 * 		반드시 접근 제한자를 public으로 설정
	 * 		return type(void 등등)이 없다.
	 * 		클래스의 이름과 대소문자 일치하도록 작성한다.
	 * 
	 * 생성자를 임의로 (재)작성 하는 이유
	 * 		1. 클래스에 선언된 필드 변수들을 초기화 하기 위하여
	 * 		2. 클래스를 객체로 선언하고 초기화 할 때 자동으로 실행될 어떤 일들이 필요할 때
	 * 
	 * 클래스를 선언만 하고
	 * 		임의의 method를 선언하여 사용하면
	 * 		당연히 기본생성자가 자동으로 생성된다.
	 * 
	 * 하지만 필드변수를 외부로부터 주입받아 초기화하는 필드생성을 만들 경우
	 * 기본생성자는 만들어 지지 않는다.
	 * 
	 * 
	 */
	
	public NewClass_01() { 
		// void가 없고, 메서드의 이름은 클래스의 이름과 같아야 한다.
		
	}
	
	// 임의로 생성한 method
	public void test() {
		
	}
	

}