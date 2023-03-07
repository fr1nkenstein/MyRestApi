package com.example.service;

import java.util.List;

import com.example.model.Student;

public interface StudentService {
	List<Student> allStudent();

	Student saveStudent(Student student);

	String getStudent(long l);

	String deleteStudent(long l);

	String updateStudent(Student student);

	List<Student> findByName(String name);
}
