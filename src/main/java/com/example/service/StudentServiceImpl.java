package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Student;
import com.example.model.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> allStudent() {

		List<Student> s = new ArrayList<Student>();
		Student a = new Student();
		a.setEmail("okkk");
		a.setLocation("could be anything");
		a.setStudentName("this is me ");
		s.add(a);
		s.add(a);
		s.addAll(studentRepository.findAll());

		return s;

	}

	@Override
	public Student saveStudent(Student student) {

		return studentRepository.save(student);
	}

	@Override
	public String getStudent(long l) {

		return "where did it bought to you " + studentRepository.findById(l);
	}

	@Override
	public String deleteStudent(long l) {
		// TODO Auto-generated method stub
		Optional<Student> student = studentRepository.findById(l);

		if (student.isPresent()) {
			return "hehehe i'm present" + student;
		}
		return "he dose'nt e";
		// throw new RuntimeException("employee does not exist");

	}

	@Override
	public String updateStudent(Student student) {
		studentRepository.save(student);
		return null;
	}

	@Override
	public List<Student> findByName(String name) {

		// Optional<ArrayList<Student>>s= studentRepository.findByStudentName(name);
		System.out.println(studentRepository.findByStudentName(name));
		return studentRepository.findByStudentName(name);

	}

	@Override
	public List<Student> findStudentByNameAndSurname(String name, String surname) {

		return studentRepository.findByStudentNameAndStudentSurname(name, surname);
	}

	@Override
	public List<Student> findByStudentNameContaining(String cont) {

		return studentRepository.findByStudentNameContaining(cont);
	}

}
