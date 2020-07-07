package com.biz.student.domain;
/*
 *  데이터를 추상화 한 클래스
 *  model = VO = DTO = domain + commend ...
 *  
 *  VO클래스는 실제로 프로젝트에서 주로 다루게 될 Data를 추상화 한 클래스
 *  주요 항목 : 필드변수에 매우 중요한 클래스
 *  method 역할 보다는 필드변수 역할이 주로 사용되는 클래스
 */
public class StudentVO {
	
	
	private String num = ""; // "00001". 만약 숫자로 만들시 : 000을 부착 할 수 없다.
	private String name = "";
	private int grade = 0;
	private String dept = "";
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	
	
	
	

}
