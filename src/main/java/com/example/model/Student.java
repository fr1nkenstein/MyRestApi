package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private long studentId;
	@NotEmpty(message = "student name should not be null")

	private String studentName;
	private String studentSurname;
	private String location;
	@NotEmpty
	@Email
	private String email;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(long studentId, String studentName, String studentSurname, String location, String email) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentSurname = studentSurname;
		this.location = location;
		this.email = email;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentSurname() {
		return studentSurname;
	}

	public void setStudentSurname(String studentSurname) {
		this.studentSurname = studentSurname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentSurname=" + studentSurname
				+ ", location=" + location + ", email=" + email + "]";
	}

}
