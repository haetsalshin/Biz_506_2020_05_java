package com.biz.student.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.address.config.Lines;
import com.biz.student.domain.StudentVO;

public class StudentServiceImplV1 implements StudentService {

	protected List<StudentVO> studentList;
	
	
	 public StudentServiceImplV1() {
		 
		 studentList = new ArrayList<StudentVO>();
	}
	
	
	@Override
	public boolean inputStudnet() {
		
		Scanner scan = new Scanner(System.in);
		StudentVO studentVO = new StudentVO();
		
		System.out.print("학번  (END:종료) >> ");
		String strNum = scan.nextLine();
		int intNum = 0;
		if(strNum.equals("END")) {
			return false;
		}
		try {
			intNum = Integer.valueOf(strNum);
		} catch (Exception e) {
			System.out.println("학번은 숫자만 입력 가능 합니다.");
			return true;
		}
		
		strNum = String.format("%05d", intNum);
		
		studentVO.setNum(strNum);
		
		
		System.out.print("이름 >> ");
		String strName = scan.nextLine();
		
		studentVO.setName(strName);
		
		System.out.print("전공 >> ");
		String strDept = scan.nextLine();
		
		studentVO.setDep(strDept);
		
		System.out.print("학년 >> ");
		String strGrade = scan.nextLine();
		int intGrade = 0;
		try {
			intGrade = Integer.valueOf(strGrade);
		} catch (Exception e) {
			System.out.println("학년은 숫자만 입력할 수 있습니다.");
			return true;
		}
		if(intGrade<1 || intGrade >4) {
			System.out.println("학년은1~4까지 입력할 수 있습니다.");
			return true;
		}
		
		studentVO.setGrade(intGrade);
		
		
		System.out.print("전화번호 (010-111-1111) >> ");
		String strTel = scan.nextLine();
		
		studentVO.setTel(strTel);
		
		studentList.add(studentVO);
		
		return true;
	}

	@Override
	public void studentList() {
		
		System.out.println(Lines.d_line);
		System.out.println("학생명부");
		System.out.println(Lines.s_line);
		System.out.println("학번\t이름\t전공\t\t학년\t전화번호");
		System.out.println(Lines.s_line);
		for(StudentVO sVO : studentList) {
			
			System.out.print(sVO.getNum()+"\t");
			System.out.print(sVO.getName()+"\t");
			System.out.print(sVO.getDep()+"\t");
			System.out.print(sVO.getGrade()+"\t");
			System.out.print(sVO.getTel()+"\n");
			
			
		}
		System.out.println(Lines.d_line);
		
		
	}

}
