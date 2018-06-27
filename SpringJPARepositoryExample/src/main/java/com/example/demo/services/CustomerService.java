package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Customer;

public interface CustomerService {

	public void saveCustomer(Customer customer);
	
	public Customer findById(int id);
	
	public List<Customer> findAll();
	
	public void removeCustomerById(int id);
	
}
