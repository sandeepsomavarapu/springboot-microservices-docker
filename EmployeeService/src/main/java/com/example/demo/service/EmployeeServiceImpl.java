package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepo;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

	EmployeeRepo repo;

	@Override
	public Employee createEmployee(Employee employee) {

		return repo.save(employee);
	}

	@Override
	public List<Employee> getEmployees() {

		return repo.findAll();
	}

	@Override
	public Employee getEmployee(int empId) {

		return repo.findById(empId).get();
	}

	@Override
	public EmployeeInfo getByDeptNo(int deptno) {
		List<Employee> emps=repo.findByDeptno(deptno);
		EmployeeInfo dto=new EmployeeInfo();
			dto.setEmps(emps);
		return dto;
	}

}
