package com.biz.model;
/*
 *  명명규칙
 *  
 *  1. 클래스 : 첫글자 영어 대문자, 파일 이름과 같게
 *  2. 변수 : 첫글자 소문자
 *  3. method : 첫글자 소문자
 *  
 *  2번째 부터는 숫자 가능, _ 가능.
 *  빈칸 넣으면 안된다.
 *  2개의 단어 이상으로 조합해서 만드는 것을 권장
 *  2개 이상 단어를 조합할 때 두번째 단어부터는 첫글자를 대문자로
 *  
 *  ex) StudentClass (클래스) , studentName(변수), studentList(method).
 *  
 */

// 데이터를 담아서 method들 간에 이동 할 때 사용하는 클래스 
public class AddressVO {
	
	private String name;
	private String tel;
	private String addr;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
	
	
}
