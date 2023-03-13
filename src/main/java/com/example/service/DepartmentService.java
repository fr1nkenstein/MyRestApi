package com.example.service;

import org.springframework.stereotype.Service;

import com.example.model.Department;

@Service
public interface DepartmentService {
	Department saveDepartment(Department dep);
}
