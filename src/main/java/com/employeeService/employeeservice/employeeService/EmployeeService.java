package com.employeeService.employeeservice.employeeService;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.employeeService.employeeservice.entity.Address;
import com.employeeService.employeeservice.entity.Course;
import com.employeeService.employeeservice.entity.Department;
import com.employeeService.employeeservice.entity.Employee;
import com.employeeService.employeeservice.repository.CourseRepository;
import com.employeeService.employeeservice.repository.DepartmentRepository;
import com.employeeService.employeeservice.repository.EmployeeRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	DepartmentRepository departmentRepository;
	
	@Autowired
	CourseRepository courseRepository;
	
	public Employee addEmployee( Employee employee) {
		
		if(employee.getDepartment()!=null) {                                                           //(if) this 4 line for many to one 
			Department existingDepartment=departmentRepository.findByName(employee.getDepartment().getName());
			
			if(existingDepartment!=null) {
				employee.setDepartment(existingDepartment);
			}
		}
		
		if(employee.getCourses().size()>0) {
			List<Course> newCourse= new ArrayList<Course>();
			for(Course course:employee.getCourses()) {
				Course existingCourse = courseRepository.findByname(course.getName());
			}
			if(existingCourse !=null) {
				newCourse.add(existingCourse)
			}
			else {
				newCourse.add(course);
			}
			employee.setCourses(newCourse);
		}
		return employeeRepository.save(employee);
	}

	public Employee getEmployee(Long id) {
		return employeeRepository.findById(id).orElse(null);
	}
	
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}
	
	public String GetDeleteEmployee(Long id) {
		employeeRepository.deleteById(id);
		return"employee deleted succesfully";
	}
	public Employee updateEmployee(Long id,Employee employee) {
		employee.setId(id);
		Optional<Employee> empOpt=employeeRepository.findById(id);
		if(!empOpt.isPresent()) {
			throw new EntityNotFoundException("Employee with ID"+id+"not found");
		}
		
		Employee existingEmployee=empOpt.get();
		
		if(employee.getName()==null) {
			employee.setName(existingEmployee.getName());
		}
		if(employee.getAddress()==null) {
			employee.setAddress(existingEmployee.getAddress());
		}
		else {
			Address newAddress =employee.getAddress();
			
			newAddress.setId(existingEmployee.getAddress().getId());
			employee.setAddress(newAddress);
		}
		return employeeRepository.save(employee);
	}
	
}
