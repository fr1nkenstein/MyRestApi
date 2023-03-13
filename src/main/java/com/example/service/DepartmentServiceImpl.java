package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Department;
import com.example.model.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	private DepartmentRepository deprep;

	@Override
	public Department saveDepartment(Department dep) {

		return deprep.save(dep);
	}

}
