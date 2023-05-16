package com.tech.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.department.model.Department;
import com.tech.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {

	
	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		
		return departmentRepository.save(department);
	}

	public Department findDepartmentById(Long departmentId) {
       // log.info("Inside saveDepartment of DepartmentService");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
