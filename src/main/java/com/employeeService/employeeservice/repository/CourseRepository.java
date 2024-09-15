package com.employeeService.employeeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employeeService.employeeservice.entity.Course;
import com.employeeService.employeeservice.entity.Department;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{

	public Course findByName(String name);
}
