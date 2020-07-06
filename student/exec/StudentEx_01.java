package com.biz.student.exec;

import com.biz.student.servicie.StudentService;
import com.biz.student.servicie.StudentServiceImplV1;

public class StudentEx_01 {
	
	public static void main(String[] args) {
		
		StudentService sstudentService = new StudentServiceImplV1();
		
		while(true) {
			if(!sstudentService.inputStudent()) {
				break;
			}
		}
		
		sstudentService.studentList();
		
		
	}

}
