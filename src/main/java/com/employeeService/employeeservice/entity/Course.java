package com.employeeService.employeeservice.entity;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonBackReference;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;


@Entity
@Table(name="course")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	@ManyToMany(mappedBy = "courses")
	@JsonBackReference
	private ArrayList<Employee>employeeList;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(Long id, String name, ArrayList<Employee> employeeList) {
		super();
		this.id = id;
		this.name = name;
		this.employeeList = employeeList;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(ArrayList<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	
	
}
