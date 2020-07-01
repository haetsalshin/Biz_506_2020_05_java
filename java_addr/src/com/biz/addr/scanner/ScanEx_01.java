package com.biz.addr.scanner;

import java.io.InputStream;
import java.util.Scanner;

/*
 *  화면에 메뉴를 보여주고 
 *  키보드로 선택을 하면 해당하는 코드를 실행
 */
public class ScanEx_01 {
	
	public static void main(String[] args) {
		
		// Console에 어떤 값을 출력
		System.out.println();

		
		// 키보드로 부터 전송되어 온 이진수를 컴퓨터에서 알아 볼 수 있는 데이터 코드로 변환
		
		// 키보드로 문자(열)을 입력하는 동안 그 데이터의 코드를 임시의 저장장치(Buffer)에 저장을 하고 있다가
		// Enter를 누르는 순간 Scanner에게 입력이 완료되었음을 알려주는 역할을 한다.
		InputStream in = System.in;
		
		// InputStream 을 Scanner() 에 연결하면
		// InputStream으로부터 전송되어 온 데이터 코드를 실제의 문자열로 변환시키는 역할
		
		// InputStream이 입력이 완료되었다는 신호를 보내면
		// Scanner는 Buffer에 저장된 데이터 코드를 읽어서(scan)
		// 실제의 문자열로 변환시키는 역할을 수행한다
		
		// Console에서 값을 입력
		Scanner scan = new Scanner(in);
		// stream 통로 : 컴퓨터를 기준으로 데이터가 입력되거나(키보드나 마우스로 입력) 출력되는 통로.
		// Scanner : 키보드로부터 넘어온 데이터가 자바에 입력되는 순간 우리가 알아볼 수 있는 데이터로 바꿔주는 것.
		

		// nextline()가 호출되면
		// 코드는 여기에서 잠시 멈추고 있으면서 키보드에서 문자열로 입력되고 enter가 눌리면
		// scanner를 통해서 문자열을 가져오는 역할을 수행한다.
		
		// 입력을 기다리면서 코드가 잠시 wait상태가 되는 현상을
		// blocking 되었다 라고 한다.
		scan.nextLine();
		
		
	}

}
