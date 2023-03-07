package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;
import com.example.service.StudentService;

import jakarta.validation.Valid;

@RestController
public class StudentRestController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/students")
	public List<Student> listofStudents() {
		return studentService.allStudent();

	}

	@GetMapping("/student")
	public String student(@RequestParam("id") long id) {
		return "here is the request student" + studentService.getStudent(id);

	}

	@DeleteMapping("/student")
	public ResponseEntity<String> deletStudent(@RequestParam("id") long id) {

		return new ResponseEntity<String>("okkk this is the thing" + studentService.deleteStudent(id), HttpStatus.OK);

	}

	@PostMapping("student")
	public String saveStudent(@Valid @RequestBody Student student) {
		return "saved student is " + studentService.saveStudent(student);

	}

	@PutMapping("student")
	public String updqateStudent(@RequestParam("id") long id, @RequestBody Student student) {
		student.setStudentId(id);
		return "saved" + studentService.saveStudent(student);
	}

	@GetMapping("student/findbyname")
	ResponseEntity<List<Student>> findByName(@RequestParam("name") String name) {
		return new ResponseEntity<List<Student>>(studentService.findByName(name), HttpStatus.OK);
	}

}
