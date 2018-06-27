package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Customer;
import com.example.demo.services.CustomerService;

@RestController
public class WelcomeController {

	@Autowired
	CustomerService service;
	
	@GetMapping("/kpit/api/welcome")
	public String m1()
	{
		return "Welcome to the world of Spring boot!!";
	}
	
	@GetMapping("/kpit/api/addCustomer")
	public String m2()
	{
		Customer customer = new Customer("ganesh","ganesh@kpit.com", 22);
		service.saveCustomer(customer);
		return "Customer saved";
	}
	
	@GetMapping("/kpit/api/getCustomer/{id}")
	public String m3(@PathVariable("id") int id)
	{
		return "Customer : "+service.findById(id);
	}
	
	@GetMapping("/kpit/api/getAllCustomers")
	public String m4()
	{
		return "Customer : "+service.findAll();
	}
	
	@GetMapping("/kpit/api/removeCustomer/{id}")
	public String m5(@PathVariable("id") int id)
	{
		service.removeCustomerById(id); 
		return "customer removed";
	}	
}
