package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "dept_info")
@AllArgsConstructor
@NoArgsConstructor
public class Department {
	@Id
	private int deptno;
	private String deptName;
	private String deptLocation;
}
