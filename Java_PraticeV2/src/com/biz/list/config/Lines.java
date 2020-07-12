package com.biz.list.config;

public class Lines {
	
	
	public static String d_Line = "";
	public static String s_line = "";
	
	static {
		
		for(int i = 0; i < 60 ; i ++) {
			
			d_Line += "=";
			s_line += '-';
		}
		
	}

}
