package com.example.demo.dto;

import java.util.List;

import com.example.demo.model.Department;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDTO {
	private Department dept;
	private List<EmployeeDTO> emps;
}
