package com.biz.student.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

import com.biz.student.config.SplitPos;
import com.biz.student.domain.ScoreVO;
import com.biz.student.domain.StudentVO;

public class ScoreServiceImplV1 implements ScoreService{

	protected PrintStream outPut;
	protected List<StudentVO> studentList;
	protected List<ScoreVO> scoreList;
	
	@Override
	public boolean inputStudent()  {
		
		studentList = new ArrayList<StudentVO>();

		outPut = System.out;
		String studentFile = "src/com/biz/student/exec/student.txt";
		
		// FileReader 클래스로 fileReader 객체(인스턴스)를 선언하고 clear하기
		// 문자열, 숫자 등이 아닌 정체를 알 수 없는 클래스로 객체를 선언할 때는 
		// 가급적 null로 clear를 시켜주는 것이 좋다.
		FileReader fileReader = null;
		
		// 로컬디스크에 저장된 파일을 읽을 때 FileReader만으로 읽을 수 있지만,
		// 파일을 읽어들이는 성능상의 이점을 주기 위해서 중간에 BufferedReader를
		// 연결하여 파일을 읽어 들이는 것이 좋다.
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(studentFile);
			buffer= new BufferedReader(fileReader);
			
		String reader = "";
			
			while(true) {
			reader = buffer.readLine();
				if(reader == null) {
					break;
				}
				//System.out.println(reader);
				
				// 읽어들인 라인을 분해하여 학생정보로 변환
				String[] students = reader.split(":");
				
				StudentVO sVO = new StudentVO();
				
				sVO.setNum(students[SplitPos.STUDENT.ST_NUM]);
				sVO.setName(students[SplitPos.STUDENT.ST_NAME]);
				sVO.setGrade(Integer.valueOf(students[SplitPos.STUDENT.ST_GRADE]));
				sVO.setDept(students[SplitPos.STUDENT.ST_DEPT]);
				
				studentList.add(sVO);
				
			}
			// 파일을 읽기, 쓰기로 열었으면 모두 닫아서 종료해주어야 한다.
			buffer.close();
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
		
	

	@Override
	public void inputScore() {
		scoreList = new ArrayList<ScoreVO>();
		
		String scoreFile = "src/com/biz/student/exec/score.txt";
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			// 파일을 읽기 위해 open
			fileReader = new FileReader(scoreFile);
			
			// open된 파일에 대한 정보가 담긴 fileReader객체를 buffer에 연결하여 파일 읽도록 지시
			buffer = new BufferedReader(fileReader);
			
			String reader = "";
			// 한줄씩 담을 string
			// 반복문 밖에서 선언하고 초기화 한후 사용한다.
			while (true) {
			reader = buffer.readLine(); // buffer로부터 파일에서 꺼내 한줄씩 읽기
			// add catch해서 추가 시켜줌
				if (reader == null) {
				break; // null 도달하면 멈춰라
				}
		
			String[] scores = reader.split(":");
			ScoreVO sVO = new ScoreVO();
			sVO.setNum(scores[ SplitPos.SCORE.SC_NUM]); // scores에는 String이 담긴 상태!!
			sVO.setIntKor(Integer.valueOf(scores[ SplitPos.SCORE.SC_KOR])); // 각각의 점수를 담은 배열을 valueof에게 주입
			sVO.setIntEng(Integer.valueOf(scores[ SplitPos.SCORE.SC_ENG]));
			sVO.setIntMath(Integer.valueOf(scores[ SplitPos.SCORE.SC_MATH]));
		
		
			// 위해서 선언, 초기화 시켜야 sVO 담긴다
			scoreList.add(sVO);
			
			}
			buffer.close();
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(scoreFile + "파일을 읽기 위해 open 하는 중 오류 발생");
			return; // 더 이상 진행하지 못하게 막아버림
			
			} catch (NumberFormatException e) {
			// 예외처리 내가 만들어!!
			System.out.println("점수를 숫자로 바꾸는 과정에서 오류 발생");
			
			// 아래 IO예외는 readline에서 문제생긴것
			} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("버퍼로부터 데이터 읽는데 문제가 발생!");
			} 
			
			// 위에랑 같은 코드!! 학번이 00010인 사람의 것 보여라
			for (ScoreVO sVO : scoreList) {
				if (sVO.getNum().equals("00010")) {
					
				break;
				}
			}
	}

	@Override
	public void calcSum() {
		
		for(ScoreVO sVO : scoreList) {
			int sum = sVO.getIntKor();
			sum += sVO.getIntEng();
			sum += sVO.getIntMath();
			
			sVO.setIntSum(sum);
		}
		
	}

	@Override
	public void calcAvg() {	
		
		for(ScoreVO sVO : scoreList) {
			float avg = (float)sVO.getIntSum()/3;
			sVO.setIntAvg(avg);
			
		}
	}

	@Override
	public void scoreList() {
		outPut.println("==========================================================");
		outPut.println("학생 일람표");
		outPut.println("==========================================================");
		outPut.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		outPut.println("----------------------------------------------------------");
	
		// data의 join
		// scoreList, studentList join해서 데이터를 출력하는 코드
		for(ScoreVO scoreVO : scoreList) {
			// 이름
			// score의 학번으로 studentLlist에서 찾기
			for(StudentVO studentVO : studentList) {
				
				if(studentVO.getNum().equals(scoreVO.getNum())) {

					outPut.print(scoreVO.getNum()+"\t");
					System.out.print(studentVO.getName()+ "\t") ;
					outPut.print(scoreVO.getIntKor()+"\t");
					outPut.print(scoreVO.getIntEng()+"\t");
					outPut.print(scoreVO.getIntMath()+"\t");
					outPut.print(scoreVO.getIntSum()+"\t");
					
					outPut.printf("%5.2f\n", scoreVO.getIntAvg());;

				}


			}

			
		}outPut.println("==========================================================");
		
		
		
	}
	

}
