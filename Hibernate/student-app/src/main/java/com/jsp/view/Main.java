package com.jsp.view;

import com.jsp.student.dao.StudentDao;
import com.jspentity.Student;

public class Main {

	
	public static void main(String[] args) {
		StudentDao dao=new StudentDao();
		
		Student student = new Student(2, "anvit", "an@gmail.com", 1234567899l, "123", "gurugram");
//		Student student1 = new Student(4, "vinay", "vn@gmail.com", 1234557899l, "124", "gurugram");
		
//		dao.save(student);
//		dao.save(student1);
		dao.findAll();
	}
}
