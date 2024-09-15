package com.employeeService.employeeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employeeService.employeeservice.entity.Address;
import com.employeeService.employeeservice.entity.Employee;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{

}
