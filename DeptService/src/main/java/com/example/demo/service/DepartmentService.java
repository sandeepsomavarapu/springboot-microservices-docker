package com.example.demo.service;

import com.example.demo.dto.DepartmentDTO;
import com.example.demo.model.Department;

public interface DepartmentService {

	public abstract Department saveDept(Department dept);

	public abstract DepartmentDTO getDeptInfo(int deptno);

}
