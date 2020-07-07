package com.biz.student.exec;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Random;
/*
 * 학번, 국어, 
 */
public class ScoreEx_03 {
	public static void main(String[] args) {
		
		PrintWriter outPut = null; //= System.out;
		
		// csv = > ,로 값을 구분해서 저장하는 파일.
		// 내가 만든 파일을 엑셀 데이트로 만들고 싶다 하면 이런식으로 데이터를 저장하면 된다!(나중에 그래프를 그린다던가~)
		String outFile = "src/com/biz/student/exec/score.txt";
		
		// 지금부터 outFile 변수에 저장된 파일이름으로
		// text를 기록하기 위해 파일을 만들어라.
		try {
			outPut = new PrintWriter(outFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Random rnd = new Random();
		
		for(int i = 0 ; i < 30 ; i ++) {
			
			int intKor = rnd.nextInt(50)+51;
			int intEng = rnd.nextInt(50)+51;
			int intMath = rnd.nextInt(50)+51;			
			int intSum = intKor + intEng + intMath;
			float floatAvg = (float) intSum/3;
			// System.out.printf()
			// 콘솔에 보여주는게 아니라 출력문을 변수의 문자열 형태로 저장하는 것.
			String score = String.format("%05d:%d:%d:%d:%d:%05.2f\n",
					i+1, intKor, intEng, intMath, intSum, floatAvg);
			//실수는 %f. 소수점 포함해서 전체 6글자 그리고 소수점 2개로 해주겠다. 그리고 만약 십의자리까지만 나오면 백의자리는 0으로 채우겠다.
			// 왜냐하면 나중에 value of로 String으로 바꿀시에 문제가 발생할 수도 있기 때문이다.
			
			outPut.println(score);
		}
		outPut.close();
		System.out.println("완료!!!!! :)");
	}

}
