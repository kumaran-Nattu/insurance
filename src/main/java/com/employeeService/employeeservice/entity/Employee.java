package com.employeeService.employeeservice.entity;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.AssertFalse.List;

@Entity
@Table(name = "employee_details")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JsonManagedReference
	private Address address;
	
	@OneToMany(cascade = CascadeType.ALL)
	private ArrayList<Project> projectList;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JsonManagedReference
	private Department department;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private ArrayList<Course> Courses;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Long id, String name, Address address, ArrayList<Project> projectList, Department department,
			ArrayList<Course> courses) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.projectList = projectList;
		this.department = department;
		Courses = courses;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public ArrayList<Project> getProjectList() {
		return projectList;
	}

	public void setProjectList(ArrayList<Project> projectList) {
		this.projectList = projectList;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public ArrayList<Course> getCourses() {
		return Courses;
	}

	public void setCourses(ArrayList<Course> courses) {
		Courses = courses;
	}

}
