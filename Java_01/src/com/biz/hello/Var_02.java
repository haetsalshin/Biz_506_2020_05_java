package com.biz.hello;

public class Var_02 {

	/*
	 * main() : 키워드() 형식의 명령어는  Method라고 한다.
	 * main() Method라고 호칭한다.
	 * 
	 * public static void main()
	 * 클래스의 시작점, 진입점 Method라고 한다.
	 */
	public static void main(String[] args) {
		//main() Method Scope라고 한다.
		//main() Method 내에서 선언된 변수는
		//main() Method가 끝나면 모두 삭제된다.
		//다시말해 main() Method 밖에서는 변수를 읽을 수 없다.
		int num1 = 30;
		int num2 = 40;
		
		
		//변수 선언규칙 1
		//같은 scope내에서는 한번 선언된 변수 이름으로
		//또 다시 변수를 선언 해서는 절대 안된다.
		int num11 = 50;
		
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num11);
		/*
		 * 변수 선언 규칙
		 * 1. 변수명 : 첫글자는 영문소문자(또는 _) //첫글자가 영문대문자는 class이름
		 *    두번째 : 영문대소문자, 숫자, _ 사용할 수 있다.
		 *    변수명은 의미를 담게 명명하자.
		 *    두 단어 이상 연결하여 변수명을 작성할 때는 단어_단어 또는 wordWord 패턴으로 작성하자.
		 *  = 단어_단어 : snack case
		 *    wordWord : camel case라고 한다.		
		 * 
		 * 2. 변수 선언 불가 항목
		 *  가. keyword는 변수로 선언 할 수 없다.
		 *  나. 빈칸, 특수문자(_ 제외)는 변수명에 포함될 수 없다.
		 *    
		 */
		
		
	}
}
