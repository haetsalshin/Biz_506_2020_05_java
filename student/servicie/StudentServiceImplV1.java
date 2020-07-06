package com.biz.student.servicie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.student.domain.StudentVO;

public class StudentServiceImplV1 implements StudentService {
	
	// 필드변수
	// class Scope의 변수를 선언하기
	// 여기(필드변수 영역)에 선언된 변수는 
	// 현재 클래스의 모든 method들이 공유하고, 참조(쓰기, 읽기)가 가능하다.
	
	// 변수의 scope
	// 변수를 선언 할 때 어디에 선언하느냐에 따라 변수를 참조할 수 있는냐 없느냐가 결정된다.
	
	// 필드변수를 선언할 때 접근제한자를 public, private, protected 중에 한가지로
	// 설정 할 수 있다.
	// 필드변수를 선언할 때 가급적 public으로 선언하는 것은 지양해야 한다.
	// 그 이유는 필드변수를 public으로 선언해 놓으면 외부에서 필드변수에 직접 접근하여
	// 값을 변형 시킬 수 있다. 그러하면 예기치 못한 결과를 얻을 수 있다.
	
	// 필드변수를 private으로 선언하는 것은 
	// 객체의 정보은닉, 캡슐화 패턴에 적합한 방식이다.
	// 외부에서 접근하지 못하도록 차단하고 현재 클래스에 선언된 method에서만
	// 접근을 허용하는 것이다.
	// 혹시 필드변수를 외부에서 접근할 필요가 있는 경우는 getter, setter를 만든다.
	
	// 필드변수를 protected로 선언하기
	// protected는 private접근 제한자와 거의 유사한 형태이다.
	// 만약 현재 클래스를 다른 클래스를 만들 때 상속(extends)하여 사용하려고 할 때
	// 상속받은 클래스에서 현재 클래스의 필드변수를 같이 상속받아서 사용하고자 할 때에는
	// 변수를 protected로 선언한다.
	
	// 현재 클래스에서는 private처럼 작동하고 
	// 상속받은 클래스에서도 마치 자신이 변수를 선언한 것처럼 사용할 수 있게 된다.
	
	// 현재 클래스를 상속 할 수 있도록 생각하고 구현을 한다면
	// 필드변수를 protected로 선언을 한다.
	
	// 만약 private로 선언을 하게 되면 상속받은 클래스에서 이 변수들을
	// 다시 선언해 주어야 한다.
	protected List<StudentVO> studentList;
	

	// 클래스 생성자
	// 클래스를 객체(인스턴스)로 만들 때 호출되는 method
	// 클래스를 객체로 생성할 때 1번 호출되는 method로 반드시 생성(초기화)가 필요한
	// 필드변수들을 여기에 생성하는 코드를 작성한다.
	public StudentServiceImplV1() {
		studentList = new ArrayList<StudentVO>();
		
		
	}
	

	@Override
	public boolean inputStudent() {
		Scanner scan = new Scanner(System.in);
		StudentVO studentVO = new StudentVO();
		
		System.out.print("학번을 입력하세요 (입력종료:END) >> ");
		String strNum = scan.nextLine();
		if(strNum.equals("END")) {
			return false;
		}
		studentVO.setNum(strNum);
		
		System.out.print("이름을 입력하세요 >> ");
		String strName = scan.nextLine();
		studentVO.setName(strName);
		
		System.out.print("학년을 입력하세요 >> ");
		String strGrade = scan.nextLine();
		int intGrade = 0;
		
		// 유효성 검사
		// 현재 입력된 정보가 정상범위(Validate)에 있는지 검사하여
		// 데이터를 사용하지 말지를 결정하고
		// 입력하는 사용자에게 통보하고 다른 행동을 취할 수 있도록 하는 것.
		// 유효성 검사는 개발자 입장에서는 매우 귀찮은 단순 노동일 경우가 많지만
		// 사용자입장에서는 유효성 검사가 많으면 그만큼 잘못된 데이터를 입력하는 경우를 
		// 방지 할 수 있다.
		// trade off
		try {
			intGrade = Integer.valueOf(strGrade);
		} catch (Exception e) {
			System.out.print(" Warning ! 학년은 숫자만 입력가능합니다 !");
			System.out.print(studentVO.getName() + " 학생의 정보를 다시 처음부터 입력해주세요 !");
			return true;
		}
		
		if(intGrade < 1 || intGrade > 4) {
			System.out.println("학생은 1 ~ 4까지만 가능");
			System.out.println(studentVO.getName()+"의 정보를 다시 입력해주세요.");
			return true;
		}
		// 모든 입력이 정상처리 되었으면
		// List에 학생정보를 추가한다.
		studentVO.setGrade(intGrade);
		
		
		System.out.print("학과를 입력하세요 >> ");
		String strDept = scan.nextLine();
		studentVO.setDept(strDept);;
		
		
		studentList.add(studentVO);
		
		// 제일 끝의 return문은 한 학생의 정보가 모두 정상입력이 되면 
		// true를 return하여 다음 학생의 정보를 입력하도록 
		// 호출한 곳에 통보(return)해야 하는데 이 때 true를 return 하도록 해야한다.
		return true;
	}

	@Override
	public void studentList() {
		
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒▒ 학생 정보");
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("학번\t이름\t학년\t학과");
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		
		for(StudentVO vo : studentList ) {
			System.out.print(vo.getNum()+"\t");
			System.out.print(vo.getName()+"\t");
			System.out.print(vo.getGrade()+"\t");
			System.out.print(vo.getDept()+"\n");
		}
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		
		
	}
	

}
