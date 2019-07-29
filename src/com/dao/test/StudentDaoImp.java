package com.dao.test;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImp implements StudentDao {

	List<Student> students;

	public StudentDaoImp() {
		students = new ArrayList<Student>();
		
		Student student1 = new Student("Robert", 0);
		Student student2 = new Student("John", 1);
		
		students.add(student1);
		students.add(student2);
	}
	
	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return students;
	}

	@Override
	public Student getStudent(int rollNo) {
		// TODO Auto-generated method stub
		return students.get(rollNo);
	}

	@Override
	public void updateStudent(Student student) {
		students.get(student.getRollNo()).setName(student.getName());
		System.out.println("Student: Roll No " + student.getRollNo() + " updated in the database");
	}

	@Override
	public void deleteStudent(Student student) {
		// TODO Auto-generated method stub
		
	}
	
}
