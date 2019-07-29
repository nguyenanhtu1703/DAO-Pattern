package com.dao.test;

import java.util.List;

public class App {
	public static void main(String[] args) {
		StudentDao studentDao = new StudentDaoImp();
		
		for(Student student : studentDao.getAllStudent())
			System.out.println("Student: [RollNo: " + student.getRollNo() + 
					"], Name: " + student.getName());
		
		Student student = studentDao.getStudent(0);
		student.setName("Michael");
		studentDao.updateStudent(student);
		
		student = studentDao.getStudent(0);
		System.out.println("Student: [RollNo: " + student.getRollNo() + 
					"], Name: " + student.getName());
	}
}
