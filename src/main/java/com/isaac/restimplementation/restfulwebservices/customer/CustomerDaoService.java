package com.isaac.restimplementation.restfulwebservices.customer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class CustomerDaoService {

	private static List<Customer> customers=new ArrayList<Customer>();
	//private static int count=3;
	
	static {
		customers.add(new Customer(1,"Issac"));
		customers.add(new Customer(2,"Jay"));
	}
	
	public List<Customer> findAll(){
		return customers;
		
	}
	
	public Customer findOne(int customerId) {
		
		for (Customer customer:customers) {
			
			if(customer.getCustomerId()==customerId) {
				return customer;
			}
		}
		return null;
	}
}
