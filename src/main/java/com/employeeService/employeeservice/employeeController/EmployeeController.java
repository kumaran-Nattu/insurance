package com.employeeService.employeeservice.employeeController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeeService.employeeservice.employeeService.EmployeeService;
import com.employeeService.employeeservice.entity.Employee;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/add1")
	public Employee addEmploye(@RequestBody Employee employee ) {
		return employeeService.addEmployee(employee);
	}
	
	@GetMapping("/get/{id}")  
	public Employee getEmploye(@PathVariable Long id) {
		return employeeService.getEmployee(id);
	}
	
	@GetMapping("/getall")
	public List<Employee> getEmployeeDetails() {
		return employeeService.getAllEmployees();
	}
	
	@DeleteMapping("/remove/{id}")
	public String getDelete(@PathVariable Long id) {
		return employeeService.GetDeleteEmployee(id);	
	}
	
	@PutMapping("/update/{id}")
	public Employee updateEmploye(@PathVariable Long id,@RequestBody Employee employee) {
		return employeeService.updateEmployee(id, employee);
	}
	
	
	
	
}
