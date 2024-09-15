package com.employeeService.employeeservice.entity;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.AssertFalse.List;


@Entity

@Table(name="department")
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	
    @ManyToOne(mappedBy="department")
	@JsonBackReference
	private ArrayList<Employee> employee;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(Long id, String name, ArrayList<Employee> employee) {
		super();
		this.id = id;
		this.name = name;
		this.employee = employee;
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

	public ArrayList<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(ArrayList<Employee> employee) {
		this.employee = employee;
	}
	

}
