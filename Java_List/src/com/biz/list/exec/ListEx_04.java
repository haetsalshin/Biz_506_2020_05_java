package com.biz.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListEx_04 {
	
	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<Integer>();
		Random rnd = new Random();
		
		for( int i = 0 ; i < 100 ; i ++) {
			intList.add(rnd.nextInt(100)+1);
		}
		/*
		 * intlist.get() method의 구조
		 * public int get(int i){
		 *     return x;
		 * }
		 * 
		 */
		int num = 0;
		for(int i = 0 ; i < 100 ; i ++) {
			num = intList.get(i);
			if(num == 55) {
				System.out.println(num);
			}
			/*
			 * intList.get(i) method를 호출하여
			 * 값을 가져오는데 몇번 반복해서 실행해도
			 * 항상 같은 값이 return 될 것이다.
			 * 그럼에도 불구하고 아래 코드는 같은 일을 
			 * 두번 실행하여 결과를 얻고 있다.
			 * 짧은 코드이지만 상당히 비효율적인 코드가 될 수 있다.
			 * 이러한 하나하나가 성능을 좌우한다.
			 * 
			 * intList.get(i) 를 변수에 일단 한번 저장하고
			 * 나머지 코드에서 사용을 하자.
			 */
			if(intList.get(i)==5) {
				System.out.println(intList.get(i)); // 불필요하게 위의 intlist.get() method를 통해서 두번 행해지게 된다.
													// 어차피 똑같은 값이니까 변수에 값을 저장해서 나머지는 그 값을 저장해서 사용하도록
			}
		}
		
	}

}
