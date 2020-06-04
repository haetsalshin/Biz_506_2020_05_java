package com.haetsal;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListEx_01 {

	public static void main(String[] args) {
	
		List<Integer> num = new ArrayList<Integer>();
		
		Random rnd = new Random();
		
		for(int i =0 ; i < 100; i++) {
			num.add(rnd.nextInt(100)+1);
			
		}
	
		for(int i = 0 ; i < 100 ; i++) {
			
			System.out.printf("%d\t", num.get(i));
		if((i+1)%10 ==0) {
			System.out.println();
			}
		}
		
		
		
	}
	
	
	
}
