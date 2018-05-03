package com.isaac.restimplementation.restfulwebservices.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerResource {

	@Autowired
	private CustomerDaoService customerDaoService;
	
	@GetMapping("/customers")
	public List<Customer> retriveAllCustomer(){
		
		return customerDaoService.findAll();
	}
	
	@GetMapping("/customers/{customerId}")
	public Customer retriveCustomer(@PathVariable int customerId){
		
		return customerDaoService.findOne(customerId);
	}
	
}
