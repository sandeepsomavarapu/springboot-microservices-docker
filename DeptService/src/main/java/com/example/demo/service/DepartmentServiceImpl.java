	package com.example.demo.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.dto.DepartmentDTO;
import com.example.demo.dto.EmployeeInfo;
import com.example.demo.model.Department;
import com.example.demo.repo.DeptRepo;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

	DeptRepo repo;
	EmployeeClient employeeClient;

//	RestTemplate restTemplate;// sync

	@Override
	public Department saveDept(Department dept) {
		return repo.save(dept);
	}

	@Override
	public DepartmentDTO getDeptInfo(int deptno) {
		Optional<Department> optional = repo.findById(deptno);
		Department dept = optional.get();

//		EmployeeInfo emps = restTemplate.getForObject("http://localhost:8081/emps/getByDept/" + deptno,
//				EmployeeInfo.class);

		EmployeeInfo emps = employeeClient.getByDeptno(deptno);
		DepartmentDTO deptDto = new DepartmentDTO(dept, emps.getEmps());
		return deptDto;
	}

}
