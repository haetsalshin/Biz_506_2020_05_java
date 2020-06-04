package com.biz.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListEx_03 {
	
	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<Integer>();
		Random rnd = new Random();
		
		for(int i = 0 ; i < 100 ; i++) {
			intList.add(rnd.nextInt(100)+1);
		}
		
		int intCount=0;
		for(int i = 0; i < 100 ; i++) {
			
			if( (intList.get(i) % 2) ==0 ) {
				System.out.printf("%d\t",intList.get(i));
				++intCount;
				if(intCount% 5 == 0){
					System.out.println();
					} 
			}
			
		}
		System.out.println("\n\n짝수개수:"+intCount);
	
	}

}
