package com.example.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.dto.EmployeeInfo;

@FeignClient(name = "EMPLOYEESERVICE")
public interface EmployeeClient {
	@GetMapping("/emps/getByDept/{deptno}")
	public EmployeeInfo getByDeptno(@PathVariable int deptno);

}
