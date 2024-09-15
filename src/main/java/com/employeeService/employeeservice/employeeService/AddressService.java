package com.employeeService.employeeservice.employeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeService.employeeservice.entity.Address;
import com.employeeService.employeeservice.repository.AddressRepository;

@Service
public class AddressService {

	
@Autowired
AddressRepository addressRepository;

public Address getAddress(Long id) {
	return addressRepository.findById(id).orElse(null);
}
}
