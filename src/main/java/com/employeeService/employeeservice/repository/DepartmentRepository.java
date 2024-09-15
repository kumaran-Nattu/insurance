package com.employeeService.employeeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employeeService.employeeservice.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

	public Department findByName(String name);
}
