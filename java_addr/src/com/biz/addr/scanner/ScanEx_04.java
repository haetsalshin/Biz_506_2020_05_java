package com.biz.addr.scanner;

import java.util.Scanner;

public class ScanEx_04 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자열 입력 >> ");
		// println 은 바로 밑에 줄에 입력을 하게 되기 때문에 print를 사용해준다.
		String strInput = scan.nextLine();
		System.out.println("입력된 문자열 : "+ strInput);
		
		System.out.print("숫자1 >> ");
		int num1 = scan.nextInt();
		
		System.out.print("숫자2 >> ");
		int num2 = scan.nextInt();
		
		System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
		
		
		
		scan.close();
		
	}
	
	
}
