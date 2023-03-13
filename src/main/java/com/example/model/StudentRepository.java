package com.example.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	List<Student> findByStudentName(String name);

	List<Student> findByStudentNameAndStudentSurname(String name, String surnaname);

	List<Student> findByStudentNameContaining(String cont);

	// List<Student> findAllStudentNameContaining(String cont, Sort sort);

}
