package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeService {

	public abstract Employee createEmployee(Employee employee);

	public abstract List<Employee> getEmployees();

	public abstract Employee getEmployee(int empId);

	public abstract EmployeeInfo getByDeptNo(int deptno);
}
