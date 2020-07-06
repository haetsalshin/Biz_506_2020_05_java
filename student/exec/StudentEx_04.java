package com.biz.student.exec;

import com.biz.student.servicie.StudentService;
import com.biz.student.servicie.StudentServiceImplV5;

public class StudentEx_04 {
	public static void main(String[] args) {
		
		StudentService sService = new StudentServiceImplV5();
		sService.inputStudent();
		sService.studentList();
		
	}

}
