package com.employeeService.employeeservice.employeeController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeeService.employeeservice.employeeService.AddressService;
import com.employeeService.employeeservice.entity.Address;

@RestController
@RequestMapping("/api")
public class AddressController {
	
	@Autowired
	AddressService addressService;
	
	@GetMapping("/getAddress/id")
	public Address getAddress(@PathVariable Long id) {
		return addressService.getAddress(id);
	}

}
