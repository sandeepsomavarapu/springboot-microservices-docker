package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

import lombok.Data;

@Data
public class EmployeeInfo {
	private List<Employee> emps;
}
