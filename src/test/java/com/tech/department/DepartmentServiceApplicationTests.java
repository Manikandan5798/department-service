package com.tech.department;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tech.department.model.Department;
import com.tech.department.repository.DepartmentRepository;

@SpringBootTest
class DepartmentServiceApplicationTests {

	@Autowired
	DepartmentRepository deptRepo;
	
	@Test
	public void saveDepartment() {
		
	
		Department dept = new Department();
		dept.setDepartmentId(1L);
		dept.setDepartmentName("IT");
		dept.setDepartmentAddress("CCC");
		dept.setDepartmentCode("IT-05");
		deptRepo.save(dept);
		assertThat(dept.getDepartmentId()).isGreaterThan(0);
	}

}
